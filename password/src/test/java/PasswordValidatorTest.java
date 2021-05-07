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

        Assertions.assertFalse(passwordValidator. testLengthPassword("aaa"));

    }

    @Test
    public void testNumber(){
        Assertions.assertFalse(passwordValidator. testNumber("adfvv"));
    }

    @Test
    public void testLetter(){

    }








}
