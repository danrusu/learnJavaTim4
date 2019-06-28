package fundamentals.arrays;

public class ArrayMinMaxAndVarargs {

    public static void main(String[] args) {

        int[] numbers = new int[]{
                2, 5, 787, 4, -3,
                8, 76, -4, -22, 33,
                8, 90, 7, -45, 31,
        };

        ArraysTest.printArray(numbers);

        printNegative(numbers);
        printBiggerThan(numbers, 0);

        // min/max for int type
        System.out.println("\nInteger MIN: " + Integer.MIN_VALUE);
        System.out.println("Integer MAX: " + Integer.MAX_VALUE);


        System.out.println("MIN: " + getMin(numbers));
        // System.out.println("MIN: " + getMin()); // does not work
        // System.out.println("MIN: " + getMin(5, 1, 3)); // does not work

        // varargs - you can pass - an array, a list of comma separated values, or no parameter
        System.out.println("MAX: " + getMax(numbers));
        System.out.println("MAX: " + getMax(5, 1, 3));
        System.out.println("MAX no arguments (will throw): " + getMax());
    }

    public static void printNegative(int[] numbers) {
        System.out.print("Negative: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0){
                System.out.print(numbers[i] + ", ");
            }
        }
    }

    public static void printBiggerThan(int[] numbers, int lowerLimit) {
        System.out.print("\nBigger above " + lowerLimit + ": ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > lowerLimit){
                System.out.print(numbers[i] + ", ");
            }
        }
    }

    public static int getMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            int currentNumber = numbers[i];

            if (min > currentNumber) {
                min = currentNumber;
            }
        }
        return min;
    }

    // varargs
    // internally, `numbers` parameter is seen as an array
    // check the calls of geMax in the `main` function to see differences from `getMin`
    public static int getMax(int ...numbers) {
        if(numbers.length == 0){
            // define what to do if the array is empty
            throw new Error("Cannot get max. Array is empty!");
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            int currentNumber = numbers[i];

            if (max < currentNumber) {
                max = currentNumber;
            }
        }
        return max;
    }
}
