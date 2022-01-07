/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gfg_Problem_Of_The_Day;

/**
 * Jan-7-2022
 * @author welcom
 */
public class Complement1s {
    public static void main(String args[]){
        Complement1sSolution obj=new Complement1sSolution();
        System.out.println(obj.onesComplement("101",3));
    }
}
class Complement1sSolution{
    static String onesComplement(String S,int N){
        //code here
        StringBuilder sb=new StringBuilder(S);
        for(int i=0;i<N;i++){
            if(sb.charAt(i)=='1')
                sb.setCharAt(i,'0');
            else
                sb.setCharAt(i,'1');
        }
        return sb.toString();
    }
}