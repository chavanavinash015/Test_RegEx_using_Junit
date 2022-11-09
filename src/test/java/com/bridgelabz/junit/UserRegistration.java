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
    @Test
    void given_last_name_should_returnTrue(){
        UserValidation validation= new UserValidation();
        Boolean result1 = validation.checkLastName("Chavan");
        Assertions.assertEquals(result1,true);
    }

    @Test
    void given_email_id_should_returnTrue(){
        UserValidation validation= new UserValidation();
        Boolean result2 = validation.checkEmail("Avinashchavan@gmail.com");
        Assertions.assertEquals(result2,true);
    }

    @Test
    void given_phone_number_should_returnTrue(){
        UserValidation validation = new UserValidation();
        Boolean result3 = validation.checkPhoneNumber("91 9767884048");
        Assertions.assertEquals(result3,true);
    }

    @Test
    void given_password_should_returnTrue(){
        UserValidation validation = new UserValidation();
        Boolean passrule1 = validation.checkPassword("avinashc");
        Assertions.assertEquals(passrule1, true);
    }

    @Test
    void given_password2_should_returnTrue(){
        UserValidation validation = new UserValidation();
        Boolean passrule2 = validation.checkPassword2("Avinash015");
        Assertions.assertEquals(passrule2,true);
    }

    @Test
    void given_password3_should_returnTrue(){
        UserValidation validation = new UserValidation();
        Boolean passrule3 = validation.checkPassword3("Avinash015");
        Assertions.assertEquals(passrule3,true);
    }

    @Test
    void given_password4_should_returnTrue(){
        UserValidation validation = new UserValidation();
        Boolean passrule4 = validation.checkPassword4("Chavan@123");
        Assertions.assertEquals(passrule4,true);
    }
}
