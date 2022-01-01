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
public class BubbleSort {

    public void sort(int[] arr) {
        int n = arr.length;
        //sort ana udane i loop break pantu left aaradhuku
        boolean isSorted;
        for (int i = 0; i < n; i++) {
            isSorted = true;
            //n-i ->last la bubbleup aairuka largest ele ah deal la vidradhuku
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                return;
            }
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        //int temp;
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
