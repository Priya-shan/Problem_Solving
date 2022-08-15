/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amazon_Interview_Questions;

import java.util.*;

/**
 *
 * @author Shanmuga Priya M
 */
public class Min_Rounds {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 8,8,8,8,8,8,8,8,8,6,6,6,6,6,2,3,2,3,2,3,6, 6, 4, 2, 4 };
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i : arr) {
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        }
        System.out.println("hmap " + hmap);
        int val;
        int cnt = 0;
        int rem;
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            val = hmap.get(entry.getKey());
            if (val < 2) {
                System.out.println(-1);
                return;
            } 
            else if (val == 3 || val == 2) {
                cnt = cnt + 1;
            } 
            else if (val > 3) {
                rem = val % 3;
                cnt += val / 3;
                if (rem >= 2) {
                    cnt += rem / 2;
                    rem = rem % 2;
                } else {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(cnt);
    }
}
/*
if (i == 1)
                return -1;
            if (i % 3 == 0)
            {
                minTrips += i / 3;
            }
            else if (i % 3 == 2)
            {
                minTrips += (i - 2) / 3 + 1;
            }
            else
            {
                minTrips += (i - 1) / 3 + 1;
            }
*/