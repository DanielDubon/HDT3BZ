import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort <T> {
    public IComparator myCompare;

    public Sort(IComparator _Compare) {
        myCompare = _Compare;
    }

    public static void gnomeSort(Comparable[] arr) {  //move to right while elements grow larger, swap backwards while element grow smaller
        int index = 0;

        while (index < arr.length) {
            if (index == 0) {
                index++;
            }
        }
        if (arr[index].compareTo(arr[index - 1]) >= 0) {
            index++;
        } else {
            Comparable temp = arr[index];
            arr[index] = arr[index - 1];
            arr[index - 1] = temp;
            index--;
        }
    }
    public static void mergeSort(Comparable[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;
        Comparable[] left = Arrays.copyOfRange(arr, 0, mid);
        Comparable[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, (Comparator[]) arr);

    }

    private static void merge(Comparable[] left, Comparable[] right, Comparator[] arr) {

        int leftIndex = 0;
        int rightIndex = 0;
        int targetIndex = 0;

        while
        (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) <= 0) {
                arr[targetIndex] = (Comparator) left[leftIndex];
                leftIndex++;
            } else {
                arr[targetIndex] = (Comparator) right[rightIndex];
                rightIndex++;
            }
            targetIndex++;
        }
    }

    public void quickSort(T[] myArray, int inf, int sup) {
        int i = inf - 1;
        int j = sup;
        boolean flag = true;
        T temp;


        if (inf >= sup) {
            return;
        }

        T elem_div = myArray[sup];


        while (flag) {
            while(myCompare.Compare(myArray[++i], elem_div) < 0); //Move the index i until it finds an element bigger than elem_div
            while((myCompare.Compare(myArray[--j], elem_div) > 0)  && (j > inf)); //Move the index j until it finds element smaller than elem_div

            if (i < j) {
                temp = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = temp;
            } else {
                flag = false;
            }
        }

        temp = myArray[i];
        myArray[i] = myArray[sup];
        myArray[sup] = temp;
        quickSort(myArray, inf, i - 1);
        quickSort(myArray, i + 1, sup);
    }
    public class RadixSort {
        public static void sort(int[] arr) {
            final int RADIX = 10;

            List<Integer>[] bucket = new ArrayList[RADIX];
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new ArrayList<>();
            }

            boolean maxLength = false;
            int temp = -1, placement = 1;
            while (!maxLength) {
                maxLength = true;

                for (int i : arr) {
                    temp = i / placement;
                    bucket[temp % RADIX].add(i);
                    if (maxLength && temp > 0) {
                        maxLength = false;
                    }
                }

                int a = 0;
                for (int b = 0; b < RADIX; b++) {
                    for (int i : bucket[b]) {
                        arr[a++] = i;
                    }
                    bucket[b].clear();
                }

                placement *= RADIX;
            }
        }
    }
    public void selectionSort(T[] myArray)
    {
        int min;
        T temp;

        for (int index = 0; index < myArray.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < myArray.length; scan++) {
                if (myCompare.Compare(myArray[scan], myArray[min]) < 0) {
                    min = scan;
                }
            }

            temp = myArray[min];
            myArray[min] = myArray[index];
            myArray[index] = temp;
        }
    }
}