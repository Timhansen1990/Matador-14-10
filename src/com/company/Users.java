package com.company;

import java.util.Scanner;
public class Users {

    static String[] theUser = {Main.userName1, Main.userName2, Main.userName3};

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

}