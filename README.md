# SE416_OOP_Design_Challenge

## Employee Management System (OOP Example)

### Overview

This project demonstrates key Object-Oriented Programming (OOP) concepts in Java, including:

- Inheritance
- Interface Implementation
- Polymorphism
- Data Coupling
- Stamp Coupling

The program models a simple employee management system where employees can receive salaries, bonuses, and commissions based on their employment type.

### How It Works

1. Abstract Class (Employee): Defines common properties (name, salary) and methods (pay(), increasePay()).
2. Inheritance: FullTimeEmployee and PartTimeEmployee extend Employee, inheriting its attributes and behavior.
3. Interface (EmployeeBenefits): Implemented by FullTimeEmployee to define commission and bonus calculations.
4. Polymorphism:
    - Method overriding: pay() is implemented differently in FullTimeEmployee and PartTimeEmployee.
    - Method overloading: bonus() has multiple versions in FullTimeEmployee.
5. Data Coupling: increasePay(int amount) in Employee modifies salary using a primitive type.
6. Stamp Coupling: commission(List<Integer> valueItems) in FullTimeEmployee takes a data structure as input.