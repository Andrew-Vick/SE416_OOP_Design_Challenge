package company;

/**
 * The Employee class demonstrates:
 * - Inheritance: Serves as an abstract base class for different employee types.
 * - Polymorphism: Defines an abstract `pay()` method to be implemented differently by subclasses.
 * - Data Coupling: `increasePay(int amount)` method accepts a primitive data type, directly modifying the salary.
 */
public abstract class Employee {
    
	private final String name;
    private int salary;

    /**
     * Constructs an Employee with a name and a base salary.
     *
     * @param name   the employee's name
     * @param salary the employee's salary
     * @throws IllegalArgumentException if name is null/empty or salary is negative
     */
    public Employee(String name, int salary) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee name cannot be null or empty.");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Salary must be non-negative.");
        }
        this.name = name;
        this.salary = salary;
    }
    
    // Abstract method demonstrating polymorphism (implemented differently by subclasses)
    /**
     * Abstract method to calculate the payment information.
     *
     * @return payment information as a string
     */
    public abstract void pay();
    
    public int getSalary() {
        return salary;
    }
    
    public String getName() {
        return name;
    }
    
    /**
     * Demonstrates **Data Coupling** by passing a primitive `amount` to modify salary.
     *
     * @param amount the raise amount to be added to the salary
     */
    public void increasePay(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Increase amount must be non-negative.");
        }
        this.salary += amount;
        System.out.printf("%s received a raise of $%d. New salary: $%d\n", name, amount, salary);
    }
}
