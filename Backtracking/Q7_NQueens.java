/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backtracking;

/**
 *
 * @author Shanmuga Priya M
 */
public class Q7_NQueens {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int row = 0;
        calculate(board, row);
    }

    private static int calculate(boolean[][] board, int row) {
        if (row == board.length) {
            System.out.println("--------");
            display(board);
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count = count + calculate(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;

    }

    private static void display(boolean[][] board) {
        for (boolean[] arr : board) {
            for (boolean element : arr) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }

            System.out.println("");
        }

        System.out.println("");
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //vertical
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        //diagonal left
        for(int i=1;i<=Math.min(row, col);i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //diagonal right
        int val=Math.min(row, board.length-col-1);
        for(int i=0;i<=val;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

}
