/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graphs;

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author Shanmuga Priya M
 */

/*
1
6 6
2 3
3 1
4 0
4 1
5 0
5 2
*/
public class Qn04_TopologicalSort_BFS {
     public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                // adj.get(v).add(u);
            }
//            for(ArrayList<Integer> lst:adj)
//                System.out.println(".."+lst);
            
            
            ArrayList<Integer> ans =Sort(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
     }
     private static ArrayList<Integer> Sort(int V, ArrayList<ArrayList<Integer>> adj) {
        
        int[] indegree=new int[V];
        
        for(ArrayList<Integer> lst:adj){
            for(int i:lst){
                indegree[i]++;
            }
        }
         System.out.println(Arrays.toString(indegree));
         Queue<Integer> q=new ArrayDeque<>();
         for(int i=0;i<indegree.length;i++){
             if(indegree[i]==0){
                 q.add(i);
             }
         }
         ArrayList<Integer> ans=new ArrayList<>();
         while(!q.isEmpty()){
             int curr=q.remove();
             for(int i:adj.get(curr)){
                 indegree[i]-=1;
                 if(indegree[i]==0){
                     q.add(i);
                 }
             }
             ans.add(curr);
             
         }
        return ans;
    }
}
