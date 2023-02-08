package com.bridgelabz.junit;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL = "^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$";
    private static final String PHONE_NUMBER = "^[\\d]{2}[\\s][\\d]{10}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$";

    public boolean firstNameValidate(String firstName)
    {
        return Pattern.matches(NAME, firstName);
    }
    public boolean lastNameValidate(String lastName)
    {
        return Pattern.matches(NAME, lastName);
    }

    public boolean emailValidate(String email)
    {
        return Pattern.matches(EMAIL, email);
    }

    public boolean phoneNumberValidate(String phoneNum)
    {
        return Pattern.matches(PHONE_NUMBER, phoneNum);
    }

    public boolean passwordValidate(String password)
    {
        return Pattern.matches(PASSWORD, password);
    }
}
