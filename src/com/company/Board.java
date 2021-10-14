package com.company;

public class Board {
    static int[] playerLocation = {0, 0, 0};

    public static void Start() {
        int i;

        while (playerLocation[0] <= 10 && playerLocation[1] <= 10 && playerLocation[2] <= 10) {

            for ( i = 0; i <= 2; i++) {

                int dice = Dice.RollResult(1); //Throw the dice
                //
                playerLocation[i] = playerLocation[i] + dice;//Move user x
                System.out.println("Player " + (i + 1)  + " Stands on field " + playerLocation[i]);
                //
                Bank.Purchase(i, playerLocation[i]);//if location is owned = pay = if player goes minus = Game Over, Terminate the game
                //            ask if want to buy = yes =buy
                //continue to next player

            } i = 0;
        }

    }
}
