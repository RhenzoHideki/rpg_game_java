package org.example;

import java.util.Random;

public class Tools {
    void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    int fairDice(int aux) {
        // Initialize the Random object with the current time as the seed
        Random random = new Random(System.currentTimeMillis());

        // Generate a random number between 1 and aux
        int randomNumber = random.nextInt(aux) + 1;
        return randomNumber;
    }

}
