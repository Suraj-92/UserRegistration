package userValidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    @Test
    public void givenFirstNameReturnTrue() throws userValidatorException {
        UserValidator userValidator = new UserValidator("HAPPY");
        boolean result = userValidator.validateFirstName("Suraj");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenFirstNameIsFalse() {
        UserValidator userValidator = new UserValidator("SAD");
        boolean result = userValidator.validateFirstName("ss");
        Assertions.assertTrue(result);
        String mood = null;
        try {
            mood = userValidator.analyseMood("This is a SAD Message");
        } catch (userValidatorException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenLastNameIsTrue() throws userValidatorException {
        UserValidator userValidator = new UserValidator("HAPPY");
        boolean result = userValidator.validateLastName("Temkar");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenLastNameIsFalse() {
        UserValidator userValidator = new UserValidator("SAD");
        boolean result = userValidator.validateFirstName("tem");
        Assertions.assertTrue(result);
        String mood = null;
        try {
            mood = userValidator.analyseMood("This is a SAD Message");
        } catch (userValidatorException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenEmailIsValid() throws Exception{
        UserValidator userValidator = new UserValidator("HAPPY");
        boolean result = userValidator.validateEmail("Te@kar");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenEmailIsInvalid() {
        UserValidator userValidator = new UserValidator("SAD");
        boolean result = userValidator.validateFirstName("temkar3");
        Assertions.assertTrue(result);
        String mood = null;
        try {
            mood = userValidator.analyseMood("This is a SAD Message");
        } catch (userValidatorException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenPhoneNumberIsValid() throws userValidatorException {
        UserValidator userValidator = new UserValidator("HAPPY");
        boolean result = userValidator.validatePhoneNumber("91 9503076240");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenPhoneNumberIsInValid() {
        UserValidator userValidator = new UserValidator("SAD");
        boolean result = userValidator.validateFirstName("919898989753456");
        Assertions.assertTrue(result);
        String mood = null;
        try {
            mood = userValidator.analyseMood("This is a SAD Message");
        } catch (userValidatorException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenPasswordIsValid() throws userValidatorException {
        UserValidator userValidator = new UserValidator("HAPPY");
        boolean result = userValidator.validatePasswordCheckOne("suraj@43536");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenPasswordIsInValid() {
        UserValidator userValidator = new UserValidator("SAD");
        boolean result = userValidator.validateFirstName("suar");
        Assertions.assertTrue(result);
        String mood = null;
        try {
            mood = userValidator.analyseMood("This is a SAD Message");
        } catch (userValidatorException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenPasswordIsvalidTwo() throws userValidatorException {
        UserValidator userValidator = new UserValidator("HAPPY");
        boolean result = userValidator.validatePasswordCheckTwo("Temkar231425");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenPasswordIsInValidTwo() {
        UserValidator userValidator = new UserValidator("SAD");
        boolean result = userValidator.validateFirstName("asfhagfh248728");
        Assertions.assertTrue(result);
        String mood = null;
        try {
            mood = userValidator.analyseMood("This is a SAD Message");
        } catch (userValidatorException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenPasswordIsvalidThird() throws userValidatorException {
        UserValidator userValidator = new UserValidator("HAPPY");
        boolean result = userValidator.validatePasswordCheckForth("Temkar@123");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenPasswordIsInValidThird() {
        UserValidator userValidator = new UserValidator("SAD");
        boolean result = userValidator.validateFirstName("sshgsda@46387");
        Assertions.assertTrue(result);
        String mood = null;
        try {
            mood = userValidator.analyseMood("This is a SAD Message");
        } catch (userValidatorException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenPasswordIsvalidForth() throws userValidatorException {
        UserValidator userValidator = new UserValidator("HAPPY");
        boolean result = userValidator.validatePasswordCheckForth("Temkar@123");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenPasswordIsInValidForth() {
        UserValidator userValidator = new UserValidator("SAD");
        boolean result = userValidator.validateFirstName("dfdhmt#6454.");
        Assertions.assertTrue(result);
        String mood = null;
        try {
            mood = userValidator.analyseMood("This is a SAD Message");
        } catch (userValidatorException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }
}