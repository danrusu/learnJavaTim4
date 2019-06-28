package fundamentals.strings;

// String is immutable!!!
// String methods return new strings rather than modifying the actual string value.
public class TestStrings {

    public static void main(String[] args) {

        String allLetters = new String("The quick brown fox jumps over the lazy dog.");
        String textFiller = " Lorem ipsum dolor sit amet.";
        System.out.println("Initial strings:");
        System.out.println(allLetters);
        System.out.println(textFiller);

        // add text to allLeters - THE WRONG WAY
        System.out.println("\nTry to change allLetters");
        allLetters.concat(textFiller);
        System.out.println(allLetters);

        // add text to allLeters
        System.out.println("\nChange allLetters");
        allLetters = allLetters.concat(textFiller); // assign new value to allLetters
        System.out.println(allLetters);

    }
}
