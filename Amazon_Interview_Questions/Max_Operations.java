/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Amazon_Interview_Questions;

import java.util.*;

/**
 *
 * @author Shanmuga Priya M
 */
public class Max_Operations {
    public static void main(String[] args) {
        String s="abcddourtoirucbaadbc";
	String t="abcd";
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(char c:s.toCharArray()){
            hmap.put(c, hmap.getOrDefault(c,0)+1);
        }
        //System.out.println(hmap);
        int val=Integer.MAX_VALUE;
        for(char c:t.toCharArray()){
            if(!hmap.containsKey(c)){
                System.out.println(0);
                return;
            }
            if(hmap.get(c)<val){
                val=hmap.get(c);
            }
        }
        System.out.println(val);
    }
}
