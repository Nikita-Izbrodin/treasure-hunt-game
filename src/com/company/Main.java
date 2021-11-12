package com.company;

import java.util.*;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        String[][] board = new String[4][4]; // 2D integer array with 4 rows and 4 columns

        Random random = new Random();
        int treasurePosX = random.nextInt(4);
        int treasurePosY = random.nextInt(4);
        board[treasurePosX][treasurePosY] = "$";

        treasurePosX = random.nextInt(4);

        treasurePosY = random.nextInt(4);
        board[treasurePosX][treasurePosY] = "$";
        /*
           0 0 0 0
           0 0 0 0
           0 0 0 0
           0 0 0 0
         */
        System.out.println("   1  2  3  4");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i+1 + " ");
            for (int j = 0; j < board.length; ++j) {
                if (board[i][j] != null) {
                    System.out.printf("[%s]", board[i][j]);
                }
                else {
                    System.out.print("[ ]");
                }
                // != $ == null
                // == $ != null
            }
            System.out.println();
        }

        while (true) {
            int userInp = input.nextInt();

        }

    }
}
