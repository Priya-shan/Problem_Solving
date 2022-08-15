/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Amazon_Interview_Questions;

import java.util.*;
import java.util.Collections;

/**
 *
 * @author Shanmuga Priya M
 */
public class Final_Location {
    public static void main(String[] args) {
//        Integer[] location={ 1,7,6,8 };
//        Integer[] from={ 1,7,2 };
//        Integer[] to={ 2,9,5};
        
        Integer[] location={1,5,2,6};
        Integer[] from={1,4,5,7};
        Integer[] to={4,7,1,3};
        
        List<Integer> lst=new ArrayList<>();
        Collections.addAll(lst, location);
        Collections.addAll(lst, from);
        Collections.addAll(lst, to);
        
        int n=Collections.max(lst);
        
        int[] dp=new int[n];
//        System.out.println(Arrays.toString(dp));
        for(int i:location){
            dp[i-1]=1;
        }
//        System.out.println(Arrays.toString(dp));
        
        for(int i=0;i<from.length;i++){
            dp[from[i]-1]=0;
            dp[to[i]-1]=1;
        }
        for(int i=0;i<dp.length;i++){
            if(dp[i]==1){
                System.out.println(i+1);
            }
        }
//        System.out.println(Arrays.toString(dp));
    }
}
