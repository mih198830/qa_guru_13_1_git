package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void FirstTest() {
        Assertions.assertFalse(5 < 0);
    }
}
