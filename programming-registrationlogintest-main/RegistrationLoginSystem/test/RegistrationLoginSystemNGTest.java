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
import registrationloginsystem.RegistrationLoginSystem;

/**
 *
 * @author mulis
 */
public class RegistrationLoginSystemNGTest {
    
    public RegistrationLoginSystemNGTest() {
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
     * Test of register method, of class RegistrationLoginSystem.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        String[] expResult = null;
        String[] result = RegistrationLoginSystem.register();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class RegistrationLoginSystem.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String storedUsername = "";
        String storedPassword = "";
        RegistrationLoginSystem.login(storedUsername, storedPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class RegistrationLoginSystem.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RegistrationLoginSystem.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
