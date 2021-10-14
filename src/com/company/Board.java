package com.company;

public class Board {
    int playerLocation = 0;

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            int dice = Dice.RollResult(1); //Throw the dice
            //
            Field.place[dice] = i;//Move user x
            System.out.println(Field.place[dice] + " Stands on " + Field.field[dice]);
            //
            //if location is owned = pay = if player goes minus = Game Over, Terminate the game
            //            ask if want to buy = yes =buy
            //continue to next player
            System.out.println("fra dice = " + dice);
        }

    }
}
