/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.*;
import java.util.Set;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author welcom
 */
public class unionOf2Arrays__basic {
     public static void main(String args[]){
        unionOf2ArraysSolution obj=new unionOf2ArraysSolution();
        int[] a={1,2,3,4,5};
        int[] b={1,2,3};
        System.out.println(obj.doUnion(a,5,b,3));
    }
}
class unionOf2ArraysSolution{
     public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        
        Set<Integer> set=new HashSet<Integer>();
        for(int a1:a)
            set.add(a1);
        for(int b1:b)
            set.add(b1);
        return set.size();
    }
}