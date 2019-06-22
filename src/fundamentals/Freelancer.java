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

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void incrementAge() {
        this.age++;
    }

    @Override
    public String toString() {
        return "Freelancer:"  +
                "name='" + name + '\'' +
                ", age=" + age;
    }
}
