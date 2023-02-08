package Algoritmos;

public class Selection {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Recorre todos los elementos del arreglo
        for (int i = 0; i < n-1; i++) {
            // Encuentra el elemento mínimo en el resto del arreglo
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambia el elemento mínimo encontrado con el primer elemento sin ordenar
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }





}
