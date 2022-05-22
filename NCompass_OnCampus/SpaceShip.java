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
public class SpaceShip {
    public static void main(String[] args) {
        String ip="SOSSOSSOS";
        int cnt=0;
        for(int i=0;i<ip.length()-2;i++){
            if(ip.charAt(i)=='S' && ip.charAt(i+1)=='O' && ip.charAt(i+2)=='S'){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
