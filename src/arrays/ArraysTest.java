package arrays;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 50, 20, -20, -10, -20, 1}; // sum 50
        System.out.print("Numbers array: ");
        printArray(numbers);

        System.out.println("\nSum of elements in `numbers` array: " + sumOfArray(numbers));

        System.out.print("Empty int[] array: ");
        printArray(new int[10]);

        int[] newArray = createArray(10);
        System.out.print("\nArray: ");
        printArray(newArray);
        System.out.println("\nSum of 1..10: " + sumOfArray(newArray));

        System.out.print("Empty String[] array: ");
        String[] strings = new String[10];

        printArray(strings);
    }

    // Overloading - same method name and different parameter list
    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            //System.out.print("Index: " + i + " ");
            System.out.print(numbers[i] + ", ");
        }
    }

    // Overloading
    public static void printArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            //System.out.print("Index: " + i + " ");
            System.out.print(strings[i] + ", ");
        }
    }

    // create a method that calculates the sum of the elements within an Array[int]
    public static int sumOfArray(int[] numbers){
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }

        return sum;
    }

    // create an array with the first N numbers starting from 1
    public static int[] createArray(int upperLimit){
        int[] numbers = new int[upperLimit];

        for(int currentNumber = 1; currentNumber <= upperLimit; currentNumber++){
            numbers[currentNumber-1] = currentNumber;
        }

        return numbers;
    }

}
