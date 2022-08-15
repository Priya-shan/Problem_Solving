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
public class Minimum_Keypad {

    public static void main(String[] args) {
        char[] arr1 = new char[9];
        Arrays.fill(arr1, '0');
        char[] arr2 = new char[9];
        Arrays.fill(arr2, '0');
        char[] arr3 = new char[8];
        Arrays.fill(arr3, '0');
        
        
        String str = "hello";
        ArrayList<Character> lst = new ArrayList<>();
        int idx1=0,idx2=0,idx3=0;
        char val;
        
        HashMap<Character,Integer> hmap=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            val=str.charAt(i);
            if (!hmap.containsKey(val)) {
                if(arr1[8]=='0'){
                    arr1[idx1++]=val;
                    hmap.put(val, 1);
                }
                else if (arr2[8] == '0') {
                    arr2[idx2++]=val;
                    hmap.put(val, 2);
                }
                else{
                    arr3[idx3++]=val;
                    hmap.put(val, 3);
                }
            }
        }
        int count=0;
        for(char c:str.toCharArray()){
            count+=hmap.get(c);
        }
        System.out.println(count);

    }
}
