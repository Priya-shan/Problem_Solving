/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graphs;

import java.util.*;
import java.lang.*;
import java.io.*;

// https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
class Qn01_DFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        //testcase
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            //vertex and edge
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj =
                new ArrayList<ArrayList<Integer>>();
            //initializing adj list for each vertex
            for (int i = 0; i < V; i++) adj.add(new ArrayList<Integer>());
            //getting edge inputs (undirected graph)
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.dfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}



class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        HashSet<Integer> visited=new HashSet<>();
        ArrayList<Integer> res=new ArrayList<>();
        traverse(adj,visited,0,res);
        return res;
        
    }
    public void traverse(ArrayList<ArrayList<Integer>> adj,HashSet<Integer> visited,int curr,ArrayList<Integer> res){
        
        
        res.add(curr);
        visited.add(curr);
        for(int i:adj.get(curr)){
            // System.out.println(curr+" "+i);
            if(!visited.contains(i)){
                traverse(adj,visited,i,res);
            }
        }
        // System.out.println(res);
        // return res;
    }
}

/*Iterative - solution
Stack<Integer> st=new Stack<>();
        st.push(0);
        while(!st.isEmpty()){
            int curr=st.pop();
            if(!res.contains(curr)){
            res.add(curr);
            for(int i=adj.get(curr).size()-1;i>=0;i--){
                st.push(adj.get(curr).get(i));
            }
            }
            
        }
*/