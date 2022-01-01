/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTables;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author welcom
 */
public class firstNonRepeatedCharacter {

    public static void main(String args[]) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String str = "a green apple";
        char[] ar = new char[str.length()];
        int count;
        ar = str.toCharArray();
        for (char ch : ar) {
            count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        for (char ch : ar) {
            if (map.get(ch) == 1) {
                System.out.println(ch);
                 break;
            }
           
        }
        //System.out.println(map);
    }
}
