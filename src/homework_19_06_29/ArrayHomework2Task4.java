package homework_19_06_29;

// Solving task 4 from
// https://github.com/danrusu/learnJavaTim4/blob/master/Resource/fundamentals/array_homework2.md
public class ArrayHomework2Task4 {

    public static void main(String[] args) {
        ArrayHomework2Task3.print(
                createMirrorArray(-5));

        ArrayHomework2Task3.print(
                createMirrorArray(0));

        ArrayHomework2Task3.print(
                createMirrorArray(3));
    }

    // number = 5, array = [-5 -4 -3 -2 -1 1 2 3 4 5]
    public static int[] createMirrorArray(int number){
        if (number == 0){
            return new int[0];
        }
        int absNumber = Math.abs(number);
        int[] numbersArray = new int[2 * absNumber];
        int currentNumber = - absNumber ;
        for (int i = 0; i < numbersArray.length; i++) {
            if(currentNumber != 0){
                numbersArray[i] = currentNumber++;
            }
            else{
              currentNumber+=1;
              numbersArray[i] = currentNumber;
            }
        }
        return numbersArray;
    }
}
