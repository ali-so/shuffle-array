package com.aliso.shuffle;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int temp;

        for (int i = 0; i < myArray.length; i++) {
            Random rand = new Random();
            temp = myArray[i];
            int randomInteger = rand.nextInt(myArray.length);
            myArray[i] = myArray[randomInteger];
            myArray[randomInteger] = temp;
        }

        Arrays.stream(myArray, 0, myArray.length).forEach(i-> System.out.print(i));
    }
}
