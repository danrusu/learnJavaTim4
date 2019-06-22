package fundamentals;

public class Test {

    public static void main(String[] args) {

        // static members
/*
        System.out.println(Freelancer.messageField);
        Freelancer.message();
*/

        // instance fields
        Freelancer developer = new Freelancer("John Doe", 25);
        Freelancer economist = new Freelancer("Electra", 20);

/*
        System.out.println(freelancer.getClass().getName());
        System.out.println(freelancer.getClass().getSimpleName());*/

        System.out.println("Name: " + developer.getName());
        System.out.println("Age: " + developer.getAge());

/*        System.out.println("Changes!!!");
        developer.name = "Bill Gates";
        developer.age = 45;*/

        System.out.println("Name: " + economist.getName());
        System.out.println("Age: " + economist.getAge());
    }

}
