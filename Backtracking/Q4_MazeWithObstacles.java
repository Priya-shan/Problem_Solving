/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backtracking;

import java.util.*;

/**
 *
 * @author welcom
 */
public class Q4_MazeWithObstacles {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        ArrayList<String> res=new ArrayList<>();
        int[][] maze={{0,0,0},{0,1,0},{0,0,0}};
        res=printPaths(m, n, "",maze);
        System.out.println(res);
    }
    public static ArrayList<String> printPaths(int m, int n, String str, int[][] maze) {
        if (m == 2 && n==2) {
            ArrayList<String> lst=new ArrayList<>();
            lst.add(str);
            System.out.println(str);
            return lst;
        }
        ArrayList<String> lst=new ArrayList<>();
        if(maze[m][n]==1){
            return lst;
        }
        if(m<2)
            lst.addAll(printPaths(m +1, n, str + "D",maze));
        if(n<2)
            lst.addAll(printPaths(m, n + 1, str + "R",maze));
        return lst;
    }
}
