

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.chatapppart_1;   


/**
 *
 * @author Student
 */
public class Login {
    
   //These should be private to follow Java standards 
    
    String username;
    String password;
    String phoneNumber;
    
    //Check if the user is valid
    
    public boolean checkUserName(String username){
        return username.contains("_") && username.length()<= 5;
    }

    //Check if entered password is correct   
    public boolean checkPasswordComplexity(String password){ 
        
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
            
        for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                        
                if (Character.isUpperCase(c))  {
                    hasCapital = true;
                }else if (Character.isDigit(c)){
                    hasNumber = true;
                }else if(!Character.isLetterOrDigit(c)){
                    hasSpecial = true;
            }
        }
        
     return hasCapital && hasNumber && hasSpecial;
    }  
    
    //CHECK USER NUMBER(10 digits)
    public boolean checkUserNumber(String userNumber){
        return userNumber.matches("\\d{10}");
    }
    
    public boolean checkCellPhoneNumber(String phone){
        return phone.startsWith("+27") && phone.length()<=12;
    }
    
    public String returnLoginStatus(boolean success){
        if(success){
            return "Welcome " + username + "It is great to see you again.";
        }else{
            return "Username or passwordincorrect,please try again";
        }
    }

    boolean loginUser(String loginUser, String loginPass) {      
        return false;
    }

    String registerUser(String username, String password, String userNumber) {
        return null;
    }
}
    