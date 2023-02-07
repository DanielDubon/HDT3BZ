package UI;
import org.junit.Test;
import static org.junit.Assert.*;

public class JunitTest {


        @Test
        public void testSort() {
            int[] arr = { 47, 23, 89, 56, 123, 456, 789, 12, 345, 678 };
            int[] expected = { 12, 23, 47, 56, 89, 123, 345, 456, 678, 789 };

            Sort.RadixSort.sort(arr);

            assertArrayEquals(expected, arr);
        }
    }


