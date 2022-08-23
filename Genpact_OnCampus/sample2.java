/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Genpact_OnCampus;

import java.util.*;

/**
 *
 * @author Shanmuga Priya M
 */
public class sample2 {
public static void main(String[] args)
    {      int i;int dig=0;int cap=0, low=0,xtra=0;
    float caps,small,num,xtrz;
    Scanner obj=new Scanner(System.in);
        String a;
        a=obj.next();
                float ln=a.length();
       for(i=0;i<ln;i++){
          if(Character.isDigit(a.charAt(i))){  
               dig++; 
          }
          else if(Character.isUpperCase(a.charAt(i))){
                   cap++;
               }
          else if(Character.isLowerCase(a.charAt(i))){
                   low++;
               }
               else
               {
                   xtra++;
               }
           }
       System.out.println(ln+" "+cap+" "+low+" "+dig+" "+xtra);
           caps=(cap/ln)*100;        
           small=(low/ln)*100;
           num=(dig/ln)*100;
           xtrz=(xtra/ln)*100;
           System.out.println(caps+" "+small+" "+num+" "+xtrz);
                    
}
}
