package homework_19_06_23;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee itEmployee = new Employee(
                "John",
                30,
                'M',
                "IBM");

        Employee hrEmployee = new Employee("Carmen", 25, 'F', "Visma");
        System.out.println(itEmployee);
        System.out.println(hrEmployee);

        itEmployee.setSalary(10000.5);
        hrEmployee.setSalary(7000);

        // print "IT salary is 10000 RON"
        System.out.println("IT salary is " + (int)itEmployee.getSalary() + " RON");


    }
}
