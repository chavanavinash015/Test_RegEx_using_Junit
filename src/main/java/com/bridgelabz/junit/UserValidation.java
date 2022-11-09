package com.bridgelabz.junit;

import java.util.regex.Pattern;

public class UserValidation {

    public static final String VALIDATE_NAME="^[A-z]+[a-z]{2,}$";
    public static final String EMAIL_ID = "^[A-Z]{1,}[a-z]{5,}[@]{1}[a-z]{2,}[.]?[a-z]{2,}$";
    public static final String PHONE_NUMBER = "^[0-9]{2}+\s[0-9]{10}$";
    public static final String PASSWORD1 = "^[a-z]{8,}$";
    public Boolean checkFirstName(String firstName) {
        return (Pattern.matches(VALIDATE_NAME, firstName));
    }

    public Boolean checkLastName(String lastname) {
        return (Pattern.matches(VALIDATE_NAME,lastname));
    }

    public Boolean checkEmail(String email_id) {
        return (Pattern.matches(EMAIL_ID, email_id));
    }

    public Boolean checkPhoneNumber(String phone_Number) {
        return (Pattern.matches(PHONE_NUMBER,phone_Number));
    }

    public Boolean checkPassword(String password1) {
        return (Pattern.matches(PASSWORD1,password1));
    }
}
