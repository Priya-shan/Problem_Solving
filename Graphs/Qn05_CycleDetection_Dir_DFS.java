/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graphs;

import java.io.*;
import java.util.*;

/**
 *
 * @author Shanmuga Priya M
 */
/*
1
9 11
0 1
1 2
2 3
2 6
3 4
4 5
6 4
7 1
7 8
8 9
9 7
*/
public class Qn05_CycleDetection_Dir_DFS {
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
            
            
            System.out.println(detect(V, adj));
            
        }
     }

    private static boolean detect(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] visited=new int[V];
        int[] pathVisited=new int[V];
        for(int i=0;i<V;i++){
            if(visited[i]==0){
                if(dfs(i,adj,visited,pathVisited)==true){
                    return true;
                }
            }
        }
        return false; 
     }

    private static boolean dfs(int curr, ArrayList<ArrayList<Integer>> adj, int[] visited,int[] pathVisited) {
        visited[curr]=1;
        pathVisited[curr]=1;
        for(int i:adj.get(curr)){
            if(visited[i]==0){
                if(dfs(i,adj,visited,pathVisited)==true){
                    return true;
                }
            }
            else if(visited[i]==1 && pathVisited[i]==1){
                return true;
            }
        }
        pathVisited[curr]=0;
        return false;
    }
}

//using bfs - same khans algorithm (topo sort) after sorting if size==v then no cycle else cylce
