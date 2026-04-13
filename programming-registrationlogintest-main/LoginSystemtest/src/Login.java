
/**
 *
 * @author mulis
 */
public class Login {
   public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public String registerUser(String username) {
        if (checkUserName(username)) {
            return "Username successfully captured.";
        } else {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }
    }

    public boolean checkPasswordComplexity(String password) {
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasCapital = true;
                }

                if (Character.isDigit(ch)) {
                    hasNumber = true;
                }

                if (!Character.isLetterOrDigit(ch)) {
                    hasSpecial = true;
                }
            }     }

        return hasCapital && hasNumber && hasSpecial && password.length() >= 8;
    }

    public String registerPassword(String password) {
        if (checkPasswordComplexity(password)) {
            return "Password successfully captured.";
        } else {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
    } public boolean checkCellPhoneNumber(String phoneNumber) {
        return phoneNumber.startsWith("+27") && phoneNumber.length() <= 12;
    }

    public String registerCellPhone(String phoneNumber) {
        if (checkCellPhoneNumber(phoneNumber)) {
            return "Cell number successfully captured.";
        } else {
            return "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.";
        }
    }}