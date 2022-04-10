public class OccuranceInString {
    public static void main(String[] args) {
        System.out.println(strStr("fadbsss", "ad"));
    }
    public static int strStr(String haystack, String needle)
    {
        if(haystack.length()==0)
            return 0;
        else if(haystack.contains(needle))
            return haystack.indexOf(needle);
        else
            return  -1;

    }
}
