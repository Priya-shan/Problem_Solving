/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author welcom
 */
public class CountingSort {
    public void sort(int[] arr,int max){
        int cnt[]=new int[max+1];
        for(int item:arr){
        cnt[item]++;
        }
        int k=0;
        for(int i=0;i<cnt.length;i++){
            for(int j=0;j<cnt[i];j++){
                arr[k++]=i;
            }
        }
    }
}
