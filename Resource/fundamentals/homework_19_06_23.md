### Homework - Class fundamentals.

#### Task

1. Create a class that holds information about an employee
- name: text
- age: integer
- sex: character
- employer: text
- salary: double
- level: text (JUNIOR / SENIOR)

2. Create constructor from all fields but salary and level.

3. Create getters for all fields.

4. Create setter for salary, one for level, and a method that can increase
the age with a known amount.

5. Overwrite the appropriate method so that

```
Employee itEmployee = new Employee("John", 30, 'M', "IBM");
Employee hrEmployee = new Employee("Carmen", 25, 'F', "Visma");
System.out.println(itEmployer);
System.out.println(hrEmployer);
```

will print

```
Employee: John, 30 years, male, works at IBM
Employee: Carmen, 25 years, female, works at Visma
```

6. Create a method that returns if an Employee is JUNIOR.

7. Create a test in a separate class for all the requirements from above.

