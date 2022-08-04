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
public class Qn16_subset_iter_duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,2};
        List<List<Integer>> majorlst=subsetdeplicate(arr);
        for(List<Integer> lst:majorlst){
            System.out.println(lst);
        }
    }
    public static List<List<Integer>> subsetdeplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            else{
                start=0;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer> inner=new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
