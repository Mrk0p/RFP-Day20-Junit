package com.bridgelabz.junit;

import org.junit.Test;
import junit.framework.Assert;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Rajkumar");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_ShouldReturnFalse() {
        boolean result = userRegistration.firstName("rajkumar");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Akhtar");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("akhtar");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail_ShouldReturnTrue() {
        boolean result = userRegistration.email("nadeem@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_ShouldReturnFalse() {
        boolean result = userRegistration.email("nadeem&.com");
        Assert.assertEquals(false, result);

    }
    @Test
    public void givenPhoneNumber_ShouldReturnTrue() {
        boolean result = userRegistration.mobileNumber("919925067545");
        Assert.assertEquals(true, result);

    }

    @Test
    public void givenPhoneNumber_ShouldReturnFalse() {
        boolean result = userRegistration.mobileNumber("64587541236");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPassword_ShouldReturnTrue(){
        boolean result = userRegistration.password("Rajubhai");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_ShouldReturnFalse(){
        boolean result = userRegistration.password("asdfghjk");
        Assert.assertEquals(false, result);
    }
}
