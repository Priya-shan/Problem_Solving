/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_OnCampus;

import java.util.*;

/*
3.Reverse a string without changing the positions of spaces
and characters. Reverse only letters and number.
input1= i! love: zoho
output1=o! hoze: voli
input2 =house! is: located@ Ind91.
output2=i9ndI! de: tacolsi@ esuoh.
*/
public class reverseOnlyAlphanumeric{
    public static void main(String args[]){
      reverseOnlyAlphanumericSolution obj=new reverseOnlyAlphanumericSolution();
        //String str="i! love: zoho";
        String str="house! is: located@ Ind91.";
        
        System.out.println(obj.find(str));
    }
}
class reverseOnlyAlphanumericSolution{
    public String find(String str){
        StringBuilder originalWord=new StringBuilder(str);
        ArrayList<Integer> lst=new ArrayList<>();
        
        StringBuilder sb=new StringBuilder(str);
        int cnt=0;
        for(char ch:str.toCharArray()){
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(ch);
                lst.add(cnt);
            }  
            cnt++;
        }
        System.out.println(lst);
        String reversedWord=sb.reverse().toString();
        
        int index=0;
        for(int i=0;i<originalWord.length();i++){
            if(lst.contains(i)){
                originalWord.setCharAt(i, reversedWord.charAt(index++));
            }
        }
        return originalWord.toString();
    }
}