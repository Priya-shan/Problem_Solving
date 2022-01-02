/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_gfg;

import java.util.*;

/**
 *
 * @author welcom
 */
public class CountTheCharacters {

    public static void main(String args[]) {
        CountTheCharactersSolution obj = new CountTheCharactersSolution();
        System.out.println(obj.getCount("geeksforgeeks", 2));
    }
}

class CountTheCharactersSolution {

    int getCount(String s, int k) {
    
    
        Map<Character, Integer> hmap = new HashMap<>();
        String temp = s;

        StringBuilder sb = new StringBuilder(s);

        modifyString(sb);
        hmap = generateHashMap(sb);

        System.out.println(hmap);
        
        int count = 0;
        if (k == 0) {
            for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
                count++;
            }
            count = 26 - count;
            return count;
        }
        for (char ch : temp.toCharArray()) {
            //System.out.println("ch " + ch);
            if (hmap.containsKey(ch) && hmap.get(ch) == k) {
                //System.out.println("i entered");
                count++;
                hmap.remove(ch);
            }
        }
        
        return count;
    }

    //modifying string :::: geeksforgeeks --> geksforgeks
    void modifyString(StringBuilder sb) {
        int n = sb.length();
        for (int i = 0; i < n; i++) {
            //System.out.println("i: "+i+" i+1 : "+(i+1));
            if (i == n - 1) {
                break;
            }
            // System.out.println(sb.charAt(i)+"      "+sb.charAt(i+1));
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                n--;
                i--;
            }
        }
    }

    //generate hashmap ::::: {r=1, s=2, e=2, f=1, g=2, k=2, o=1}
    Map generateHashMap(StringBuilder sb) {
        Map<Character, Integer> hmap = new HashMap<>();
        String s = sb.toString();
        int count = 0;
        for (char ch : s.toCharArray()) {

            if (hmap.containsKey(ch)) {
                hmap.put(ch, hmap.get(ch) + 1);
            } else {
                hmap.put(ch, count + 1);
            }
        }
        return hmap;
    }
}

//Alternate approach  :::: [0, 0, 0, 0, 2, 1, 2, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0]
/*
int freq[] = new int[26];
        int n = S.length ();
    
        int i = 0, j;
        while (i < n)
        {
            j = i;
            while (j < n && S.charAt (j) == S.charAt (i)) j++;
            //System.out.println((int)(S.charAt (i) - 'a'));
            freq[(int)(S.charAt (i) - 'a')]++;
            
    
            i = j;
        }
        System.out.println(Arrays.toString(freq));
    
        int res = 0;
        for (i = 0; i < 26; ++i)
        {
            if (freq[i] == N)
                res++;
        }
        return res;
*/