/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NCompass_OnCampus;

import java.util.*;

/**
 *
 * @author welcom
 */
public class oddEven {
    public static void main(String[] args) {
        int[] arr={4,5,2,7};
        int[] evenarr=new int[arr.length/2];
        int[] oddarr=new int[arr.length/2];
        int idx1=0,idx2=0;
        for(int i:arr){
            if(i%2==0){
                evenarr[idx1++]=i;
            }
            else{
                oddarr[idx2++]=i;
            }
        }
        int index=0;
        int idx11=0;
        int idx22=0;
        for(int i=0;i<arr.length/2;i++){
            arr[index++]=evenarr[idx11++];
            arr[index++]=oddarr[idx22++];
        }
        System.out.println(Arrays.toString(arr));
    }
}
