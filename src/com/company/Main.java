package com.company;

public class Main {

    private static String userName1;
    private static String userName2;
    private static String userName3;
    private String Username3;
    public static void main(String[] args) {

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
        System.out.print("" + userName3 + " || ");
    }
}