package homework_19_06_29;

// Solving task 3 from
// https://github.com/danrusu/learnJavaTim4/blob/master/Resource/fundamentals/array_homework2.md
public class ArrayHomework2Task3 {

    public static void main(String[] args) {
        print(range(3, 9));
        print(range(7, -2));
    }

    public static int[] range(int number1, int number2){

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
