import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        1st task
        String word1 = "Hello";
        String word2 = "World";
        String name = "John";
        String lastName = "Doe";
        String faculty = "Mathematics";
        String format = String.format("%s %s", word1, word2);
        System.out.println(word1 + " " + word2);
        System.out.println(word1.concat(" " + word2));
        System.out.println(format);
        System.out.println(f("%s %s", word1, word2));
        System.out.println(f("Student: %s %s %s", name, lastName, faculty));
////        2nd task
        String word3 = "Concatenation";
        System.out.println(word3.substring(5,7));
////        4th task
        System.out.println(reverseString("tenet"));
        System.out.println(phoneTest("380995689856"));
        System.out.println(phoneTest("+380995689856"));

    }
    public static String f(String target, String... args) {
        return String.format(target, args);
    }
//    4th task
    public static boolean reverseString(String str) {
        String palindrome = new StringBuilder(str).reverse().toString();
        return str.equals(palindrome);
    }
    public static boolean phoneTest(String target) {
        Pattern pattern = Pattern.compile("^\\+380\\d{9}$");
        Matcher matcher = pattern.matcher(target);
        return matcher.matches();
    }
}