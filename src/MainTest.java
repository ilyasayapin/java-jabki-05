import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MainTest {

    @Test
    void sumElements() {
        int[] testArray = {1, 1, 1, 1, 1};
        Assertions.assertEquals(5, Main.sumElements(testArray));
    }
}