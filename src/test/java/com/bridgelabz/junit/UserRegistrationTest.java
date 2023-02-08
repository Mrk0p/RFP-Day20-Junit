package com.bridgelabz.junit;

import org.junit.Test;
import junit.framework.Assert;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.firstNameValidate("Rajkumar");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.firstNameValidate("rajkumar");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.lastNameValidate("Verma");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.lastNameValidate("verma");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhone_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.phoneNumberValidate("91 8954653285");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhone_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.phoneNumberValidate("8954653285");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.passwordValidate("Rajubahi23#%");
        Assert.assertFalse(result);
    }
}
