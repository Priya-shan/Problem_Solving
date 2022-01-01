/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

/**
 *
 * @author welcom
 */
public class Maximizing_Scores {
    public static void main(String args[]){
    Solution obj=new Solution();
    long[] arr={-3,4};
        System.out.println(obj.solve(2,arr));
    }
}

class Solution {
  public long solve(int N, long[] A) {
      // your code goes here.
      int max=Integer.MIN_VALUE;
      while(N>0){
          for(int i=N;i<=A.length;i=i*N){
              System.out.println(i);
          }
          N--;
      }
      return -1;
    }
}
