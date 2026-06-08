package com.example;

import java.util.function.Function;

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Return the largest number in the 'numbers' array
    static String getFullName(Employee employee) {
        // Your code goes here.

        Function<Employee, String> fullName = e -> e.getFirstName() + " " + e.getLastName();


        return fullName.apply(employee);
    }


    static class Employee {

        public Employee(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        String firstName;
        String lastName;

        String getFirstName() {
            return firstName;
        }

        String getLastName() {
            return lastName;
        }
    }

    public static void main(String[] args) {
        Answer.Employee employee = new Answer.Employee("Jerome", "Donaldson");
        String result = Answer.getFullName(employee);
        System.out.println(result);
    }

}
