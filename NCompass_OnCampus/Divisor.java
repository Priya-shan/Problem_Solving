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
public class Divisor {
    public static void main(String[] args) {
         int ip=1012;
        String ipstr=Integer.toString(ip);
        int cnt=0;
        for(int i=0;i<ipstr.length();i++){
            int temp=Integer.parseInt(""+ipstr.charAt(i));
            if(temp==0){
                continue;
            }
            if(ip%temp==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
