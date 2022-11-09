package com.bridgelabz.junit;

import org.junit.jupiter.api.*;

public class UserRegistration {

    @BeforeAll
    static void displayMethod(){
        System.out.println("Welcome to user Registration to junit");
    }
    @AfterEach
    public void afterDisplayMethod(){
        System.out.println("Test is Passed");
    }

    @Test
    void given_first_name_should_returnTrue(){
        UserValidation validation = new UserValidation();
        Boolean result =validation.checkFirstName("Avinash");
        Assertions.assertEquals(result,true);
    }

    void given_last_name_should_returnTrue(){
        UserValidation validation= new UserValidation();
        Boolean result1 = validation.checkLastName("Chavan");
        Assertions.assertEquals(result1,true);
    }
}
