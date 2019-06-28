package arrays;

public class StringArrayTest {

    public static void main(String[] args) {

        String[] messages = {"hello", "hi", "bye"};

        // number of elements in array
        System.out.println("Messages length: " + messages.length);

        // elements in array, accessed by indices
        System.out.println("\nGet elements by index:");
        System.out.println("messages[0]: " + messages[0]);
        System.out.println("messages[1]: " + messages[1]);
        System.out.println("messages[2]: " + messages[2]);

        System.out.println("\nGet elements programmatically in loop and print UpperCase of each element:");
        for (int i = 0; i < messages.length; i++) {
            System.out.print("Index: " + i + "; Element value: ");
            String currentMessage = messages[i];
            System.out.println(currentMessage.toUpperCase());
        }

        System.out.println("\nPrint all array elements on one line separated by space:");
        for (int i = 0; i < messages.length; i++) {
            System.out.print(messages[i] + " ");
        }
    }
}
