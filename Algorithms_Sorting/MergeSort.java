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
public class MergeSort {

    public void sort(int[] arr) {
       // System.out.println("arr : "+Arrays.toString(arr));
        if (arr.length < 2) {
            return;
        }
        int middle = arr.length / 2;

        int[] left = new int[middle];
        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }
        //System.out.println("left : "+Arrays.toString(left));

        int[] right = new int[arr.length - middle];
        for (int i = middle; i < arr.length; i++) {
            right[i-middle] = arr[i];
        }
        //System.out.println("right : "+Arrays.toString(right));
        //System.out.println("calling sort(left)");
        sort(left);
        //System.out.println("calling sort(right)");
        sort(right);
//System.out.println("calling merrge");
        merge(left, right, arr);

    }

    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }

    }
}
