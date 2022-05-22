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
public class TimeConversion {
    public static void main(String[] args) {
        String str="08:15:45PM";
        String hr=str.substring(0,2);
        int h=Integer.parseInt(hr)+12;
        String h1=Integer.toString(h);
        hr=h1+str.substring(2,8);
        System.out.println(hr);
    }
}
