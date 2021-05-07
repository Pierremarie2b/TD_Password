import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    static PasswordValidator passwordValidator;

    @BeforeAll
    public static void initPasswordValidator(){
        passwordValidator = new PasswordValidator();
    }

    @Test
    public void testLengthPassword(){
        Assertions.assertTrue(passwordValidator. testLengthPassword("aaaaaaa"));
    }

    @Test
    public void testSmallLengthPassword(){
        Assertions.assertFalse(passwordValidator. testLengthPassword("aaaa"));
    }

    @Test
    public void testNumber(){
        Assertions.assertTrue(passwordValidator. testNumber("0202020"));
    }

    @Test
    public void testNotOnlyNumber(){
        Assertions.assertFalse(passwordValidator. testNumber("aaaaa"));
    }

    @Test
    public void testLetter(){
        Assertions.assertTrue(passwordValidator. testLetter("adfvvdd"));
    }

    @Test
    public void testNotOnlyLetter(){
        Assertions.assertFalse(passwordValidator. testLetter("202020"));
    }








}
