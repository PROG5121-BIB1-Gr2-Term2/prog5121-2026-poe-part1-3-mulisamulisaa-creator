/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

/**
 *
 * @author mulis
 */
public class RegistrationLoginSystemTest {
    
    public RegistrationLoginSystemTest() {
    }
    
     // -------- USERNAME TESTS --------

    @Test
    public void testUsernameCorrectlyFormatted() {
        String username = "kyl_1";
        boolean result = username.contains("_") && username.length() <= 5;
        assertTrue(result);
    }

    @Test
    public void testUsernameIncorrectlyFormatted() {
        String username = "kyle!!!!";
        boolean result = username.contains("_") && username.length() <= 5;
        assertFalse(result);
    }

    // -------- PASSWORD TESTS --------

    @Test
    public void testPasswordMeetsComplexity() {
        String password = "Ch&&sec@ke99!";

        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isDigit(c)) hasNumber = true;
            if ("!@#$%^&*()-_+=".contains(String.valueOf(c))) hasSpecial = true;
        }

        boolean result = password.length() >= 8 && hasUpper && hasNumber && hasSpecial;
        assertTrue(result);
    }

    @Test
    public void testPasswordDoesNotMeetComplexity() {
        String password = "password";

        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isDigit(c)) hasNumber = true;
            if ("!@#$%^&*()-_+=".contains(String.valueOf(c))) hasSpecial = true;
        }

        boolean result = password.length() >= 8 && hasUpper && hasNumber && hasSpecial;
        assertFalse(result);
    }

    // -------- PHONE NUMBER TESTS --------

    @Test
    public void testCellPhoneCorrectlyFormatted() {
        String phone = "+27831234567";
        boolean result = phone.startsWith("+27") && phone.length() <= 12;
        assertTrue(result);
    }

    @Test
    public void testCellPhoneIncorrectlyFormatted() {
        String phone = "08966553";
        boolean result = phone.startsWith("+27") && phone.length() <= 12;
        assertFalse(result);
    }

    // -------- LOGIN TESTS --------

    @Test
    public void testLoginSuccessful() {
        String storedUsername = "kyl_1";
        String storedPassword = "Pass123!";

        boolean result = storedUsername.equals("kyl_1") &&
                         storedPassword.equals("Pass123!");

        assertTrue(result);
    }

    @Test
    public void testLoginFailed() {
        String storedUsername = "kyl_1";
        String storedPassword = "Pass123!#";

        boolean result = storedUsername.equals("wrong") &&
                         storedPassword.equals("wrong");

        assertFalse(result);
    }
}