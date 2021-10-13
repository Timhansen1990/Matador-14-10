package com.company;

import java.util.Scanner;

public class Bank {

    public static void Purchase(int user, int buildingSite) {
        //Ask if the user/player want to buy a field
        //depending of the answer:
        //deduct User cashAmount, note user as owner of buildingSite
        //Printstatement


        Scanner wouldBuy = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Would you buy " + Field.field[buildingSite] + " for the little amount of "
                + Field.fieldPrice[buildingSite] + " dollars ?\n Write Yes or No");  
        String answer = wouldBuy.nextLine();

        if (answer.equals("Yes")|answer.equals("yes")) {
            User.cashAmount[user] = User.cashAmount[user] - Field.fieldPrice[buildingSite]; //TODO rename
            Field.field[user] = user;   //TODO rename
            System.out.println(User.user[user] + " have just bought " + Field.field[buildingSite] + " and welcome visitors");  //TODO rename
        }else{
            System.out.println("Just fine, I wish you good jurney, and greetings to all my neighbours please");
        }


    }
}
