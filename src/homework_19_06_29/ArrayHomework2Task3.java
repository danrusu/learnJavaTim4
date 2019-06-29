package homework_19_06_29;

// Solving task 3 from
// https://github.com/danrusu/learnJavaTim4/blob/master/Resource/fundamentals/array_homework2.md
public class ArrayHomework2Task3 {

    public static void main(String[] args) {
        print(range(3, 3));

        print(range(3, 9));
        print(range(9, 3));

        print(range(-7, -2));
        print(range(-2, -7));
    }

    public static int[] range(int number1, int number2){
        // closed range from [0, 5] (inclusive) we have 6 numbers
        // closed range from [3, 9] (inclusive) we have 9-3+1 numbers

        int rangeLength = Math.abs(number1 - number2) + 1;

        int[] rangeArray = new int[rangeLength];

        if (number1 > number2){
            for(int i = 0; i < rangeLength; i++){
                rangeArray[i] = number1 - i;
            }
        }
        else{
            for(int i = 0; i < rangeLength; i++){
                rangeArray[i] = number1 + i;
            }
        }

        return rangeArray;
    }

    public static void print(int[] numbers){
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
