package company;

/**
 * The Employee class demonstrates:
 * - Inheritance: Serves as an abstract base class for different employee types.
 * - Polymorphism: Defines an abstract `pay()` method to be implemented differently by subclasses.
 * - Data Coupling: `increasePay(int amount)` method accepts a primitive data type, directly modifying the salary.
 */
public abstract class Employee {
    
    private String name;
    private int salary;
    
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    // Abstract method demonstrating polymorphism (implemented differently by subclasses)
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
        this.salary += amount;
        System.out.printf("%s received a raise of $%d. New salary: $%d\n", name, amount, salary);
    }
}
