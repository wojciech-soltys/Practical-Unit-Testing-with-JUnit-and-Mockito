package my.chp04;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Wojciech_Soltys on 29.12.2016.
 */
public class PasswordValidatorTest {

    @Test
    public void validateValidPassword() throws Exception {
        assertTrue(PasswordValidator.validatePassword("Test123@#"));
    }

    @Test
    public void validateInvalidPassword() throws Exception {
        assertFalse(PasswordValidator.validatePassword("test1234"));
    }
}
