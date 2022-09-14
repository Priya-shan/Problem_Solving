/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graphs;

/**
 *
 * @author Shanmuga Priya M
 */
//https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
import java.util.*;
import java.lang.*;
import java.io.*;
class Qn02_BFS {
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
            ArrayList<Integer> ans =bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue<Integer> q=new ArrayDeque<>();
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<Integer> visited=new ArrayList<>();
        q.add(0);
        visited.add(0);

        traverse(adj,res,q,visited);
        return res;
    }
    public static void traverse(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res,Queue<Integer> q,ArrayList<Integer> visited){
        
        if(q.isEmpty()){
            return;
        }
        int curr=q.remove();
        res.add(curr);
        for(int i:adj.get(curr)){
            if(!visited.contains(i)){
                visited.add(i);
                q.add(i);
            }
        }
        traverse(adj,res,q,visited);
    }
/*Iterative Solution
Queue<Integer> q=new ArrayDeque<>();
        ArrayList<Integer> res=new ArrayList<>();
        q.add(0);
        
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!res.contains(curr)){
                res.add(curr);
            }
            for(int i:adj.get(curr)){
                q.add(i);
            }
        }
        return res;
*/
}