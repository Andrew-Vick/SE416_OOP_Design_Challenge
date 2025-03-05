package company;

import java.util.List;

/**
 * The EmployeeBenefits interface demonstrates:
 * - Interface Implementation: Enforces a contract that FullTimeEmployee must implement.
 * - Polymorphism: Provides method overloading in `bonus()`.
 */
public interface EmployeeBenefits {
    
    int commission(List<Integer> valueItems);
    
    // Standard bonus calculation
    int bonus();

    // Overloaded bonus calculation with a performance rating
    int bonus(double performanceRating);
}