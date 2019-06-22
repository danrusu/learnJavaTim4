package fundamentals;

public class Freelancer {

    // instance fields
    private String name;
    private int age;


    public Freelancer(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Freelancer object created!");
    }

    public static String messageField ="Field: Hello Fake IT freelancer!!!";

    public static void message() {

        String messageVar = "Variable: Hello Fake IT freelancer!!!";

        System.out.println(messageVar);
        System.out.println(messageField);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
