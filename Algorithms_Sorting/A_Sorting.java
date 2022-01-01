/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms_Sorting;

import java.util.Arrays;

/**
 *
 * @author welcom
 */
public class A_Sorting {
     public static void main(String args[]){
    int[] arr={1,4,7,7,3,2,1,4,2,7};
         System.out.println("Before Sorting");
         System.out.println(Arrays.toString(arr));
         
        /* System.out.println("After Bubble Sorting");
         BubbleSort s1=new BubbleSort();
         s1.sort(arr);
         System.out.println(Arrays.toString(arr));*/
         
        /* System.out.println("After Selection Sorting");
         SelectionSort s2=new SelectionSort();
         s2.sort(arr);
         System.out.println(Arrays.toString(arr));*/
         
         /*System.out.println("After Insertion Sorting");
         InsertionSort s3=new InsertionSort();
         s3.sort(arr);
         System.out.println(Arrays.toString(arr));*/
         
         /*System.out.println("After Merge Sorting");
         MergeSort s4=new MergeSort();
         s4.sort(arr);
         System.out.println(Arrays.toString(arr));*/
         
         //System.out.println("After Quick Sorting");
         /*QuickSort s4=new QuickSort();
         s4.sort(arr);
         System.out.println(Arrays.toString(arr));*/
         
         //System.out.println("After Counting Sorting");
         /*CountingSort s4=new CountingSort();
         s4.sort(arr,7);
         System.out.println(Arrays.toString(arr));*/
         //System.out.println("After Bucket Sorting");
         BucketSort s4=new BucketSort();
         s4.sort(arr,5);
         System.out.println(Arrays.toString(arr));
    }
}
