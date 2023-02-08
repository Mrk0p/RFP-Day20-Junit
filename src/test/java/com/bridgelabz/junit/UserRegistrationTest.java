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
}
