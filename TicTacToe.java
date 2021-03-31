package com.company;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        //welcome message
        System.out.println("Welcome to Tic Tac Toe Game");
        //TicTacToe Game board 3*3
        char[][] board = new char[3][3];
        //create board with dashes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        //Board
        printBoard(board);
        choose();

    }

    //for printing
    public static void printBoard(char[][] board) {
        //i represents the row
        for (int i = 0; i < 3; i++) {
            // j represents the column
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]); //for not printing to in oneline
            }
            System.out.println();
        }
    }
    //creating a method to choose between X or O
    public static void choose() {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose from X or O");
        String game = s.next();
        char player = 0;
        char computer;
        if (player == 'X') {
            computer = 'O';
        } else {
            computer = 'X';
        }
    }

    public static void playGame() {

    }


}
