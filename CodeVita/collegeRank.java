/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeVita;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/**
 *
 * @author welcom
 */
public class collegeRank {
    public static void main(String[] args) {
        marvel_solution obj=new marvel_solution();
       int c=3;
       int n=5;
       int[] seats={3,1,2};
       double[] starr={97.051132,48.032123,85.693132,80.834132,41.235123};
        System.out.println(Arrays.toString(starr));
       Arrays.sort(starr);
       String[] sarr=new String[starr.length];
       int index=0;
       for(int i=starr.length-1;i>=0;i--){
           sarr[index++]=Double.toString(starr[i]);
       }
        System.out.println(Arrays.toString(sarr));
        List<Integer> choice=new ArrayList<Integer>();
        for(int i=0;i<sarr.length;i++){
            int chstartidx=6;
            choice.clear();
            while(chstartidx<sarr[i].length()){
            choice.add(Integer.parseInt(sarr[i].substring(chstartidx,chstartidx+1)));
            chstartidx++;
            }
            //System.out.println(choice);
            if(seats[choice.get(0)-1]>0){
                System.out.println("Student-"+sarr[i].substring(5,6)+" C-"+choice.get(0));
                seats[choice.get(0)-1]=seats[choice.get(0)-1]-1;
                //System.out.println("seats"+Arrays.toString(seats));
            }
            else{
                choice.remove(0);
                System.out.println("seats "+Arrays.toString(seats));
                System.out.println("choice "+choice);
                i=i-1;
            }
        }
    }
}
