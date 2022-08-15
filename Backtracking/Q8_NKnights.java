/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Backtracking;

import java.util.*;

/**
 *
 * @author Shanmuga Priya M
 */
public class Q8_NKnights {
    public static void main(String[] args) {
//        int N=18;
//        int[] A={19, -19, 18, -10, 9, 6, 8, -9, -2, -2, -17, -20, 2, 1, -10, -20, 16, -9};
//        int N=6;
//        int[] A={-17,17,-17,-8,-13,8};
//        int N=4;
//        int[] A={-2,-7,9,6};
//        int N=6;
//        int[] A={-2,-7,-9,-6,0,9};
//        int N=28;
//        int[] A={-809313212, -739125425, -252016939, -93843502, 502820864, -857440723, 261608745, 380759627, -872695659, -364949821, -417308851, -850414907, -960664964, -179284951, -306985346, -877501228, 809302367, -408767270, 281246002, 194903572, 820868569, -603523685, -146440233, 910751391, 826393210, -317680370, -778877704, -903576937};
        int N=28; 
        int[] A={-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14,-15,-16,-17,-18,-19,1,2,3,4,5,6,7,8,9};
        int[] B=new int[N];
        ArrayList<Integer> lst=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> pos=new ArrayList<>();
        for(int i:A){
            if(i<0)
                neg.add(i);
            else
                pos.add(i);
        }
        ArrayList<Integer> lst2=new ArrayList<>();
        Collections.sort(pos);
        Collections.sort(neg);
        if(pos.size()==neg.size())
        Collections.reverse(neg);
        lst.addAll(neg);
        lst.addAll(pos);
        
        System.out.println(lst);
        int n=N-1;
        for(int i=0;i<N/2;i++){
            int mul=lst.get(i)*lst.get(n-i);
            lst2.add(mul);
        }
        long max=Integer.MIN_VALUE;
        for(int i:lst2){
            if(i>max){
                max=i;
            }
        }
        System.out.println(max);
    }

}
