/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

import java.util.Arrays;

/**
 *
 * @author welcom
 */
public class capitalize {
    public static void main(String args[]){
        capitalize_Solution obj=new capitalize_Solution();
        System.out.println(obj.rev("practise    makes  you  better   "));
    }
}
class capitalize_Solution{
    public String rev(String str){
        String[] arr=str
                     .trim()
                     .replaceAll(" +", " ")
                     .split(" ");
        String res="";
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1,arr[i].length()).toLowerCase();
            //(s.charAt(0)+"").toUpperCase();
        }
        return String.join(" ", arr);
    }
}