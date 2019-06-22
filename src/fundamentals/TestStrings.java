package fundamentals;

public class TestStrings {

    public static void main(String[] args) {

        String allLetters = new String("The quick brown fox jumps over the lazy dog.");

        System.out.println(allLetters);

        allLetters = allLetters.concat(" Lorem ipsum dolor sit amet.");

        System.out.println(allLetters);
    }
}
