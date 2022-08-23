/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genpact_OnCampus;

/**
 *
 * @author Shanmuga Priya M
 */
import java.util.*;

public class Group_anagram {

    public static void main(String[] args) {
       List<String> words = new ArrayList<>();
        words.add("inch");
        words.add("cat");
        words.add("chin");
        words.add("kit");
        words.add("act");
        System.out.println(getGroupedAnagrams(words));
    }

    public static int getGroupedAnagrams(List<String> words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : words) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String current = "";
            for (char c : arr) {
                current += c;
            }
            map.put(current, map.getOrDefault(current, 0) + 1);
        }
        return map.size();
    }

    public static String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String res = "";
        for (char c : arr) {
            res += c;
        }
        return res;
    }
}
