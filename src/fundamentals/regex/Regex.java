package fundamentals.regex;

public class Regex {

    public static void main(String[] args) {

      String text = "This is my email: danginkgo@yahoo.com. " +
              "Send me an email or call me at 0720-060897.";

        printEmail(text);

        printPhone(text);
    }

    public static void printEmail(String text){
        System.out.println(text.replaceAll(
                "^.*\\s(\\w+@\\w+\\.\\w+)\\..*$",
                "\nEmail: $1"));
    }

    public static void printPhone(String text){
        System.out.println(text.replaceAll(
                "^.*\\s(\\d{4,}-\\d{6,})\\.$",
                "\nPhone: $1"));
    }

}
