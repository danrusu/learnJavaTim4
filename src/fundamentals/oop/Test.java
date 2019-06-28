package fundamentals.oop;

public class Test {

    public static void main(String[] args) {

        // static members
/*
        System.out.println(Freelancer.messageField);
        Freelancer.message();
*/

        // instance fields
        String johnDoeName = "John Doe";
        int johnDoeAge = 25;
        Freelancer developer = new Freelancer(johnDoeName, johnDoeAge);

        Freelancer economist = new Freelancer("Electra", 20);


/*
        System.out.println(freelancer.getClass().getName());
        System.out.println(freelancer.getClass().getSimpleName());*/

        System.out.println(developer);

        System.out.println("Changes!!!");
        developer.setName("Bill Gates");
        developer.incrementAge();

        System.out.println(developer);
    }

    /*public static void displayFreelancer(Freelancer developer) {
        System.out.println("Name - " + developer.getName());
        System.out.println("Age - " + developer.getAge());
    }*/

}
