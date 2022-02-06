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
public class string_rotation {
    public static void main(String args[]){
        string_rotation_Solution obj=new string_rotation_Solution();
        System.out.println(obj.isrotate("abcd","dabc"));
    }
}
//abcdabcd
class string_rotation_Solution{
    public boolean isrotate(String str,String res){
        if(str.length()!=res.length())
            return false;
        if(!(str+str).contains(res))
            return false;
        return true;
    }
}