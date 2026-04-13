/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapppart_1;

import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Mainapp {
    public static void main (String[]args){
        
       //Scanner allows the user to enter information
       Scanner input = new Scanner(System.in);
       
       //Create an object of the login class so we can call its methods
       Login login = new Login();
       
       // ---REGISTRATION PHASE---
       System.out.println("=== USER REGISTRATION ===");
       
       System.out.println("Enter a username:");
       String username = input.nextLine();
       
       System.out.println("Enter a password:");
       String password = input.nextLine();
       
       System.out.println("Enter your South African cellphone number (+27...):");
       String userNumber= input.nextLine();
       
       //Call registerUser and capture the result message
       String registerUser = login.registerUser(username, password,userNumber);
       
       //Show the registration message
       System.out.println(registerUser);
       
       //Login phase (Only if registration worked
           System.out.println("\n=== USER LOGIN ===");
           
           System.out.println("Enter your username: ");
           String loginUser = input.nextLine();
           
           System.out.println("Enter your password;");
           String loginPass = input.nextLine();
           
        //Call loginUser to check if the details match the stored ones 
        boolean loggedIn =login.loginUser(loginUser,loginPass);{
         
        }
           
           //Get and display the final message
           String loginStatus = login.returnLoginStatus(loggedIn);
           System.out.println(loginStatus);
       }
    }