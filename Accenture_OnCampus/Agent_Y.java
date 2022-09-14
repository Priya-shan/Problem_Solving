/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accenture_OnCampus;

/**
 *
 * @author Shanmuga Priya M
 */
public class Agent_Y {

    public static void main(String[] args) {
        int[][] matrix = new int[8][8];
        int n = 2;
        int[][] loc = {{5, 5},{5,3}};
        for (int i = 0; i < n; i++) {
            int row = loc[i][0];
            int col = loc[i][1];
            matrix[row][col] = -1;

        }

        for (int[] i : loc) {
            fillRow(i[0], matrix);
            fillCol(i[1], matrix);
        }
        int cnt=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1 || matrix[i][j]==-1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }

    private static void fillRow(int i, int[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            if (matrix[i][col] == 0) {
                matrix[i][col] = 1;
            }
        }
    }

    
    private static void fillCol(int i, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][i] == 0) {
                matrix[row][i] = 1;
            }
        }
    }
}
