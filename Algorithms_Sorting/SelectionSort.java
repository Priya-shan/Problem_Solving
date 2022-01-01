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
public class SelectionSort {

    public void sort(int[] arr) {
        int n = arr.length;
        int min;
        for (int i = 0; i < n; i++) {
            min = findMinIndex(arr, i);
            swap(arr, i, min);
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        //int temp;
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private int findMinIndex(int[] arr, int i) {
        int min = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }
        return min;
    }
}
