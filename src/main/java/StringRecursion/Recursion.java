package StringRecursion;

public class Recursion {

    public static void main(String[] args) {

        String test = "Piotrek lubi kawę z mlekiem";

        System.out.println(test);
        System.out.println(rev(test));

    }

    public static String rev(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            String lastLetter = str.substring(str.length() - 1);
            String wordWithoutLastLetter = str.substring(0, str.length() - 1);
            return lastLetter + rev(wordWithoutLastLetter);
        }
    }

}
