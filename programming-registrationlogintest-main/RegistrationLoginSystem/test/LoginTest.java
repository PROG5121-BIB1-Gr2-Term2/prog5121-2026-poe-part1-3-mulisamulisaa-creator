
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class LoginTest {

    Login login = new Login();

    @Test
    public void testCorrectUsername() {
        boolean result = login.checkUserName("kyl_1");
        assertTrue(result);
    }

    @Test
    public void testIncorrectUsername() {
        boolean result = login.checkUserName("kyle!!!!!!");
        assertFalse(result);
    }

    @Test
    public void testUsernameMessageCorrect() {
        String result = login.registerUser("kyl_1");
        assertEquals("Username successfully captured.", result);
    }

    @Test
    public void testUsernameMessageIncorrect() {
        String result = login.registerUser("kyle!!!!!!");
        assertEquals("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.", result);
    }

    @Test
    public void testPasswordCorrect() {
        boolean result = login.checkPasswordComplexity("Ch&&sec@ke99!");
        assertTrue(result);
    }

    @Test
    public void testPasswordIncorrect() {
        boolean result = login.checkPasswordComplexity("password");
        assertFalse(result);
    }

    @Test
    public void testPasswordMessageCorrect() {
        String result = login.registerPassword("Ch&&sec@ke99!");
        assertEquals("Password successfully captured.", result);
    }

    @Test
    public void testPasswordMessageIncorrect() {
        String result = login.registerPassword("password");
        assertEquals("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.", result);
    }

    @Test
    public void testCellPhoneCorrect() {
        boolean result = login.checkCellPhoneNumber("+27838968976");
        assertTrue(result);
    }

    @Test
    public void testCellPhoneIncorrect() {
        boolean result = login.checkCellPhoneNumber("08966553");
        assertFalse(result);
    }

    @Test
    public void testCellPhoneMessageCorrect() {
        String result = login.registerCellPhone("+27838968976");
        assertEquals("Cell number successfully captured.", result);
    }

    @Test
    public void testCellPhoneMessageIncorrect() {
        String result = login.registerCellPhone("08966553");
        assertEquals("Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.", result);
    }

    @Test
    public void testLoginSuccessful() {
        boolean result = login.loginUser("kyl_1", "Ch&&sec@ke99!", "kyl_1", "Ch&&sec@ke99!");
        assertTrue(result);
    }

    @Test
    public void testLoginFailed() {
        boolean result = login.loginUser("kyl_1", "Ch&&sec@ke99!", "wrongUser", "wrongPass");
        assertFalse(result);
    }
}