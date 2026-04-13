/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatapppart_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
   Login login = new Login();
   
      //====================================
     //to check the validity of the username
    //======================================
   
   @Test
   public void testValidUsername(){
   //this checks the username must have a underscore "_"
   //also checks the length of the username must not be more that 3 (e.g."Caleb")
  
       assertTrue(login.checkUserName("kyl_1"));
                      
   }
   
   @Test 
   public void testInavlidUsername_WithNoUnderscore(){
       //tells the users that their does not have the underscore
       assertFalse(login.checkUserName("bento"));
   }
   
   @Test
   public void testInvalidUsername_TooLong(){
    //reasons why it is FALSE, the username is more  than 3 characters
    //it was suppose to be 3 (e.g. "Caleb_77")
    assertFalse(login.checkUserName("Caleb_"));
   }
    //====================================
   //to check the validity of the password   
  //======================================
   @Test
   public void testValidPassword(){
       
       assertTrue(login.checkPasswordComplexity("Caleb7@bento"));
   }
   
   @Test
   public void testInvalidPassword_WithNoCapital(){ 
      //tells the user that their password does not have any capital letter
      assertFalse(login.checkPasswordComplexity("Caleb7@bento"));
   }
   
   @Test
   public void testInvalidPassword_WithNoNUmber(){ 
      //tells the user that their password does not have atleast one number
      assertFalse(login.checkPasswordComplexity("Caleb7@bento"));
   }   
   @Test
   public void testInvalidPassword_WithNoSpecialCharacter(){ 
      //tells the user that their password does not have atleast one special character
      assertFalse(login.checkPasswordComplexity("Caleb7@bento"));  
   }
   @Test
   public void testInvalidPassword_WithLessThan8Characters(){ 
      //tells the user that their password does not have any capital letter
      assertFalse(login.checkPasswordComplexity("Caleb7@bento"));
   }  

//===============================================
//to check user validity of the cell phone number
//===============================================
@Test
public void testInvalidPhoneNumber(){
    //if the cell phone has the S.A code and has <=12 character its valid 
    assertTrue(login.checkUserNumber("+27822625078"));
    
}

@Test
public void testInvalidPhoneNumber_WithNoSACode(){
    //tells the user that their cellphone number does not have the S.A code
    assertFalse(login.checkUserNumber("+27822625078"));
}
    
@Test
   public void testInvalidPhoneNumber_WithLongNumber(){ 
      //tells the user that their cellphone number has >12 characaters 
      assertFalse(login.checkUserNumber("+27822625078"));
   }
}