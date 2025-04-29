package company;

import java.util.List;

/**
 * The EmployeeBenefits interface demonstrates:
 * - Interface Implementation: Enforces a contract that FullTimeEmployee must implement.
 * - Polymorphism: Provides method overloading in `bonus()`.
 */
public interface EmployeeBenefits {
    
	/**
     * Calculates commission earned based on sold item values.
     *
     * @param valueItems list of item sale values
     * @return total commission
     */
    int commission(List<Integer> valueItems);
    
    /**
     * Calculates the standard bonus.
     *
     * @return bonus amount
     */
    int bonus();

    /**
     * Calculates a bonus based on performance rating.
     *
     * @param performanceRating performance as a percentage
     * @return bonus amount
     */
    int bonus(double performanceRating);
}