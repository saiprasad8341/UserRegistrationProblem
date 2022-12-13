package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

//UC2 - As a User need to
//enter a valid Last Name
public class UserRegistrationProblem {

    public static void verifyFirstName(String firstName){
        boolean verify = (Pattern.matches("^[A-Z][a-z]{2,}$", firstName));
        if (verify){
            System.out.println("Welcome :: "+ firstName);
        }else {
            System.out.println("Please enter the valid input...");
        }
    }
    public static void verifyLastName(String LastName){
        boolean verify = (Pattern.matches("^[A-Z][a-z]{2,}$", LastName));
        if (verify){
            System.out.println("Welcome :: "+ LastName);
        }else {
            System.out.println("Please enter the valid input...");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration Problem...!!!");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the First Name :: ");
        String firstName = sc.next();

        verifyFirstName(firstName);

        System.out.print("Please enter the Last Name :: ");
        String lastName = sc.next();

        verifyLastName(lastName);
    }
}
