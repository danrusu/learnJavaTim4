package arrays;

public class StringArrayTest {
    public static void main(String[] args) {
        String[] messages = {"hello", "hi", "bye"};
        System.out.println("Messages length: " + messages.length);

        System.out.println("messages[0]: " + messages[0]);
        System.out.println("messages[1]: " + messages[1]);
        System.out.println("messages[2]: " + messages[2]);


        System.out.println("Get values in loop:");
        for (int i = 0; i < messages.length; i++) {

            System.out.print("Index: " + i + " ");
            String currentMessage = messages[i];
            System.out.println(currentMessage.toUpperCase());
        }
    }
}
