package UI;

import Algoritmos.*;
import Controller.FileManager;
import Controller.NumGenerator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * Class to generate random 3000 integer
     * and save it in a .txt
     *
     * @param args
     */

    public static boolean amenu = true;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        menu(in, NumGenerator.RandomGenerator());

    }

    public static void menu(Scanner in, int[] arr) {
        int[] desordenado = arr.clone();
        FileManager.saveNumbers(arr);
        Scanner scan = new Scanner(System.in);
        while (amenu) {
            desordenado = arr.clone();
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
                    System.out.println("Numeros desordenados: "+ Arrays.toString(desordenado));
                    Gnome.gnomeSort(desordenado);
                    System.out.println("Numeros ordenados: "+ Arrays.toString(desordenado));
                    break;

                case 2:
                    System.out.println("Numeros desordenados: "+ Arrays.toString(desordenado));
                    Merge.MergeSor(desordenado);
                    System.out.println("Numeros ordenados: "+ Arrays.toString(desordenado));
                    break;
                case 3:
                    System.out.println("Numeros desordenados: "+ Arrays.toString(desordenado));
                    Quick.quickSort(desordenado, 0, arr.length - 1);
                    System.out.println("Numeros ordenados: "+ Arrays.toString(desordenado));
                    break;

                case 4:
                    System.out.println("Numeros desordenados: "+ Arrays.toString(desordenado));
                    Radix.radixSort(desordenado);
                    System.out.println("Numeros ordenados: "+ Arrays.toString(desordenado));
                    break;

                case 5:
                    System.out.println("Numeros desordenados: "+ Arrays.toString(desordenado));
                    Selection.selectionSort(desordenado);
                    System.out.println("Numeros ordenados: "+ Arrays.toString(desordenado));
                    break;
                case 6:
                    amenu = false;
                   break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        }



    }
}
