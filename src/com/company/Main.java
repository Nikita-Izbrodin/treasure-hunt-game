package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] board = new int[4][4]; // 2D integer array with 4 rows and 4 columns

        Random random = new Random();
        int treasurePosX = random.nextInt(4);
        int treasurePosY = random.nextInt(4);

        board[treasurePosX][treasurePosY] = treasurePosX+1;
        /*
           0 0 0 0
           0 0 0 0
           0 0 0 0
           0 0 0 0
         */
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; ++j) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}