package registrationloginsystem;

import java.util.Scanner;

public class RegistrationLoginSystem {

    static Scanner input = new Scanner(System.in);

    // -------- REGISTER --------
    public static String[] register() {
        System.out.println("=== REGISTER ===");

        // Username
        System.out.print("Enter username: ");
        String username = input.nextLine();

        boolean usernameValid;
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username successfully captured.");
            usernameValid = true;
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
            usernameValid = false;
        }

        // Password
        System.out.print("Enter password: ");
        String password = input.nextLine();

        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isDigit(c)) hasNumber = true;
            if ("!@#$%^&*()-_+=".contains(String.valueOf(c))) hasSpecial = true;
        }

        boolean passwordValid;
        if (password.length() >= 8 && hasUpper && hasNumber && hasSpecial) {
            System.out.println("Password successfully captured.");
            passwordValid = true;
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
            passwordValid = false;
        }

        // Phone
        System.out.print("Enter South African phone number (with +27): ");
        String phone = input.nextLine();

        boolean phoneValid;
        if (phone.startsWith("+27") && phone.length() <= 12) {
            System.out.println("Cell phone number successfully added.");
            phoneValid = true;
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            phoneValid = false;
        }

        if (usernameValid && passwordValid && phoneValid) {
            return new String[]{username, password};
        } else {
            System.out.println("Registration failed. Please try again.\n");
            return null;
        }
    }

    // -------- LOGIN --------
    public static void login(String storedUsername, String storedPassword) {
        System.out.println("\n=== LOGIN ===");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (username.equals(storedUsername) && password.equals(storedPassword)) {
            System.out.println("Welcome user, it is great to see you again.");
        } else {
            System.out.println("Username or password incorrect, please try again.");
        }
    }

    // -------- MAIN --------
    public static void main(String[] args) {

        String[] userDetails = register();

        if (userDetails != null) {
            login(userDetails[0], userDetails[1]);
        }
    }
}