package company;

import java.util.List;

/**
 * FullTimeEmployee extends Employee and implements EmployeeBenefits:
 * - Inheritance: Extends Employee to reuse properties like name and salary.
 * - Interface Implementation: Implements EmployeeBenefits methods (`commission`, `bonus`).
 * - Stamp Coupling: `commission(List<Integer> valueItems)` takes a structured data type.
 * - Polymorphism: Implements `pay()` differently from PartTimeEmployee.
 */
public class FullTimeEmployee extends Employee implements EmployeeBenefits {
    
    private int commissionRate;
    private List<Integer> valueOfSoldItems;
    
    public FullTimeEmployee(String name, int salary, int rate, List<Integer> itemsSold) {
        super(name, salary);
        this.commissionRate = rate;
        this.valueOfSoldItems = itemsSold;
    }

    /**
     * Implements Stamp Coupling by passing a structured data type (List<Integer>).
     *
     * @param valueItems list of sold item values
     * @return total commission earned
     */
    @Override
    public int commission(List<Integer> valueItems) {
    	
    	if(valueItems.isEmpty()) {
    		return 0;
    	}
    	
        int totalCommission = 0;
        for (int item : valueItems) {
            totalCommission += (item * commissionRate / 100);
        }
        return totalCommission;
    }

    @Override
    public int bonus() {
        return (int) (getSalary() * 0.10);
    }

    @Override
    public int bonus(double performanceRating) {
        return (int) (getSalary() * (performanceRating / 100));
    }

    /**
     * Overrides `pay()` to implement specific logic for full-time employees, showcasing Polymorphism.
     */
    @Override
    public void pay() {
        int totalPay = getSalary() + commission(valueOfSoldItems);
        System.out.printf("Full-time employee %s needs to be paid: $%d\n", getName(), totalPay);
    }
}