package homework_19_06_29;

// Solving task 1 from
// https://github.com/danrusu/learnJavaTim4/blob/master/Resource/fundamentals/array_homework2.md
public class ArrayHomework2Task1 {

    public static void main(String[] args) {
        print(createArray(0));
        print(createArray(-5));
        print(createArray(7));
    }

    public static void print(int[] numbers){
        System.out.print("\n[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        if(numbers.length > 0) {
            // remove last added space
            System.out.print("\b");   // '\b' is backspace character
        }
        System.out.print("]");
    }

    public static int[] createArray(int number){
        if (number <= 0){
            return new int[]{};
        }

        int[] numbersArray = new int[number];
        for (int i = 0; i < number; i++) {
            numbersArray[i] = number - i;
        }
        return numbersArray;
    }
}
