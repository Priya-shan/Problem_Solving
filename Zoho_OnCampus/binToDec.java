/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_OnCampus;

/*
2.using recursive function
convert binary number to decimal number
input=110110
output=54
input=100
output=4
(without using power function or power concept)
 */
public class binToDec {
    public static void main(String args[]){
      binToDecSolution obj=new binToDecSolution();
        String n="110110";
        System.out.println(obj.find(n));
    }
}
class binToDecSolution{
    public int find(String input){
        StringBuilder sb=new StringBuilder(input);
        return rec(0,sb.length()-1,sb);
    }
    private int rec(int el,int i,StringBuilder sb){
        if(sb.length()==0){
            return 0;
        }
        el=Integer.parseInt(""+sb.charAt(0));
        sb.deleteCharAt(0);
        return el* get2Pow(i--) + rec(el,i,sb);
    }
    private int get2Pow(int e){
        if(e==0){
            return 1;
        }
        return 2*get2Pow(e-1);
    }
}