package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

//UC1 - As a User need to
//enter a valid First
//Name
public class UserRegistrationProblem {

    public static boolean verifyFirstName(String firstName){
        return (Pattern.matches("^[A-Z][a-z]{2,}$", firstName));
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration Problem...!!!");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the First Name :: ");
        String firstName = sc.next();

        if (verifyFirstName(firstName)){
            System.out.println("Welcome :: "+ firstName);
        }else {
            System.out.println("Please enter the valid input...");
        }
    }
}
