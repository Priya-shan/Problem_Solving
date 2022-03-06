/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Walmart_Coding;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//mport for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class DistinctAdjacentResumeNumbers {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in).useDelimiter("\n");
        int n=s.nextInt();
        String ip = s.next();
        String[] sarr=ip.split(" ");
        String res="";
        int[] arr=new int[sarr.length];
        int index=0;
        Set<Integer> set1=new HashSet<>();
        for(String ch:sarr){
            arr[index++]=Integer.parseInt(ch);
            set1.add(Integer.parseInt(ch));
        }
        if(set1.size()==1){
            System.out.println(1);
            return;
        }

        //System.out.println(Arrays.toString(arr));   
        int max=Integer.MIN_VALUE;
        int first=0;
        int last=first+1;
        while(first<arr.length && last<arr.length){
            int getval=checkdistinctandgetlen(first,last,arr);
            if(getval!=-1){
                last++;
                if(max<getval){
                max=getval;
              // System.out.println("max : "+max);
                }
            }
            else{
                first++;
            }
        }
        System.out.print(max);


    }
    static int checkdistinctandgetlen(int beg,int end, int[] arr){
        Set<Integer> set=new HashSet<>();
        int cnt=0;
      // System.out.println("range : ");
        for(int i=beg;i<=end;i++){
            cnt++;
            
           // System.out.print(arr[i]+" ");
            set.add(arr[i]);
        }
       // System.out.println("");
        if(cnt!=set.size()){
            return -1;
        }
        else{
            return cnt;
        }
    }
    
}
