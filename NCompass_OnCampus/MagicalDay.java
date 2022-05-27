/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NCompass_OnCampus;

/**
 *
 * @author welcom
 */
public class MagicalDay {
    public static void main(String[] args) {
        String s="20 24";
        int k=6;
        int start=Integer.parseInt(s.substring(0,2));
        int end=Integer.parseInt(s.substring(3));
        int count=0;
        for(int i=start;i<=end;i++){
            if(Math.abs(i-reverse(i))%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static int reverse(int i){
        StringBuilder sb=new StringBuilder(Integer.toString(i));
        return Integer.parseInt(sb.reverse().toString());
    }
}
