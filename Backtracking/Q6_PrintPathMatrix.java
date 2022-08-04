
package Backtracking;

import java.util.*;

/**
 *
 * @author welcom
 */
public class Q6_PrintPathMatrix {

    public static void main(String[] args) {
        int n = 4;
        int[][] m = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {1, 1, 0, 1},
            {0, 1, 1, 1}
        };
        int[][] path=new int[m.length][m[0].length];
        printPaths(0, 0, "", m,path,1);
    }

    public static void printPaths(int r, int c, String str, int[][] maze,int[][] paths,int pathcnt) {
        if(r==maze.length-1 && c==maze[0].length-1){
            paths[r][c]=pathcnt;
            for(int[] arr:paths){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(str);
            return;
        }
        if(maze[r][c]==0){
            return;
        }
        paths[r][c]=pathcnt;
        maze[r][c]=0;
        if(r<maze.length-1){
            printPaths(r+1,c,str+"D",maze,paths,pathcnt+1);
        }
        if(c<maze[0].length-1){
            printPaths(r,c+1,str+"R",maze,paths,pathcnt+1);
        }
        if(r>0){
            printPaths(r-1,c,str+"U",maze,paths,pathcnt+1);
        }
        if(c>0){
            printPaths(r,c-1,str+"U",maze,paths,pathcnt+1);
        }
        paths[r][c]=0;
        maze[r][c]=1;
        return;
    }
}
