package com.company;

import java.util.Scanner;
public class Users {


    private static String userName1;
    private static String userName2;
    private static String userName3;
    //private String Username3;
    public static void writeUser() {

        System.out.print("Username: ");
        userName1 = Users.player1.nextLine();
        System.out.println("Player 1: " + userName1 );

        System.out.print("Username: ");
        userName2 = Users.player2.nextLine();
        System.out.println("Player 2: " + userName2 );

        System.out.print("Username: ");
        userName3 = Users.player3.nextLine();
        System.out.println("Player 3: " + userName3 );

        System.out.println("|| Player1 || Player 2 || Player3  ||");
        System.out.print("||   " + userName1 + "   || ");
        System.out.print(" " + userName2 + "  || ");
        System.out.println("" + userName3 + " || ");

        // De to linjer som står under udskriver information omkring navnet på ens placering og prisen.
        // På nuværende tidspunkt printer den kun første feldt i array'et
        System.out.println("Player 1 stands on " + Field.field[0]);
        System.out.println("som koster " + Field.fieldPrice[0]);


        // Det der står under, som er udkommenteret, udskriver alle værdierne i  de to arrays så de passer sammen
        /*for (int i = 0; i < Field.field.length; i++) {
            System.out.println("player 1 stands on " + Field.field[i] + " to the price " + Field.fieldPrice[i]);
        }*/
    }

    static Scanner player1 = new Scanner(System.in);
    static Scanner player2 = new Scanner(System.in);
    static Scanner player3 = new Scanner(System.in);

    public Scanner getPlayer1() {
        return player1;
    }

    public void setPlayer1(Scanner player1) {
        this.player1 = player1;
    }

    public Scanner getPlayer2() {
        return player2;
    }

    public void setPlayer2(Scanner player2) {
        this.player2 = player2;
    }

    public Scanner getPlayer3() {
        return player3;
    }

    public void setPlayer3(Scanner player3) {
        this.player3 = player3;
    }

    public static String[] theUser = new String[3];
}