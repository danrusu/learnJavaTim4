package arrays;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {

/*
        // 1, 5, 7, 9, 18, -5, 111, -4
        //Integer[] numbers = {1, 5, 7, 9, 18, -5, 111, -4};  // literal array


*/


        int[] numbers = {1, 5, 7, 9, 18, -5, 111, -4};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Index: " + i + " ");
            System.out.println("Value: " + numbers[i]);
        }
    }
}
