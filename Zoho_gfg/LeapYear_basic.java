/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_gfg;

/**
 *
 * @author welcom
 */
public class LeapYear_basic {
     public static void main(String args[]){
        LeapYearSolution obj=new LeapYearSolution();
        System.out.println(obj.isLeap(2021));
    }
}
class LeapYearSolution{
    static int isLeap(int N){
        if(N%4==0 && N%100!=0 || N%400==0)
            return 1;
        else 
            return 0;
    }
}