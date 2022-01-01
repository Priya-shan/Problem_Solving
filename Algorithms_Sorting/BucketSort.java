/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author welcom
 */
public class BucketSort {
    public void sort(int[] arr,int noofbuckets){
        List<List<Integer>> buckets=new ArrayList<>();
        for(int i=0;i<noofbuckets;i++){
            buckets.add(new ArrayList<>());
        }
        for(int item:arr){
            buckets.get(item/noofbuckets).add(item);
        }
        int k=0;
        for(List<Integer> bucket:buckets){
            Collections.sort(bucket);
            for(int item:bucket){
                arr[k++]=item;
            }
        }
    }
}
