/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gfg_Problem_Of_The_Day;

/**
 * Jan-6-2022
 * @author welcom
 */
public class LongestCommonPrefix {

    public static void main(String args[]) {
        LongestCommonPrefixSolution obj = new LongestCommonPrefixSolution();
        String[] arr = {"geeksforgeeks", "geeks", "g", "geezer"};
        System.out.println(obj.longestCommonPrefix(arr, arr.length));
    }
}

class LongestCommonPrefixSolution {

    String longestCommonPrefix(String arr[], int n) {
        // code here
        int len = getLenOfSmallestString(arr);

        String res = "";
        StringBuilder sb = new StringBuilder(res);
        //System.out.println(len);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0 && sb.charAt(i) != arr[j].charAt(i)) {
                    sb.deleteCharAt(sb.length() - 1);
                    if (sb.length() < 1) {
                        return "-1";
                    } else {
                        return sb.toString();
                    }
                } 
                else if (j > 0 && sb.charAt(i) == arr[j].charAt(i)) {
                    continue;
                } 
                else {
                    sb = sb.append(arr[j].charAt(i));
                }
            }
        }
        return sb.toString();
    }

    private int getLenOfSmallestString(String[] arr) {
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < len) {
                len = arr[i].length();
            }
        }
        return len;
    }
}
