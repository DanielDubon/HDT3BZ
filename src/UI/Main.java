package UI;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[3000];
        try {
            BufferedReader reader = new BufferedReader(new FileReader("RndmNum"));
            for (int i = 0; i < 3000;i++){
                num[i] = Integer.parseInt(reader.readLine());
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
}