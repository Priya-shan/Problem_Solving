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
public class reverse_string {
    public static void main(String args[]){
        reverse_string_Solution obj=new reverse_string_Solution();
        System.out.println(obj.rev("practise"));
    }
}
class reverse_string_Solution{
    public String rev(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
}