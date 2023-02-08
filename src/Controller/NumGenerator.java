package Controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumGenerator {

    public static int[] RandomGenerator(){
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int cantidad = in.nextInt();
        int[] randomNumbers = new int[cantidad];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(3000);
        }
        System.out.println("Random numbers: " + Arrays.toString(randomNumbers));
        return randomNumbers;
    }

    }



