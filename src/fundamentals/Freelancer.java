package fundamentals;

/* Static vs. Instance

Static field/method means class field/method (no instance is needed to access field/method).
i. e.
Freelancer.message();
System.out.println(Freelancer.messageField);

Instance field/method means you need an object (instance of that class) to access the field/method.
Instance fields should not be public.
i. e.
Freelancer developer = new Freelancer("John Doe", 30);
System.out.println(developer.getName());
 */

// By default all classes extend the java.lang.Object base class.
public class Freelancer {

    // instance fields
    // private, accessible via getters
    private String name;
    private int age;

    // static field - class field
    public static String messageField ="Field: Hello Fake IT freelancer!!!";

    // constructor from fields
    public Freelancer(String name, int age) {
        // this.name - is the `name` instance field
        // name      - is the `name` method parameter
        this.name = name;
        this.age = age;
        System.out.println("New Freelancer object created!");
    }

    // class method (static)
    public static void message() {
        // local variable
        String messageVar = "Variable: Hello Fake IT freelancer!!!";

        System.out.println(messageVar);
        System.out.println(messageField);
    }

    // Getters = READ values from the class fiels

    // name getter - instance method
    public String getName() {
        return name;
    }

    // age getter - instance method
    public int getAge() {
        return age;
    }

    // Setters - WRITE values to class fields

    // name setter - instance method
    public void setName(String name) {
        this.name = name;
    }

    // age setter - instance method
    public void setAge(int age) {
        this.age = age;
    }

    // instance method
    public void incrementAge() {
        this.age++;
    }

    // instance method, inherited from Object
    // when printing an object (instance) to console, toString is implicitly called
    // i.e. System.out.println(developer); is equivalent with System.out.println(developer.toString());
    // used to be able to print a hyman readable form of an Freelancer instance
    @Override
    public String toString() {
        return "Freelancer:"  +
                "name='" + name + '\'' +
                ", age=" + age;
    }
}
