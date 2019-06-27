package homework_19_06_29;

// Solving tasks from
// https://github.com/danrusu/learnJavaTim4/blob/master/Resource/fundamentals/array_homework1.md
public class ArrayHomework1 {

    public static void main(String[] args) {
        // #1
        int[] numbers = {1, 7, 25, 4, 19, 15, 42, 5};
        //int[] numbers = new int[]{1, 7, 25, 4, 19, 15, 42, 5};\
        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // #2
        System.out.print("\nMultiples of 5: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        // #3
        System.out.print("\nFirst multiple of 5: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 != 0) {
                System.out.print(numbers[i] + " ");
                break;
                // or force loop end
                // i = numbers.length;
            }
        }

        // #4
        System.out.print("\nLast multiple of 5: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 5 == 0) {
                System.out.print(numbers[i] + " ");
                break;
            }
        }

        // #5
        System.out.print("\nNot multiple of 5: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
