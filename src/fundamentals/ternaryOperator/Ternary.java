package fundamentals.ternaryOperator;

public class Ternary {

    // for a number return if the number is greater that a limit
    // then return "GREATER"
    // else return "LOWER"
    public static void main(String[] args) {
        int number1 = 50;
        int number2 = 80;
        int limit = 77;

        boolean isGreater1 = number1 > limit;
        boolean isGreater2 = number2 > limit;
        System.out.println(isGreater1);
        System.out.println(isGreater2);

        System.out.println("\nClassic");
        System.out.println(isGreater(number1, limit)); // LOWER
        System.out.println(isGreater(number2, limit)); // GREATER

        System.out.println("\nTernary");
        System.out.println(isGreaterTernary(number1, limit)); // LOWER
        System.out.println(isGreaterTernary(number2, limit)); // GREATER

    }

    private static String isGreater(int number, int limit) {
        String message;
        if (number > limit){
            message = "GREATER";
        }
        else {
            message = "LOWER";
        }
        return message;
    }

    private static String isGreater2(int number, int limit) {
        if (number > limit){
            return "GREATER";
        }
        else {
            return  "LOWER";
        }
    }

    private static String isGreaterTernary(int number, int limit) {
        return (number > limit) ?  // condition ?
                "GREATER"    // condition == true
                : "LOWER";   // condition == false
    }

}
