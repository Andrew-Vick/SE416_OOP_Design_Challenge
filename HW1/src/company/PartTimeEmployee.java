package company;

/**
 * PartTimeEmployee extends Employee:
 * - Inheritance: Inherits from Employee.
 * - Polymorphism: Implements `pay()` differently than FullTimeEmployee.
 */
public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    
    /**
     * Constructs a PartTimeEmployee.
     *
     * @param name   the employee's name
     * @param salary the hourly salary
     * @param hours  the number of hours worked
     */
    public PartTimeEmployee(String name, int salary, int hours) {
        super(name, salary);
        if (hours < 0) {
            throw new IllegalArgumentException("Hours worked must be non-negative.");
        }
        this.hoursWorked = hours;
    }
    
    /**
     * Overrides `pay()` to provide a unique payment calculation for part-time employees.
     */
    @Override
    public void pay() {
        int pay = hoursWorked * getSalary();
        System.out.printf("Part-time employee %s earned: $%d\n", getName(), pay);
    }
}