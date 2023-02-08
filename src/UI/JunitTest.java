package UI;
import Algoritmos.*;
import Controller.IComparator;
import Controller.Sort;
import org.junit.Test;
import static org.junit.Assert.*;
import Controller.Sort.*;

public class JunitTest {

        @Test
        public void testSortRadix() {
            int[] arr = { 47, 23, 89, 56, 123, 456, 789, 12, 345, 678 };
            int[] expected = { 12, 23, 47, 56, 89, 123, 345, 456, 678, 789 };




            Radix.radixSort(arr);
            assertArrayEquals(expected, arr);
        }


    @Test
    public void testSelectionSort() {
        int[] arr = new int[] {64, 25, 12, 22, 11};
        int[] expected = new int[] {11, 12, 22, 25, 64};

        Selection.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testGnomeSort() {
        int[] arr = new int[] {64, 25, 12, 22, 11};
        int[] expected = new int[] {11, 12, 22, 25, 64};

        Gnome.gnomeSort(arr);

        assertArrayEquals(expected, arr);
    }


    @Test
    public void testQuickSort() {
        int[] arr = new int[] {64, 25, 12, 22, 11};
        int[] expected = new int[] {11, 12, 22, 25, 64};

        Quick.quickSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSort() {
        int[] arr = new int[] {64, 25, 12, 22, 11};
        int[] expected = new int[] {11, 12, 22, 25, 64};

        Merge.MergeSor(arr);

        assertArrayEquals(expected, arr);
    }

    }


