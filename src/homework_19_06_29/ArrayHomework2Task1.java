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
/*        for (int i = 0; i < numbers.length; i++) {
            if(i != numbers.length - 1) {
                System.out.print(numbers[i] + " ");
            }
            else {
                System.out.print(numbers[i]);
            }
        }*/
        if(numbers.length > 0) {
            // remove last added space
            System.out.print("\b");   // '\b' is backspace character
        }
        System.out.print("]");
    }

    public static int[] createArray(int number){
        // return an empty array
        if (number <= 0){
            return new int[]{};
        }

        // [ 7 7 7 7 7 7 7 ]  number -
        // [ 0 1 2 3 4 5 6 ]  index
        // [ 7 6 5 4 3 2 1 ]  expected
        int[] numbersArray = new int[number];
        for (int i = 0; i < number; i++) {
            numbersArray[i] = number - i ;
        }

/*        for (int i = 0; number > 0; i++) {
            numbersArray[i] = number--;
        }*/

/*        for (int i = number; i > 0; i--) {
            numbersArray[number - i] = i;
        }*/

        return numbersArray;
    }
}
