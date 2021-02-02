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

        try {
            userValidator.analyseMood(null);
        } catch (userValidatorException e) {
            Assertions.assertEquals("please Enter proper message", e.getMessage());
        }
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

        try {
            userValidator.analyseMood(null);
        } catch (userValidatorException e) {
            Assertions.assertEquals("please Enter proper message", e.getMessage());
        }
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

        try {
            userValidator.analyseMood(null);
        } catch (userValidatorException e) {
            Assertions.assertEquals("please Enter proper message", e.getMessage());
        }
    }

    @Test
    public void givenPhoneNumberIsValid() throws userValidatorException {
        UserValidator userValidator = new UserValidator("HAPPY");
        boolean result = userValidator.validatePhoneNumber("Te@kar");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenPhoneNumberIsInValid() {
        UserValidator userValidator = new UserValidator("SAD");

        try {
            userValidator.analyseMood(null);
        } catch (userValidatorException e) {
            Assertions.assertEquals("please Enter proper message", e.getMessage());
        }
    }
    @Test
    public void givenPasswordIsValid() throws userValidatorException {
        UserValidator userValidator = new UserValidator("HAPPY");
        boolean result = userValidator.validatePasswordCheckOne("surajt43536");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenPasswordIsInValid() {
        UserValidator userValidator = new UserValidator("SAD");

        try {
            userValidator.analyseMood(null);
        } catch (userValidatorException e) {
            Assertions.assertEquals("please Enter proper message", e.getMessage());
        }
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

        try {
            userValidator.analyseMood(null);
        } catch (userValidatorException e) {
            Assertions.assertEquals("please Enter proper message", e.getMessage());
        }
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

        try {
            userValidator.analyseMood(null);
        } catch (userValidatorException e) {
            Assertions.assertEquals("please Enter proper message", e.getMessage());
        }
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
        UserValidator userValidator = new UserValidator(null);
        try {
            userValidator.analyseMood(null);
        } catch (userValidatorException e) {
            Assertions.assertEquals("please Enter proper message", e.getMessage());
        }
    }

}