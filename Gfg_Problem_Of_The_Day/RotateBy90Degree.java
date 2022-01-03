/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gfg_Problem_Of_The_Day;

import java.util.Arrays;

/**
 *
 * @author welcom
 */
public class RotateBy90Degree {
     public static void main(String args[]){
        RotateBy90DegreeSolution obj=new RotateBy90DegreeSolution();
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        obj.rotate(matrix);
        
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
class RotateBy90DegreeSolution{
    static void rotate(int matrix[][]) 
    {
        int n=matrix.length;
        int[][] res=new int[n][n];
        for(int i=0;i<n;i++){
            int c=n-1;
            for(int j=0;j<n;j++){
                //System.out.println(i+" "+j+"------------>"+(c--)+" "+i);
               res[c--][i]=matrix[i][j];
                //c--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=res[i][j];
            }
        }
    }
}