package br.com.syonet.x.model.lead;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;

import br.com.syonet.x.model.StringDef;

@StringDef( { LeadPortal.ENKONTRA, LeadPortal.WEBMOTORS, LeadPortal.CARROBRASIL, LeadPortal.SOCARRAO,
        LeadPortal.BLUCARROS, LeadPortal.SEMINOVOSBH, LeadPortal.ICARROS, LeadPortal.CLICARSEMINOVOS,
        LeadPortal.LITORALCAR, LeadPortal.OLX, LeadPortal.FAROLAUTOS, LeadPortal.TEMUSADOS, LeadPortal.LEVO,
        LeadPortal.AUTOLINE, LeadPortal.AUTOCARRO, LeadPortal.CARROCAMP, LeadPortal.MEUCARRONOVO, LeadPortal.OBUSCA,
        LeadPortal.POACARROS, LeadPortal.MEUCARANGO, LeadPortal.FLORIPACARROS, LeadPortal.VRUM, LeadPortal.USADOSBR,
        LeadPortal.AUTOSCAR, LeadPortal.CLASSIIMOVEIS, LeadPortal.MERCADOLIVRE, LeadPortal.LOOCALIZEI,
        LeadPortal.NEW_WEBMOTORS, LeadPortal.SITE_GM, LeadPortal.SOCARRAOLEADSTATION, LeadPortal.GRUPOZAPVIVAREAL,
        LeadPortal.MOBIAUTO, LeadPortal.VALHO, LeadPortal.VALHOAGENDAMENTO, LeadPortal.FORMCONTATO,
        LeadPortal.SITEVEMIGFORMFINANCIAMENTO, LeadPortal.SITEVEMIGFORMPROPOSTA } )
@Retention( RetentionPolicy.SOURCE )
public @interface LeadPortal {
    String ENKONTRA = "ENKONTRA";
    String WEBMOTORS = "WEBMOTORS";
    String CARROBRASIL = "CARROBRASIL";
    String SOCARRAO = "SOCARRAO";
    String BLUCARROS = "BLUCARROS";
    String SEMINOVOSBH = "SEMINOVOSBH";
    String ICARROS = "ICARROS";
    String CLICARSEMINOVOS = "CLICARSEMINOVOS";
    String LITORALCAR = "LITORALCAR";
    String OLX = "OLX";
    String FAROLAUTOS = "FAROLAUTOS";
    String TEMUSADOS = "TEMUSADOS";
    String LEVO = "LEVO";
    String AUTOLINE = "AUTOLINE";
    String AUTOCARRO = "AUTOCARRO";
    String CARROCAMP = "CARROCAMP";
    String MEUCARRONOVO = "MEUCARRONOVO";
    String OBUSCA = "OBUSCA";
    String POACARROS = "POACARROS";
    String MEUCARANGO = "MEUCARANGO";
    String FLORIPACARROS = "FLORIPACARROS";
    String VRUM = "VRUM";
    String USADOSBR = "USADOSBR";
    String AUTOSCAR = "AUTOSCAR";
    String CLASSIIMOVEIS = "CLASSIIMOVEIS";
    String MERCADOLIVRE = "MERCADOLIVRE";
    String LOOCALIZEI = "LOOCALIZEI";
    String NEW_WEBMOTORS = "New_WebMotors";
    String SITE_GM = "Site_GM";
    String SOCARRAOLEADSTATION = "SOCARRAOLEADSTATION";
    String GRUPOZAPVIVAREAL = "GRUPOZAPVIVAREAL";
    String MOBIAUTO = "MOBIAUTO";
    String VALHO = "VALHO";
    String VALHOAGENDAMENTO = "VALHOAGENDAMENTO";
    String FORMCONTATO = "FORMCONTATO";
    String SITEVEMIGFORMFINANCIAMENTO = "SITEVEMIGFORMFINANCIAMENTO";
    String SITEVEMIGFORMPROPOSTA = "SITEVEMIGFORMPROPOSTA";

    Map< String, String > NAMES = new HashMap< String, String >() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
        put( LeadPortal.ENKONTRA, "Enkontra" );
        put( LeadPortal.WEBMOTORS, "Webmotors" );
        put( LeadPortal.CARROBRASIL, "Carro Brasil" );
        put( LeadPortal.SOCARRAO, "SóCarrão" );
        put( LeadPortal.BLUCARROS, "Blu Carros" );
        put( LeadPortal.SEMINOVOSBH, "Seminovos BH" );
        put( LeadPortal.ICARROS, "iCarros" );
        put( LeadPortal.CLICARSEMINOVOS, "Clicar Seminovos" );
        put( LeadPortal.LITORALCAR, "LitoralCar" );
        put( LeadPortal.OLX, "OLX" );
        put( LeadPortal.FAROLAUTOS, "Farol Autos" );
        put( LeadPortal.TEMUSADOS, "Temusados" );
        put( LeadPortal.LEVO, "Levo" );
        put( LeadPortal.AUTOLINE, "Autoline" );
        put( LeadPortal.AUTOCARRO, "Autocarro" );
        put( LeadPortal.CARROCAMP, "Carro Camp" );
        put( LeadPortal.MEUCARRONOVO, "Meu Carro Novo" );
        put( LeadPortal.OBUSCA, "OBusca" );
        put( LeadPortal.POACARROS, "PoaCarros" );
        put( LeadPortal.MEUCARANGO, "Meu Carango" );
        put( LeadPortal.FLORIPACARROS, "FloripaCarros" );
        put( LeadPortal.VRUM, "Vrum" );
        put( LeadPortal.USADOSBR, "UsadosBR" );
        put( LeadPortal.AUTOSCAR, "Autoscar" );
        put( LeadPortal.CLASSIIMOVEIS, "Classi Imóveis" );
        put( LeadPortal.MERCADOLIVRE, "Mercado Livre" );
        put( LeadPortal.LOOCALIZEI, "Loocalizei" );
        put( LeadPortal.NEW_WEBMOTORS, "New WebMotors" );
        put( LeadPortal.SITE_GM, "Site GM" );
        put( LeadPortal.SOCARRAOLEADSTATION, "SóCarrão" );
        put( LeadPortal.GRUPOZAPVIVAREAL, "Grupo zap - VivaReal" );
        put( LeadPortal.MOBIAUTO, "Mobiauto" );
        put( LeadPortal.VALHO, "Valho" );
        put( LeadPortal.VALHOAGENDAMENTO, "Valho - Agendamento" );
        put( LeadPortal.FORMCONTATO, "Site WebMotors - Form Contato" );
        put( LeadPortal.SITEVEMIGFORMFINANCIAMENTO, "Site WebMotors - Form Financiamento" );
        put( LeadPortal.SITEVEMIGFORMPROPOSTA, "Site WebMotors - Form Proposta" );
    }};
}