import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MainTest {

    @Test
    void sumElements() {
        int[] testArray = {1, 1, 1, 1, 1};
        Assertions.assertEquals(5, Main.sumElements(testArray));
    }

    @Test
    void minimum() {
        int[] testArray = {1, 1, 0, 1, -1};
        Assertions.assertEquals(-1, Main.minimum(testArray));
    }

    @Test
    void sumElementsOfMatrix() {
        int[][] testMatrixx = {{0, 0, -1}, {0, -2, 0}, {0, 0, 1}};
        Assertions.assertEquals(-2, Main.sumElementsOfMatrix(testMatrixx));
    }

    @Test
    void buidArray() {
        int testRows = -1, testColumns = 2;
        assertThrows(IllegalArgumentException.class, () -> Main.buildArray(testRows, testColumns));
    }

    @Test
    void buidArraySecondTest() {
        int testRows = 3, testColumns = 3;
        int[][] testMatrix = {{0, 1, 0}, {1, 0, 1}, {0, 1, 0}};
        assertArrayEquals(testMatrix, Main.buildArray(testRows, testColumns));

    }
}