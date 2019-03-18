import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.security.util.Password;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorImplTest {


    @Test
    public void correctLength() {
        PasswordGeneratorImpl passwordGenerator = new PasswordGeneratorImpl();
        String password = passwordGenerator.generate(
                new PasswordGeneratorParameters(5, true, true, true, true)
        );
        Assertions.assertTrue(password.length() == 5);

    }
}