package fundamentals.regex;

public class Regex {

    public static void main(String[] args) {

        String test = "T";
        System.out.println(test.matches("."));

        String test2 = "This is a test";
        System.out.println(test2.matches(".*"));
        System.out.println("".matches(".*"));

        String testPhone = "This is a phone number 07200608972221 fgvdfg";
        String phoneSentenceMatcher = ".*\\s(\\d{10,10}).*";
        String phoneReplacer = "\\d{10,13}";
        System.out.println(testPhone.matches(phoneSentenceMatcher));
        System.out.println(testPhone.replaceAll(phoneReplacer, "0000000000000"));

        System.out.println(testPhone.replaceAll(phoneSentenceMatcher, "$1"));




        String text = "This is my email: danginkgo@yahoo.com. " +
                "Send me an email or call me at 0720-060897.";

        printEmail(text);

        printPhone(text);
    }

    public static void printEmail(String text) {
        System.out.println(text.replaceAll(
                "^.*\\s(\\w+@\\w+\\.\\w+)\\..*$",
                "\nEmail: $1"));
    }

    public static void printPhone(String text) {
        System.out.println(text.replaceAll(
                "^.*\\s(\\d{4,}-\\d{6,})\\.$",
                "\nPhone: $1"));
    }


}
