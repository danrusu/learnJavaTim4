package fundamentals;

public class FreelancerTest {

    public static void main(String[] args) {

        // static members
        System.out.println(Freelancer.messageField);
        Freelancer.message();

        // local variables
        String johnDoeName = "John Doe";
        int johnDoeAge = 25;

        Freelancer developer = new Freelancer(johnDoeName, johnDoeAge);

        Freelancer economist = new Freelancer("Electra", 20);

        // get instance class full and simple names
        System.out.println("\neconomist full class name: " + economist.getClass().getName());
        System.out.println("economist simple class name: " + economist.getClass().getSimpleName());

        System.out.println();
        System.out.println(developer); // calls developer.toString() implicitly
        System.out.println("Changes!!!");
        developer.setName("Bill Gates");
        developer.incrementAge();

        System.out.println(developer);
    }

}
