/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NCompass_OnCampus;

import java.util.*;

/**
 *
 * @author welcom
 */
public class reocurrance {

    public static void main(String[] args) {
        String[] arr = {"abc", "bc", "zbc"};
        String minimal = "";
        int minlen = Integer.MAX_VALUE;
        for (String s : arr) {
            if (s.length() < minlen) {
                minlen = s.length();
                minimal = s;
            }
        }
        List<String> possibilities = new ArrayList<>();
        String res = "";
        for (int i = 0; i < minimal.length(); i++) {
            possibilities.add("" + minimal.charAt(i));
            res += minimal.charAt(i);
            for (int j = i + 1; j < minimal.length(); j++) {
                res += minimal.charAt(j);
                possibilities.add(res);
            }
        }
        String[] possib=new String[possibilities.size()];
        int index=0;
        for(String s:possibilities){
            possib[index++]=s;
        }
        Arrays.sort(possib, new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.length() - s1.length();
            }
        });
        System.out.println(solve(arr,possib));
        
    }
    public static int solve(String[] arr,String[] possib){
        for(int i=0;i<possib.length;i++){
            int flag=0;
            for(int j=0;j<arr.length;j++){
            if(!arr[j].contains(possib[i])){
                    flag=1;
                }
            }
            if(flag==0){
                return possib[i].length();
            }
        }
        return 0;
    }
}
