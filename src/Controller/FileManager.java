package Controller;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FileManager {

    public static void saveNumbers(int[] arr){
        try (PrintWriter writer = new PrintWriter(new FileWriter("randNumbers.txt"))) {
            for (int i : arr) {
                writer.println(i);
            }
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    }


