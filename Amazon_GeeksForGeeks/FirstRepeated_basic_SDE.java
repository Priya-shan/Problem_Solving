/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amazon_GeeksForGeeks;

import java.io.*;
import java.util.*;

/**
 *
 * @author welcom
 */
public class FirstRepeated_basic_SDE {
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution_FirstRepeated_basic_SDE ob = new Solution_FirstRepeated_basic_SDE();
            System.out.println(ob.firstRepChar(s));
        }
    }
}
class Solution_FirstRepeated_basic_SDE 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        Map<Character,Integer> hmap=new HashMap<>();
        int count;
        for(char c:s.toCharArray()){
            count=hmap.containsKey(c)?hmap.get(c):0;
            hmap.put(c,count+1);
            if(hmap.get(c)>1){
                return ""+c;
            }
        }
        return "-1";
    }
} 