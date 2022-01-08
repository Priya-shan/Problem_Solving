/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gfg_Problem_Of_The_Day;

import java.util.ArrayList;

/**
 *
 * @author welcom
 */
public class NdigitWithDigitInIncOrder {
    public static void main(String args[]){
        NdigitWithDigitInIncOrderSolution obj=new NdigitWithDigitInIncOrderSolution();
        System.out.println(obj.increasingNumbers(1));
    }
}
class NdigitWithDigitInIncOrderSolution{
    static ArrayList<Integer> increasingNumbers(int N){
        // code here
        ArrayList<Integer> lst=new ArrayList<>();
        String num="";
        int dig=2;
        int k=2;
        for(int i=1;i<=9;i++){
            num=Integer.toString(i);
            int val=i+1;
            for(int j=i+1;j<=9;j++){
                if(j>10){
                    return lst;
                }
                num+=Integer.toString(j);
                lst.add(Integer.parseInt(num));
                if(j==9 && k--<dig){
                    j=val+1;
                }
            }
            
            
        }
        return lst;
    }
}