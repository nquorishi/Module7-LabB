package com.mycompany.payrollsystemmodification;

import java.time.LocalDate;

public class EmployeeTest {
   public static void main(String[] args) {
      Date birth = new Date(7, 24, 1949);
      Date hire = new Date(3, 12, 1988);
      Employee employee = new Employee("Bob", "Blue", birth, hire);

      Employee[] employees = {employee}; // create an array to hold the employees

      int currentMonth = LocalDate.now().getMonthValue(); // get the current month

      for (Employee e : employees) {
         Date eBirthDate = e.getBirthDate();
         if (eBirthDate.getMonth() == currentMonth) { // if the current month is the employee's birth month
            System.out.printf("%s %s's birthday is this month! Adding $100.00 to their payroll.%n", e.getFirstName(), e.getLastName());
         }
         System.out.printf("Payroll for %s %s is $%.2f%n", e.getFirstName(), e.getLastName(), 1000.00); // calculate payroll (for demo purposes only)
      }
   }
}
