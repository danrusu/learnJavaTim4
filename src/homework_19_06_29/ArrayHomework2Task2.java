package homework_19_06_29;

// Solving task 2 from
// https://github.com/danrusu/learnJavaTim4/blob/master/Resource/fundamentals/array_homework2.md
public class ArrayHomework2Task2 {

    public static void main(String[] args) {
        String[] first = {"We", "are", "coding", "daily"};
        String[] second = new String[]{"to", "become", "better", "developers"};

        String[] all = new String[first.length + second.length];
        // add all elements from first
        for (int i = 0; i < first.length; i++) {
            all[i] = first[i];
        }
        // add all elements from second
        for (int i = 0; i < second.length; i++) {
            all[first.length + i] = second[i];
        }

        printArray(all);
    }

    public static void printArray(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
    }
}
