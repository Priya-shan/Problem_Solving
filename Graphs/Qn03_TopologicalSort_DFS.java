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
6 6
2 3
3 1
4 0
4 1
5 0
5 2
*/
public class Qn03_TopologicalSort_DFS {
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
            
            
            ArrayList<Integer> ans =topologicaSort(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }

    private static ArrayList<Integer> topologicaSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] visited=new int[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            //visited[i]=1;
            dfs(i,adj,st,visited);
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(!st.isEmpty()){
            res.add(st.pop());
        }
        return res;
    }

    private static void dfs(int curr,ArrayList<ArrayList<Integer>> adj,Stack<Integer> st,int[] visited) {
        
        if(visited[curr]==1){
            return;
        }
        for(int i:adj.get(curr)){
            dfs(i,adj,st,visited);
        }
            st.push(curr);
            visited[curr]=1;
        
    
    }
}
