package br.com.syonet.x.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


public class DateISOUtils {
	
	private DateISOUtils() { }
	
    private static final SimpleDateFormat ISO8601_DATE_FORMAT = createUTCDateFormat();

    private static SimpleDateFormat createUTCDateFormat () {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault() );
        simpleDateFormat.setTimeZone( TimeZone.getTimeZone( "UTC" ) );
        return simpleDateFormat;
    }

    public static String fromDate ( Date date ) {
        if ( date == null ) {
            return null;
        }

        String formattedDate = ISO8601_DATE_FORMAT.format( date );

        //como a classe Instant do servidor não trabalha com timezone, remove essa informação
        return formattedDate.substring( 0, 23 ) + "Z";
    }

    public static Date toDate ( String iso8601Str ) {
        if ( iso8601Str == null || iso8601Str.trim().equals("") ) {
            return null;
        }

        String dateStr = formatServerIsoDateToAppPattern( iso8601Str );

        try {
            return ISO8601_DATE_FORMAT.parse( dateStr );
        } catch ( Exception e ) {
            throw new RuntimeException( "Invalid date format: " + dateStr );
        }
    }

    /**
     * Formata a data ISO 8601 do servidor para o padrão utilizado pelo app.
     * <p>
     * O servidor envia datas de N maneiras diferentes:
     * <pre>
     * {@code
     *
     * - Com o timezone Z:
     *   - Com 3 algarismos nos milisegundos - yyyy-MM-dd'T'HH:mm:ss.SSSZ
     *   - Com apenas 2  algarismos de milisegundos - yyyy-MM-dd'T'HH:mm:ss.SSZ
     *   - Sem milisegundos - yyyy-MM-dd'T'HH:mm:ssZ
     * - Com o timezone +00:00:
     *   - Com 3 algarismos nos milisegundos - yyyy-MM-dd'T'HH:mm:ss.SSS+00:00
     *   - Com apenas 2  algarismos de milisegundos - yyyy-MM-dd'T'HH:mm:ss.SS+00:00
     *   - Sem milisegundos - yyyy-MM-dd'T'HH:mm:ss+00:00
     * }
     * </pre>
     * Como o servidor não consegue padronizar para enviar no formato utilizado pelo app,
     * todos os apps precisam validar o formato :)
     *
     * @param iso8601Str data no formato ISO 8601 sem padrão
     * @return data no formato ISO 8601 padronizada (yyyy-MM-dd'T'HH:mm:ss.SSS+0000)
     */
    private static String formatServerIsoDateToAppPattern ( String iso8601Str ) {
        String dateStr;

        if ( iso8601Str.length() == 25 ) {
            //adiciona milisegundos
            dateStr = iso8601Str.substring( 0, 19 ) + ".000" + iso8601Str.substring( 19 );
        } else {
            //adiciona timezone +00:00
            String timezoneReplacement = "+00:00";
            if ( iso8601Str.length() == 20 ) {
                //adiciona milisegundos
                timezoneReplacement = ".000" + timezoneReplacement;
            }
            //substitui Z por .000+00:00 ou +00:00, conforme necessário
            dateStr = iso8601Str.replace( "Z", timezoneReplacement );
        }

        if ( dateStr.length() == 28 ) {
            //adiciona terceiro algarismo nos milisegundos
            dateStr = dateStr.substring( 0, 22 ) + "0" + dateStr.substring( 22 );
        }

        // remove o ":"
        dateStr = dateStr.substring( 0, 26 ) + dateStr.substring( 27 );

        //data formato yyyy-MM-dd'T'HH:mm:ss.SSS+0000
        return dateStr;
    }
}
