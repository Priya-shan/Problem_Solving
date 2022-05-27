/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NCompass_OnCampus;

import java.util.Arrays;

/**
 *
 * @author welcom
 */
public class profitLoss {
    public static void main(String[] args) {
        String s="7 5 1 4 3 6";
        String[] sarr=s.split(" ");
        int min=Integer.parseInt(sarr[0]);
        int pos =0;
        for(int i=0;i<sarr.length;i++){
            int ele=Integer.parseInt(sarr[i]);
            if(ele<min){
                min=ele;
                pos=i;
            }
        }
        int max=Integer.parseInt(sarr[pos]);
        for(int i=pos;i<sarr.length;i++){
            int ele=Integer.parseInt(sarr[i]);
            if(ele>max){
                max=ele;
            }
        }
        System.out.println(max-min);
    }
}
