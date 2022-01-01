/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms_Searching;

import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class A_Searching {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Algorithms_Sorting.MergeSort sort=new Algorithms_Sorting.MergeSort();
    int[] arr={22,0,33,11,9};
    int k=sc.nextInt();
   /* LinearSearch s1=new LinearSearch();
    s1.search(arr,k);*/
    BinarySearch s2=new BinarySearch();
    sort.sort(arr);
        System.out.println(s2.search(arr,k,0,arr.length-1));
    }
}
