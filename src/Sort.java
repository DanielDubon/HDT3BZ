import java.util.Arrays;
import java.util.Comparator;

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
}