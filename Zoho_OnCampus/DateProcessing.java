/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_OnCampus;

import java.util.*;

/**
 *
 * @author welcom
 */
public class DateProcessing {
    public static void main(String[] args) {
        solution obj=new solution();
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        double ms=sc.nextInt();
        System.out.println(8+1);
        System.out.println(obj.processedDate(input,ms));
    }
}
class solution{
    public String processedDate(String input,double ms){
        String regexpattern="^0+(?!$)";
        int ipdate=Integer.valueOf(input.substring(0, 2).replace(regexpattern, ""));
        String opdate="";
        String ophour="";
        double min=ms/6000;
        double hour=min/60;
        double second=00;
        if(hour%1!=0){
            String[] darr =Double.toString(hour).split(".");
            hour=Double.parseDouble(darr[0]);
            second=Double.parseDouble(darr[1]);
            
        }
        if(hour>24){
            while(hour>24){
            ipdate=ipdate+1;
            if(ipdate<10){
                opdate="0"+ipdate;
            }
            hour-=24;
            }
        }
        if(hour>0 && hour%1==0){
            //ophour=hour;
        }
        else{
            
        }
        return "";
    }
}
