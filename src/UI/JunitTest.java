package UI;
import Algoritmos.Radix;
import Controller.IComparator;
import Controller.Sort;
import org.junit.Test;
import static org.junit.Assert.*;
import Controller.Sort.*;

import java.util.Scanner;

public class JunitTest {
        public IComparator myCompare;
        public   Sort sort = new Sort(myCompare);
        @Test
        public void testSortRadix() {
            int[] arr = { 47, 23, 89, 56, 123, 456, 789, 12, 345, 678 };
            int[] expected = { 12, 23, 47, 56, 89, 123, 345, 456, 678, 789 };


            Radix.radixSort(arr);
            assertArrayEquals(expected, arr);

        }

    }


