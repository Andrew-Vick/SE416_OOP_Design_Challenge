package company;

/**
 * PartTimeEmployee extends Employee:
 * - Inheritance: Inherits from Employee.
 * - Polymorphism: Implements `pay()` differently than FullTimeEmployee.
 */
public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    
    public PartTimeEmployee(String name, int salary, int hours) {
        super(name, salary);
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