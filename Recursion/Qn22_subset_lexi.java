/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.*;

/**
 *
 * @author welcom
 */
public class Qn22_subset_lexi {
    
}
class Solution1
{
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
        outer=gensubset(A);
        Collections.sort(outer, (o1, o2) -> {
            int n = Math.min(o1.size(), o2.size());
            int i = 0;
            for (i = 0; i < n; i++) {
                if (o1.get(i) == o2.get(i)){
                    continue;
                }
                if(o1.get(i) < o2.get(i)){
                    return -1;
                }
                return 1;
            }
            if(i<o2.size())
                return -1;
            if(i<o1.size())
                return 1;
            return 0;
        });
        
        return outer;
    }
    public static ArrayList<ArrayList<Integer>> gensubset(ArrayList<Integer> A){
        ArrayList<ArrayList<Integer>> outer =new ArrayList<ArrayList<Integer>>();
        outer.add(new ArrayList<>());
        for(int num:A){
            int n=outer.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}