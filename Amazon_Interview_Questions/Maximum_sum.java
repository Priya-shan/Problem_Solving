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
//stock price
public class Maximum_sum {
    public static void main(String[] args) {
        int[] nums={1, 2,7,7,4,3,6};
        int left=0,res=-1,sum=0;
        int k=3;
        ArrayList<Integer> lst=new ArrayList<>();
        for(int right=0;right<nums.length;right++){
//            System.out.println("--->"+nums[right]);
            
            while(left<right && (lst.size()>=k || lst.contains(nums[right]))){
//                System.out.println("entered hwile");
                sum=sum-nums[left];
                lst.remove(Integer.valueOf(nums[left]));
//                System.out.println(lst);
                left++;
            }
            sum=sum+nums[right];
            lst.add(nums[right]);
//            System.out.println(lst);
            if(lst.size()==k){
                res=Math.max(sum, res);
//                System.out.println("res updated " + res);
            }
        }
        System.out.println(res);
    }
}
