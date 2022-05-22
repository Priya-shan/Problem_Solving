/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accenture_Contest;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author welcom
 */
public class sustainableZoo {
     public static void main(String[] args) throws IOException {
         int N=11;
         String[] command={
             "assign a 1",
             "{",
             "assign b 2",
             "{",
             "assign a 3",
             "print a",
             "}",
             "print b",
             "print a",
             "print c",
             "}"
         };
         String[] out_ = solve(N, command);
         System.out.print(Arrays.toString(out_));
        /* for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
         {
         	System.out.print("\n" + out_[i_out_]);
         }*/
    }
    static String[] solve(int N, String[] command){
       // Your code goes here
       ArrayList<String> lst=new ArrayList<>();
       ArrayList<String> res=new ArrayList<>();
       
       for(int i=0;i<N;i++){
           //System.out.println("--"+s);
           String[] each=command[i].split(" ");
           System.out.println("start-------"+Arrays.toString(each));
           if(each[0].equals("assign")){
               lst.add(each[1]+""+each[2]);
               System.out.println("lst "+lst);
               System.out.println("res "+res);
           }
           else if(each[0].equals("print")){
               int flag=0;
               for(int j=lst.size()-1;j>=0;j--){
                   if(lst.get(j).substring(0,1).equals(each[1])){
                       flag=1;
                       res.add((lst.get(j)).substring(1));
                       break;
                   }
               }
               if(flag==0){
                   res.add("undefined");
               }
               System.out.println("lst "+lst);
               System.out.println("res "+res);
           }
           else if(each[0].equals("}")){
               lst.remove(lst.size()-1);
               System.out.println("lst "+lst);
               System.out.println("res "+res);
           }
           else{
               continue;
           }
       }
        String[] result = new String[res.size()];
        int index=0;
        for(String s:res){
            result[index++]=s;
        }
        return result;
    
    }
}
