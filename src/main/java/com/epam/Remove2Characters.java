package com.epam;

public class Remove2Characters {
    public static String remove(String string){
        String result = string.toUpperCase();

        if(string.length() <= 2) {
            StringBuilder newStr = new StringBuilder();
            for( int i = 0 ; i< result.length() ; i++)
                if (result.charAt(i) != 'A')
                    newStr.append(result.charAt(i));
            result = newStr.toString();
        } else {
            String fc = result.charAt(0) == 'A' ? "" : result.charAt(0) + "" ;
            String sc = result.charAt(1) == 'A' ? "" : result.charAt(1) + "" ;
            result = fc + sc + result.substring(2);
        }
        return result;
    }
}
