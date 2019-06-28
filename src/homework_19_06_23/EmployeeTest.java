package homework_19_06_23;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee itEmployee = new Employee(
                "John",
                30,
                'M',
                "IBM");

        Employee hrEmployee = new Employee("Carmen", 25, 'F', "Visma");
        System.out.println("Initial employee objects, after creation:");
        display(itEmployee);
        display(hrEmployee);

        System.out.println("\nSet salaries!");
        itEmployee.setSalary(10000.5);
        hrEmployee.setSalary(7000);
        display(itEmployee);
        display(hrEmployee);

        System.out.println("\nSet levels!");
        itEmployee.setLevel("JUNIOR");
        hrEmployee.setLevel("SENIOR");
        display(itEmployee);
        display(hrEmployee);

        System.out.println("\nIncrement ages!");
        itEmployee.increaseAge(5);
        hrEmployee.increaseAge(10);
        display(itEmployee);
        display(hrEmployee);

        // print "IT salary is 10000 RON"
        System.out.println("\nIT salary is " + (int)itEmployee.getSalary() + " RON");
    }

    public static void display(Employee employee) {
        System.out.println(employee);
    }
}
