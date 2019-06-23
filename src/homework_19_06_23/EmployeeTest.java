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

        System.out.println("Set salaries!!!");
        itEmployee.setSalary(10000.5);
        hrEmployee.setSalary(7000);
        System.out.println(itEmployee);
        System.out.println(hrEmployee);

        System.out.println("Set levels!!!");
        itEmployee.setLevel("JUNIOR");
        hrEmployee.setLevel("SENIOR");
        System.out.println(itEmployee);
        System.out.println(hrEmployee);



        // print "IT salary is 10000 RON"
        System.out.println("IT salary is " + (int)itEmployee.getSalary() + " RON");


    }
}
