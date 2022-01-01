/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTables;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author welcom
 */
public class uniquePairOfIntegersWithDiffK {
    public static void main(String args[]){
        Set<Integer> set=new HashSet<>();
        int[] arr={8, 12, 16, 4, 0, 20};
        int diff=4;
        for(int el:arr){
            set.add(el);
        }
        
        int count=0;
        for(int el:arr){
            if(set.contains(el+diff))
                count++;
            if(set.contains(el-diff))
                count++;
            set.remove(el);
        }
        System.out.println(count);
    }
}
