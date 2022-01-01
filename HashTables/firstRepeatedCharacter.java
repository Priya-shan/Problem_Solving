/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTables;

import java.util.HashMap;
import java.util.*;

/**
 *
 * @author welcom
 */
public class firstRepeatedCharacter {

    public static void main(String args[]) {
        Map<Character, Integer> hmap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count;
        //apple
        for (char ch : str.toCharArray()) {
            count = hmap.containsKey(ch) ? hmap.get(ch) : 0;
            hmap.put(ch, count + 1);
        }
        // a:1, p:2, l:1, e:1
        for (char ch : str.toCharArray()) {
            if (hmap.get(ch) > 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
