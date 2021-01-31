package userValidator;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String firstName = "^[A-Z]{1}[a-z]{2,}$";
    private static final String lastName = "^[A-Z]{1}[a-z]{2,}$";
    private static final String Email = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private static final String phoneNumber = "^([0]+||[91]+) [0-9]{10}$";
    private static final String passwordEightCharacter = "^[a-zA-Z0-9]{8,}";
    private static final String passwordUpperCase = "^(?=.*?[A-Z][a-zA-Z0-9]{8,}";
    private static final String passwordAtLeastOneNumber= "^(?=.*?[A-Z])(?=.*?[0-9])[a-zA-Z0-9]{8,}";
    private static final String passwordAtLeastOneSpecialCharacter = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&+=])(?=\\S+$).{8,}";

    public boolean validateFirstName(String firstName){
        Pattern pattern = Pattern.compile(firstName);
        return pattern.matcher(firstName).matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(lastName);
        return pattern.matcher(lastName).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(email);
        return pattern.matcher(email).matches();
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(phoneNumber);
        return pattern.matcher(phoneNumber).matches();
    }

    public boolean validatePasswordCheckOne(String passwordEightCharacter) {
        Pattern pattern = Pattern.compile(passwordEightCharacter);
        return pattern.matcher(passwordEightCharacter).matches();
    }

    public boolean validatePasswordCheckTwo(String passwordUpperCase) {
        Pattern pattern = Pattern.compile(passwordUpperCase);
        return pattern.matcher(passwordUpperCase).matches();
    }
    public boolean validatePasswordCheckThree(String passwordAtLeastOneNumber) {
        Pattern pattern = Pattern.compile(passwordAtLeastOneNumber);
        return pattern.matcher(passwordAtLeastOneNumber).matches();
    }
    public boolean validatePasswordCheckForth(String passwordAtLeastOneSpecialCharacter) {
        Pattern pattern = Pattern.compile(passwordAtLeastOneSpecialCharacter);
        return pattern.matcher(passwordAtLeastOneSpecialCharacter).matches();
    }
    public String analyseMood(String message) {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";

    }

}
