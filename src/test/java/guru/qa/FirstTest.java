package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void FirstTest() {
        Assertions.assertTrue(5 > 0);
    }

    @Test
    void SecondTest() {
        Assertions.assertFalse(1 > -1);
    }
}
