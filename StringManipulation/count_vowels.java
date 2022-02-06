/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

/**
 *
 * @author welcom
 */
public class count_vowels {
    public static void main(String args[]){
        count_vowels_Solution obj=new count_vowels_Solution();
        System.out.println(obj.count("practise"));
    }
}
class count_vowels_Solution{
    public int count(String str){
        int cnt=0;
        str=str.toLowerCase();
        for(char ch:str.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                cnt++;
        }
        return cnt;
    }
}