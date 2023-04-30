package com.mycompany.payrollsystemmodification;

public class EmployeeTest {
   public static void main(String[] args) {
      Date birth1 = new Date(10, 24, 2002);
      Date hire1 = new Date(4, 30, 2023);
      Employee employee1 = new Employee("Naweed", "Quorishi", birth1, hire1);

      Date birth2 = new Date(5, 12, 1998);
      Date hire2 = new Date(3, 5, 2020);
      Employee employee2 = new Employee("John", "Doe", birth2, hire2);

      Date birth3 = new Date(11, 30, 2000);
      Date hire3 = new Date(7, 12, 2021);
      Employee employee3 = new Employee("Jane", "Smith", birth3, hire3);

      Date birth4 = new Date(7, 1, 1999);
      Date hire4 = new Date(2, 15, 2022);
      Employee employee4 = new Employee("Sarah", "Johnson", birth4, hire4);

      Date birth5 = new Date(12, 31, 1997);
      Date hire5 = new Date(9, 1, 2020);
      Employee employee5 = new Employee("Michael", "Brown", birth5, hire5);

      Employee[] employees = {employee1, employee2, employee3, employee4, employee5}; // create an array to hold the employees

      System.out.println("Employees with earnings $600 or less:");
      for (Employee e : employees) {
         if (e.earnings() <= 600.0) {
            System.out.printf("%s %s%n", e.getFirstName(), e.getLastName());
         }
      }
   }
}
