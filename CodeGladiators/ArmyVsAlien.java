/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeGladiators;
import java.io.*;
import java.util.*;
/**
 *Launch time : 19 50
 * TravelTime : 02 20
 * 
 * output : 22 10
 * @author welcom
 */
public class ArmyVsAlien {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      String lt=sc.nextLine();
      String tt=sc.nextLine();

      int hr1=Integer.parseInt(lt.substring(0,2));
      int hr2=Integer.parseInt(tt.substring(0,2));

      int min1=Integer.parseInt(lt.substring(3));
      int min2=Integer.parseInt(tt.substring(3));

      int hr=hr1+hr2;
      int min=min1+min2;

      if(min>59){
         min=min%60;
         hr=hr+1;
      }
      hr=hr%24;
      String shr=Integer.toString(hr);
      String smin=Integer.toString(min);

      if(shr.length()<2){
         shr="0"+shr;
      }
      if(smin.length()<2){
         smin="0"+smin;
      }
      System.out.println(shr+" "+smin);
	//Write code here

   }
}
