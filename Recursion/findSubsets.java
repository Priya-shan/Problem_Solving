/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author welcom
 */
public class findSubsets {
    public static void main(String[] args) {
        findSubsets_solution obj=new findSubsets_solution();
        int[] arr={1,2,2};
        List<List<Integer>> ans = obj.subset(arr);
        System.out.println(ans);
    }
}
class findSubsets_solution{
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
            List<Integer> internal=new ArrayList<>(outer.get(i));
            internal.add(num);
            outer.add(internal);
            }
        }
        return outer;
    }
} 