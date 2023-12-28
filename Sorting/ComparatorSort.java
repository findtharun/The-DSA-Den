package Sorting;

import java.util.*;

class Employee {
    public int salary;
    public String name;
    public int age;

    public Employee(int salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name +
                ", age='" + age +
                '}';
    }
}

// We are using Comparator Object
public class ComparatorSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(2, "John Doe", 23));
        employees.add(new Employee(1, "Jane Smith", 23));
        employees.add(new Employee(4, "Alice Johnson", 45));

        // Approach 1 : Using Comparator Object Ascending Order
        Comparator<Employee> com = new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e1.age == e2.age) {
                    return e1.salary - e2.salary;
                }
                return e1.age - e2.age;
            }
        };
        // Descending Order
        // Comparator<Employee> com = new Comparator<Employee>() {
        // public int compare(Employee e1, Employee e2) {
        // if (e1.age == e2.age) {
        // return e2.salary - e1.salary;
        // }
        // return e2.age - e1.age;
        // }
        // };

        /*
         * Negative values indicate that e1 should precede e2 in the sorted order.
         * Zero values indicate that e1 and e2 are considered equal for sorting.
         * Positive values indicate that e1 should follow e2 in the sorted order.
         * For descending order sorting, the logic is inverted:
         * 
         * Negative values indicate that e2 should precede e1 in the sorted order.
         * Zero values indicate that e1 and e2 are considered equal for sorting.
         * Positive values indicate that e2 should follow e1 in the sorted order.
         */

        Collections.sort(employees, com);
        System.out.println(employees);
    };
    // Approach 2 : We can use Lambda Function as well
    // Collections.sort(inputList, (a, b) -> (getSum(a) - getSum(b)));
}
