/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Zoho_OnCampus;

import java.util.Arrays;

/**
 *
 * @author Shanmuga Priya M
 */
public class GameOfLife {
    public static void main(String[] args) {
        int[][] board={{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        int[][] res=new int[board.length][board[0].length];
        int row =0;
        rearrange(board,res,row);
        for(int[] arr:res){
            for(int el:arr){
                System.out.print(el+" ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    private static void rearrange(int[][] board, int[][] res, int row) {
        if(row==board.length){
            return;
        }
        
        for(int col=0;col<board[0].length;col++){
            res[row][col]=board[row][col];
            int alive=0;
            int dead=0;
            //up
            if(row>0){
                if(board[row-1][col]==1){
                 alive++;   
                }
                else{
                    dead++;
                }
            }
            //down
            if(row<board.length-1){
                if(board[row+1][col]==1){
                 alive++;   
                }
                else{
                    dead++;
                }
            }
            //right
            if(col<board[0].length-1){
                if(board[row][col+1]==1){
                 alive++;   
                }
                else{
                    dead++;
                }
            }
            //left
            if(col>0){
                if(board[row][col-1]==1){
                 alive++;   
                }
                else{
                    dead++;
                }
            }
            //left upper diagonal
            if(col>0 && row>0){
                if(board[row-1][col-1]==1){
                 alive++;   
                }
                else{
                    dead++;
                }
            }
            //left lower diagonal
            if(col>0 && row<board.length-1){
                if(board[row+1][col-1]==1){
                 alive++;   
                }
                else{
                    dead++;
                }
            }
            //right upper diagonal
            if(col<board[0].length-1 && row>0){
                if(board[row-1][col+1]==1){
                 alive++;   
                }
                else{
                    dead++;
                }
            }
            //right lower diagonal
            if(col<board[0].length-1 && row<board.length-1){
                if(board[row+1][col+1]==1){
                 alive++;   
                }
                else{
                    dead++;
                }
            }
            
            
            if(board[row][col]==0){
                if(alive==3){
                    res[row][col]=1;
                }
            }
            else{
                if(alive<2 || alive>3){
                    res[row][col]=0;
                }
            }
        }
        rearrange(board,res,row+1);
    }
}
