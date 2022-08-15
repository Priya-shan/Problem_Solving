/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amazon_Interview_Questions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Shanmuga Priya M
 */
public class Demo_SortSummary_Hmap {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(1);
//arr.add(7);
//arr.add(12);
//arr.add(3);
        List<List<Integer>> result = groupSort(arr);
        for (List<Integer> i : result) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static List<List<Integer>> groupSort(List<Integer> arr) {
       List<List<Integer>> main = new ArrayList<List<Integer>>();
        List<Integer> lst;
        Map<Integer, Integer> hmap = new TreeMap<>();
        int count = 0;
        for (int i : arr) {
            if (hmap.containsKey(i)) {
                count = hmap.get(i);
                hmap.put(i, count + 1);
            } else {
                count = 0;
                hmap.put(i, count + 1);
            }
        }
        //sort freq(values) by ascending
        LinkedHashMap<Integer, Integer> sortedMapAsc = new LinkedHashMap<>();

        hmap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMapAsc.put(x.getKey(), x.getValue()));
        
        System.out.println("Sorted Hashmap in ascending order by values");
        System.out.println(sortedMapAsc);
        
        //sort freq(values) by descending
        LinkedHashMap<Integer, Integer> sortedMapDesc = new LinkedHashMap<>();

        hmap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMapDesc.put(x.getKey(), x.getValue()));
        
        System.out.println("Sorted Hashmap in descending order by values");
        System.out.println(sortedMapDesc);
        
        //sort keys by ascending
        LinkedHashMap<Integer, Integer> sortedMapAscKeys = new LinkedHashMap<>();

        hmap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> sortedMapAscKeys.put(x.getKey(), x.getValue()));
        
        System.out.println("Sorted Hashmap in ascending order by keys");
        System.out.println(sortedMapAscKeys);
        
        //sort keys by descending
        LinkedHashMap<Integer, Integer> sortedMapDescKeys = new LinkedHashMap<>();

        hmap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMapDescKeys.put(x.getKey(), x.getValue()));
        
        System.out.println("Sorted Hashmap in descending order by keys");
        System.out.println(sortedMapDescKeys);
        
        //append in main list
        for (Map.Entry<Integer, Integer> entry : sortedMapDesc.entrySet()) {
            lst = new ArrayList<>();
            lst.add(entry.getKey());
            lst.add(entry.getValue());
            main.add(lst);
        }
        
        return main;
    }

    private static boolean containsSameFreq(Map<Integer, Integer> hmap) {
        return true;
    }
}
