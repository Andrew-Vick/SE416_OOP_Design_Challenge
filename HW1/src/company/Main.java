package company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        Employee john = new PartTimeEmployee("John", 15, 20);
        john.pay();
        john.increasePay(2);
        john.pay();

        System.out.println("\n===========================\n");

        List<Integer> itemsSold = new ArrayList<>();
        itemsSold.add(100);
        itemsSold.add(200);
        FullTimeEmployee jane = new FullTimeEmployee("Jane", 65000, 20, itemsSold);

        System.out.printf("Jane's base salary: $%d\n", jane.getSalary());

        int totalCommission = jane.commission(itemsSold);
        System.out.printf("Jane's total commission: %d\n", totalCommission);
        jane.pay();

        int bonusAmount = jane.bonus();
        System.out.printf("Jane's standard bonus: $%d\n", bonusAmount);

        int performanceBonus = jane.bonus(0.8);
        System.out.printf("Jane's performance-based bonus: $%d\n", performanceBonus);

        jane.increasePay(5000);
    }
}