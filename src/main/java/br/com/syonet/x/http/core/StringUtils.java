package br.com.syonet.x.http.core;

import java.util.Iterator;

public class StringUtils {
	public static boolean isEmpty( String str ) {
		return str == null || str.trim().isEmpty();
	}
    public static String join(CharSequence delimiter, Iterable<String> tokens) {
        final Iterator<?> it = tokens.iterator();
        if (!it.hasNext()) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(it.next());
        while (it.hasNext()) {
            sb.append(delimiter);
            sb.append(it.next());
        }
        return sb.toString();
    }

}
