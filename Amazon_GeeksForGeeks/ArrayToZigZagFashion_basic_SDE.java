/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amazon_GeeksForGeeks;

import java.io.*;

/**
 *
 * @author welcom
 */
public class ArrayToZigZagFashion_basic_SDE {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution_ArrayToZigZagFashion_basic_SDE().zigZag(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
class Solution_ArrayToZigZagFashion_basic_SDE {
    void zigZag(int arr[], int n) {
        // code here
        int flag=0;
        for(int i=0;i<n-1;i++){
            if(flag==0){
                flag=1;
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
                continue;
            }
            if(flag==1){
                flag=0;
                if(arr[i]<arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
        //System.out.println(Arrays.toString(arr));
    }
    void swap(int arr[],int pos1,int pos2){
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
    }

}