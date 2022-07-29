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
public class Qn15_subset_iter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3};
        ArrayList<Integer> ip=new ArrayList<>();
        ip.add(5);
        ip.add(6);
        ip.add(6);
        ip.add(10);
        ip.add(3);
        ip.add(4);
        ip.add(6);
        ip.add(6);
        ip.add(4);
        ArrayList<ArrayList<Integer>> majorlst=subsets(ip);
        for(List<Integer> lst:majorlst){
            System.out.println(lst);
        }
    }
     public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
        outer=gensubset(A);
        Collections.sort(outer,new sorting());
        
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
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
class sorting implements Comparator<ArrayList<Integer>>{
    public int compare(ArrayList<Integer> o1,ArrayList<Integer> o2){
        int n=Math.min(o1.size(),o2.size());
        int res=0;
        for(int i=0;i<n;i++){
            if(o1.get(i)==o2.get(i)){
                continue;
            }
            res= o1.get(i)-o2.get(i);
        }
        return res;
    }
}