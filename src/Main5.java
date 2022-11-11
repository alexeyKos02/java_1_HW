public class Main5 {
    public static void main(String[] args){
        String str = "alexey is cool";
        var arrStr = str.split(" ");
        int allCount = 0;
        int vowels = 0;
        int consonants = 0;
        for (var st : arrStr){
            allCount+=st.length();
            vowels+=st.replaceAll("(?i)[^aeiouy]", "").length();
        }
        consonants=allCount-vowels;
        System.out.println(allCount);
        System.out.println(consonants);
        System.out.println(vowels);
    }
}
