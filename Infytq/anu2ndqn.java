/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infytq;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author welcom
 */
public class anu2ndqn {
    public static void main(String args[]){
       solun obj=new solun();
       Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int X=scan.nextInt();
        List<Integer> A=new ArrayList<Integer>(N);
        for(int i=0;i<N;i++){
            A.add(scan.nextInt());
        }
        String S=scan.next();
        
        System.out.print(obj.solve(N,X,A));
       
   } 
}
class solun{
    static int solve(int N,int X,List<Integer> A){
        for (int i:A){
            int val=i;
            for(int j=0;j<X;j++){
                //lst.add(i,X-i);
            }
          
        }
    return 0;
    }  
}