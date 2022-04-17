package personal.ivan.leetcode;

public class EcxellRepresentation {
    static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String convertToTitle(int columnNumber) {
        String result="";
        while(columnNumber>0)
        {
            // System.out.println(columnNumber);
            if(columnNumber%26==0)
            {
                result+='Z';
                columnNumber = columnNumber/26-1;
            }
            else {
                result += alpha.charAt(columnNumber % 26 - 1);
                columnNumber  = columnNumber/26;
            }
        }
        StringBuilder sb = new StringBuilder(result);
        return sb.reverse().toString();
    }
}
