/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amazon_Interview_Questions;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Shanmuga Priya M
 */
public class Inneficiency {

    public static void main(String[] args) {
        int[] numbers = {3, 1, 3, 5};
        int k = 3;
        ArrayList< Integer> lst = new ArrayList<>();
        int data[] = new int[k];
        combinationUtil(lst, numbers, numbers.length, k, 0, data, 0);
        Collections.sort(lst);
        for (int i = 0; i < k; i++) {
            System.out.print(lst.get(i) + " ");
        }
    }

    static void combinationUtil(ArrayList<Integer> lst, int arr[], int n, int r, int index,
            int data[], int i) {

        if (index == r) {
            lst.add(Math.abs(data[0] - data[1]));
            return;
        }
        if (i >= n) {
            return;
        }

        data[index] = arr[i];
        combinationUtil(lst, arr, n, r, index + 1, data, i + 1);

        combinationUtil(lst, arr, n, r, index, data, i + 1);
    }
}
