package com.bridgelabz.junit;

import java.util.regex.Pattern;

public class UserValidation {

    public static final String VALIDATE_NAME="^[A-z]+[a-z]{2,}$";
    public Boolean checkFirstName(String firstName) {
        return (Pattern.matches(VALIDATE_NAME, firstName));
    }
}
