package fundamentals.oop;

// Default constructor & default field values example
public class TestObject {

    String text;
    int count;
    boolean isGood;

    public static void main(String[] args) {
        // if a class does not define any constructor,
        // a default constructor is provided
        TestObject testObject = new TestObject();

        System.out.println(testObject);
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "text='" + text + '\'' +
                ", count=" + count +
                ", isGood=" + isGood +
                '}';
    }
}
