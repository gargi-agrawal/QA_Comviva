package org.example.services.EmailValidationTest;

import org.example.services.EmailValidation.EmailValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
    @Test
    public void ensureThatEmailValidatorReturnsTrueForValidEmail() {
        EmailValidator emailValidatorObj = new EmailValidator();
        Assertions.assertTrue(emailValidatorObj.isValidEmail("user@gmail.com"));
    }

    @Test
    public void emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        EmailValidator emailValidatorObj = new EmailValidator();
        Assertions.assertFalse(emailValidatorObj.isValidEmail("@example.com"));
    }

    @Test
    public void emailValidator_EmptyString_ReturnsFalse() {
        EmailValidator emailValidatorObj = new EmailValidator();
        Assertions.assertFalse(emailValidatorObj.isValidEmail(""));
    }

    @Test
    public void emailValidator_NullEmail_ReturnsFalse() {
        EmailValidator emailValidatorObj = new EmailValidator();
        Assertions.assertFalse(emailValidatorObj.isValidEmail(null));
    }

    @Test
    public void testIsValidEmailWhitespace() {
        EmailValidator emailValidatorObj = new EmailValidator();
        Assertions.assertFalse(emailValidatorObj.isValidEmail("user @example.com"));
    }

    @Test
    public void testIsCorporateEmailCorporate() {
        EmailValidator emailValidatorObj = new EmailValidator();
        Assertions.assertTrue(emailValidatorObj.isCorporateEmail("user@company.com"));
    }

    @Test
    public void testIsCorporateEmailNonCorporate() {
        EmailValidator emailValidatorObj = new EmailValidator();
        Assertions.assertFalse(emailValidatorObj.isCorporateEmail("user@example.com"));
    }
}
