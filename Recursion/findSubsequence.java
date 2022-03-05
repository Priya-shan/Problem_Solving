/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.ArrayList;

/**
 *
 * @author welcom
 */
public class findSubsequence {
    public static void main(String[] args) {
        findSubsequence_solution obj=new findSubsequence_solution();
        ArrayList<String> lst=new ArrayList<>();
        System.out.println(obj.subseq("","112",lst));
                
                
    }
}
class findSubsequence_solution{
    public ArrayList<String> subseq(String p,String up,ArrayList<String> lst){
    if(up.length()==0){
        lst.add(p);
        return lst;
    }
    char ch=up.charAt(0);
    subseq(p+ch,up.substring(1),lst);
    subseq(p,up.substring(1),lst);
    return lst;
    }
}