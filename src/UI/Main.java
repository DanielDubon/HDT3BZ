package UI;

import Algoritmos.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * Class to generate random 3000 integer
     * and save it in a .txt
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = new int[3000];
        try {
            BufferedReader reader = new BufferedReader(new FileReader("RndmNum"));
            for (int i = 0; i < 3000; i++) {
                arr[i] = Integer.parseInt(reader.readLine());
                {
                    reader.close();
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error while reading from file" + e.getMessage());
            throw new RuntimeException(e);
        }

    }
    public static boolean menu(Scanner in, int[] arr) {
            Scanner scan = new Scanner(System.in);
            //Menu settings
            System.out.println(" -----MENU----");
            System.out.println(" -------------");
            System.out.println("1. Gnome sort");
            System.out.println("2. Merge sort");
            System.out.println("3. Quick sort");
            System.out.println("4. Radix Sort");
            System.out.println("5. Selection Sort");
            System.out.println("6. Salir");
            System.out.print("Seleccione un Algortimo Sort a utilizar para ordenar: ");
            int opcion = scan.nextInt();

            //Menu de opciones para los Algortimos Sort
            switch (opcion) {
                case 1:
                    Gnome.gnomeSort(arr);
                    break;

                case 2:
                    Merge.MergeSor(arr);
                    break;
                case 3:
                    Quick.quickSort(arr, 0, arr.length -1);
                    break;

                case 4:
                    Radix.radixSort(arr);
                    break;

                case 5:
                    Selection.selectionSort(arr);
                    break;
                case 6:
                    return false;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        return false;
    }
}

