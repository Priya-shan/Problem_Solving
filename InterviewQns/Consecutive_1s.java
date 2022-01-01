/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQns;

/**
 *
 * @author welcom
 */
public class Consecutive_1s {
    public static void main(String args[]){
        int num=23;
        int count=0;
        while(num>0){
         num=num & (num<<1);
         count++;
        }
        System.out.println(count);
    }
}
