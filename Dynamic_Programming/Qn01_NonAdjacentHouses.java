/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic_Programming;

import java.util.*;

/**
 *
 * @author Shanmuga Priya M
 */
//https://www.codingninjas.com/codestudio/problems/maximum-sum-of-non-adjacent-elements_843261
//above is pick non pick format
public class Qn01_NonAdjacentHouses {

    public static void main(String args[]) {
        // Write your code here.
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(9);
        nums.add(8);
        nums.add(2);
        int[] dp = new int[nums.size() + 1];
        int idx = 0;
        for (int i : nums) {
            dp[idx++] = -1;
        }
        if(nums.size()==1){
            System.out.println("result-"+nums.get(0));
            return;
        }
        if(nums.size()==2){
            System.out.println("result-"+Math.max(nums.get(0), nums.get(1)));
            return;
        }
        int max = Integer.MIN_VALUE;
        for (int i = nums.size() - 1; i >= 2; i--) {
            int res = find(i, nums, dp);
//             System.out.println("res "+res);
            if (max < res) {
                max = res;
            }
            System.out.println(i + " " + max);
        }
        System.out.println(max);
    }

    public static int find(int idx, ArrayList<Integer> nums, int[] dp) {
        if (idx == 1 || idx == 0) {
            return dp[idx] = nums.get(idx);
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 2; i < nums.size(); i++) {
//             System.out.println("loop"+i);
            if(idx-i>=0){
            int res = find(idx - i, nums, dp);
            if (max < res) {
                max = res;
            }
            }
//             System.out.println(max);
        }
//         System.out.println(idx);
//         System.out.println(max);
//         System.out.println(nums);
//         System.out.println(nums.get(idx));
        return dp[idx] = max + nums.get(idx);
    }
}
