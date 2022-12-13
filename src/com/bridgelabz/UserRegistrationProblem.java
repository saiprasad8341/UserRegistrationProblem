package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

//UC4 - As a User need to
//follow pre-defined Mobile Format

// ^  ==> starts with or The beginning of a line
// $  ==> ends with or end of a line
// *  ==> zero or more
// +  ==> one or more
// ?  ==> zero or one (optional)
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
    public static void verifyEmail(String email){
        boolean verify = (Pattern.matches("^[A-za-z]+([_+-.][a-zA-Z])*[@][a-zA-Z]+[.][a-z]{2,3}([.][a-z]{2})*$", email));
        if (verify){
            System.out.println("Entered email is :: "+ email + " valid...!!!");
        }else {
            System.out.println("Please enter the valid input...");
        }
    }

    public static void verifyPhoneNumber(String phnum){
        boolean verify = Pattern.matches("^[+](91)[6-9][0-9]{9}$", phnum);
        if (verify){
            System.out.println("Entered phone number is :: "+ phnum + " valid...!!!");
        }else {
            System.out.println("Please enter the valid input...");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration Problem...!!!");
        Scanner sc = new Scanner(System.in);

//        System.out.print("Please enter the First Name :: ");
//        String firstName = sc.next();
//
//        verifyFirstName(firstName);
//
//        System.out.print("Please enter the Last Name :: ");
//        String lastName = sc.next();
//
//        verifyLastName(lastName);
//
//        System.out.print("Please enter the Email :: ");
//        String email = sc.next();
//
//        verifyEmail(email);

        System.out.print("Please enter the Phone number :: ");
        String phnum = sc.next();

        verifyPhoneNumber(phnum);

    }
}
