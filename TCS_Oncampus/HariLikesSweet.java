/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCS_Oncampus;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Shanmuga Priya M
 */
public class HariLikesSweet {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            
        }
        
        
        int left = 0;
        int right = 0;

        int[] res = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            int left_val = -1;
            int ri8_val = -1;
            left = i;
            right = i;
            while (right < n) {
                if (arr[right] > arr[i]) {
                    ri8_val = Math.abs(i - right);
                    break;
                }
                right++;
            }
            while (left >= 0) {
                if (arr[left] > arr[i]) {
                    left_val = Math.abs(i - left);
                    break;
                }
                left--;
            }
            res[idx] = Math.min(left_val, ri8_val);
            if(res[idx]==-1){
                res[idx] = Math.max(left_val, ri8_val);
            }
            idx++;

        }
        for(int i=0;i<n;i++){
            
            if(res[i]==-1){
                res[i]=0;
            }
            else{
                res[i]=res[i]*2;
            }
        }
        System.out.println(Arrays.toString(res));
        
    }
}
