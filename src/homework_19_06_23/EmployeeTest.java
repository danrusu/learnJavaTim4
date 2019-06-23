package homework_19_06_23;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee itEmployee = new Employee(
                "John",
                30,
                'M',
                "IBM");

        Employee hrEmployee = new Employee("Carmen", 25, 'F', "Visma");
        display(itEmployee);
        display(hrEmployee);

        System.out.println("Set salaries!!!");
        itEmployee.setSalary(10000.5);
        hrEmployee.setSalary(7000);
        display(itEmployee);
        display(hrEmployee);

        System.out.println("Set levels!!!");
        itEmployee.setLevel("JUNIOR");
        hrEmployee.setLevel("SENIOR");
        display(itEmployee);
        display(hrEmployee);

        System.out.println("Increment ages !!!");
        itEmployee.increaseAge(5);
        hrEmployee.increaseAge(10);
        display(itEmployee);
        display(hrEmployee);


        // print "IT salary is 10000 RON"
        System.out.println("IT salary is " + (int)itEmployee.getSalary() + " RON");

        //message();

    }

    public static void display(Employee employee) {
        System.out.println(employee);
    }

    public void message(){
        System.out.println("end of main");
    }
}
