package utils;

public class StringUtils {
    public static String toTitleCase(String str){
        String arStr[]=str.split(" ");
        String fullLine="";
        for(int i=0;i<arStr.length;i++){
            fullLine=fullLine+arStr[i].substring(0,1).toUpperCase()+arStr[i].substring(1).toLowerCase()+" ";
        }
        return fullLine;
    }
    public static String getTuCuoiCuaString(String str){
        if (str.trim().lastIndexOf(" ")>=0){
            return str.substring(str.lastIndexOf(" ")+1);
        } return str;
    }
    public static String removeSpaces(String s){
        String r="";
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=' '){
                r=r+s.charAt(i);
            }
        } return r;
    }
    public static String removeMultipleSpaces(String s){
        s=s.trim();
        String r="";
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '&&s.charAt(i+1)==' '){
                i++;
            }
            r=r+s.charAt(i);
        }
        return r;
    }
//    public static String containsOnlyDigits(String s){
//        for (int i=0;i<s.length();i++){
//            if (s.charAt()){
//
//            }
//        }
//    }
}
