/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backtracking;

import java.util.ArrayList;

/**
 *
 * @author welcom
 */
public class Q5_AllPathsl {
    public static void main(String[] args) {
        int n=4;
        int[][] m={
         {1, 0, 0, 0},
         {1, 1, 0, 1}, 
         {1, 1, 0, 0},
         {0, 1, 1, 1}
        };
         ArrayList<String> res=new ArrayList<>();
        res=printPaths(0, 0, "",m);
        System.out.println(res);
    }

    public static ArrayList<String> printPaths(int r, int c, String str,int[][] maze) {
        if (r == maze.length-1 && c==maze[0].length-1) {
            ArrayList<String> lst=new ArrayList<>();
            lst.add(str);
            System.out.println(str);
            return lst;
        }
        ArrayList<String> lst=new ArrayList<>();
        if(maze[r][c]==0){
            return lst;
        }
        maze[r][c]=0;
        if(r>0){
            lst.addAll(printPaths(r-1,c,str+"U",maze));
        }
        if(r<maze.length-1){
            lst.addAll(printPaths(r+1,c,str+"D",maze));
        }
        if(c>0){
            lst.addAll(printPaths(r,c-1,str+"L",maze));
        }
        if(c<maze[0].length-1){
            lst.addAll(printPaths(r,c+1,str+"R",maze));
        }
        maze[r][c]=1;
        return lst;
    }
}
