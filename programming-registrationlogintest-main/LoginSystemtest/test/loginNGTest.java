/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author mulis
 */
public class loginNGTest {
    
    public loginNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of checkUserName method, of class login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        login instance = new login();
        String expResult = "";
        String result = instance.registerUser(username);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerPassword method, of class login.
     */
    @Test
    public void testRegisterPassword() {
        System.out.println("registerPassword");
        String password = "";
        login instance = new login();
        String expResult = "";
        String result = instance.registerPassword(password);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellPhoneNumber method, of class login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String phoneNumber = "";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(phoneNumber);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerCellPhone method, of class login.
     */
    @Test
    public void testRegisterCellPhone() {
        System.out.println("registerCellPhone");
        String phoneNumber = "";
        login instance = new login();
        String expResult = "";
        String result = instance.registerCellPhone(phoneNumber);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String savedUsername = "";
        String savedPassword = "";
        String enteredUsername = "";
        String enteredPassword = "";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.loginUser(savedUsername, savedPassword, enteredUsername, enteredPassword);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
