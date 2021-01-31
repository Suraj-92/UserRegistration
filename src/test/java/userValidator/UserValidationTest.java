package userValidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    @Test
    public void givenFirstNameReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Suraj");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenFirstNameIsFalse() throws Exception{
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Sur@j");
        Assertions.assertFalse(result);
        String mood = userValidator.analyseMood("This is Sad message");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenLastNameIsTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Temkar");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenLastNameIsFalse() throws Exception{
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Te@kar");
        Assertions.assertFalse(result);
        String mood = userValidator.analyseMood("This is Sad message");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenEmailIsValid() throws Exception{
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("Te@kar");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenEmailIsInvalid() throws Exception{
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("Te@kar");
        Assertions.assertFalse(result);
        String mood = userValidator.analyseMood("This is Sad message");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenPhoneNumberIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhoneNumber("Te@kar");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenPhoneNumberIsInvalid() throws Exception{
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhoneNumber("Te@kar");
        Assertions.assertFalse(result);
        String mood = userValidator.analyseMood("This is Sad message");
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenPasswordIsValid() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePasswordCheckOne("surajt43536");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenPasswordIsInvalid() throws Exception{
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePasswordCheckOne("Temkar");
        Assertions.assertFalse(result);
        String mood = userValidator.analyseMood("This is Sad message");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenPasswordIsvalidTwo() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePasswordCheckTwo("Temkar231425");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenPasswordIsInvalidTwo() throws Exception{
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePasswordCheckTwo("temkar231425");
        Assertions.assertFalse(result);
        String mood = userValidator.analyseMood("This is Sad message");
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenPasswordIsvalidThree() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePasswordCheckThree("Temkar123");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenPasswordIsInvalidThree() throws Exception{
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePasswordCheckThree("temkar32255");
        Assertions.assertFalse(result);
        String mood = userValidator.analyseMood("This is Sad message");
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenPasswordIsvalidForth() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePasswordCheckForth("Temkar@123");
        Assertions.assertTrue(result);
        String mood = userValidator.analyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenPasswordIsInvalidForth() throws Exception{
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePasswordCheckForth("surajr355");
        Assertions.assertFalse(result);
        String mood = userValidator.analyseMood("This is Sad message");
        Assertions.assertEquals("SAD", mood);

    }

}