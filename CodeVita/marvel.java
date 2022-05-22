/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeVita;

import java.util.*;

/**
 *
 * @author welcom
 */
public class marvel {
    public static void main(String[] args) {
        marvel_solution obj=new marvel_solution();
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        int n=sc.nextInt();
        String s=sc.next();
        String[] sarr=s.split(" ");
        int[] arr=new int[sarr.length];
        int index=0;
        for(String s1:sarr){
            arr[index++]=Integer.parseInt(s1);
        }
        //System.out.println(Arrays.toString(arr));
        System.out.println(obj.solve(arr,0,n-1));
    }
            
}
class marvel_solution{
    public int solve(int[] arr,int first,int last){
        List<Integer> ironman=new ArrayList<>(); //1
        List<Integer> cap=new ArrayList<>(); //0
        int flag=1;
        while(first<=last){
            if(flag==1){
            //System.out.println("ironmans turn");
            if(arr[first]<arr[last]){
              //  System.out.println("ironman pics a member");
                ironman.add(arr[last]);
                if(arr[last]<0){
                    flag=0;
                    last--;
                    continue;
                }
                //System.out.println("ironmans team : "+ironman);
                last--;
                while(arr[last]>0){
                  //  System.out.println("ironman pics more members : "+ironman);
                    ironman.add(arr[last]);
                    if(arr[last]<0){
                    flag=0;
                    last--;
                    continue;
                }
                    last--;
                    
                }
            }
            else{
                //System.out.println("ironman pics a member");
                ironman.add(arr[first]);
                if(arr[first]<0){
                    flag=0;
                    first++;
                    continue;
                }
                //System.out.println("ironmans team : "+ironman);
                first++;
                while(arr[first]>0){
                  //  System.out.println("ironman pics more members : "+ironman);
                    ironman.add(arr[first]);
                    if(arr[first]<0){
                    flag=0;
                    first++;
                    continue;
                }
                    first++;
                    
                }
            }
            flag=0;
            }
            else{
                //System.out.println("caps turn");
                if(arr[first]<arr[last]){
                //System.out.println("cap pics a member");
                cap.add(arr[last]);
                if(arr[last]<0){
                    flag=1;
                    last--;
                    continue;
                }
                //System.out.println("caps team : "+cap);
                last--;
                while(arr[last]>0){
                  //  System.out.println("cap pics more members : "+cap);
                    cap.add(arr[last]);
                    if(arr[last]<0){
                    flag=1;
                    last--;
                    continue;
                }
                    last--;
                    
                }
            }
            else{
                    //System.out.println("cap pics a member");
                cap.add(arr[first]);
                if(arr[first]<0){
                    flag=1;
                    first++;
                    continue;
                }
                //System.out.println("caps team : "+cap);
                first++;
                while(arr[first]>0){
                  //  System.out.println("cap pics more members : "+cap);
                    cap.add(arr[first]);
                    if(arr[first]<0){
                    flag=1;
                    first++;
                    continue;
                }
                    first++;
                    
                }
            }
            flag=1;
            }
        }
        //System.out.println(ironman);
        //System.out.println(cap);
        
        int ironmansum=0;
        int capsum=0;
        for(int i:ironman){
            ironmansum+=i;
        }
        for(int i:cap){
            capsum+=i;
        }
        
        return Math.abs(ironmansum-capsum);
    }
}
