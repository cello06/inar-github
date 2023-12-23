package week_16.test;

import org.junit.jupiter.api.Test;
import week_16.java.LoginValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLoginValidate {
    @Test
    void testValidEmailAddress() {
        LoginValidator loginValidator = new LoginValidator();
        assertTrue(loginValidator.validateUsername("cello@gmail.com"), "validateUsername() method has a problem");
    }

    @Test
    void testingEmailWithoutAtSymbol() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername("cellogmail.com"), "validateUsername() method is not checking '@' symbol!");

    }

    @Test
    void testingEmailWithoutDomain() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername("cello@gmailcom"), "validateUsername() method is not checking domain area!");

    }

    @Test
    void testingEmailWithInvalidCharacters() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername("cello%&@gmail.com"), "validateUsername() method is not checking invalid characters!");
    }

    @Test
    void testingEmailWithEmptyString() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername(""), "validateUsername() method is not checking empty string!");
    }

    @Test
    void testingEmailWithNull() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validateUsername(null), "validateUsername() method is not checking null !");
    }

    @Test
    void testValidPassword() {
        LoginValidator loginValidator = new LoginValidator();
        assertTrue(loginValidator.validatePassword("cello.@Bello90"), "validatePassword() method has a problem");
    }

    @Test
    void testPasswordWithoutSpecialCharacter() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword("cello.Bello90"), "validatePassword() method is not checking special characters.");
    }

    @Test
    void testPasswordWithoutNumber() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword("cello.@Bello"), "validatePassword() method is not checking numbers.");
    }

    @Test
    void testPasswordWithTooShortInput() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword("c"), "validatePassword() method is not checking too short input.");
    }

    @Test
    void testPasswordWithTooLongInput() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword("cello.@Bllo90909090909090"), "validatePassword() method is not checking too long input.");
    }

    @Test
    void testPasswordWithEmptyString() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword(""), "validatePassword() method is not checking empty string input.");
    }

    @Test
    void testPasswordWithNull() {
        LoginValidator loginValidator = new LoginValidator();
        assertFalse(loginValidator.validatePassword(null), "validatePassword() method is not checking null.");
    }


}
