/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms_Sorting;

/**
 *
 * @author welcom
 */
public class QuickSort {

    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int boundary = partition(arr, start, end);
        sort(arr, start, boundary - 1);
        sort(arr, boundary + 1, end);
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int boundary = start - 1;
        for (int i = start; i <= end; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, ++boundary);
            }
        }
        return boundary;
    }

    private void swap(int[] arr, int index1, int index2) {
        //int temp;
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
