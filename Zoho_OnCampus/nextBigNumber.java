/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_OnCampus;
/*
1.print the next big number of the number in array
input array={8,1,4,6,9,5}
output=8->9 ,1->4 ,4->5 ,6->8 ,9-> ,5->6
*/
import java.util.*;

public class nextBigNumber {
    public static void main(String args[]){
        nextBigNumberSolution obj=new nextBigNumberSolution();
        int[] arr={8,1,4,6,9,5};
        System.out.println(obj.find(arr));
    }
}
class nextBigNumberSolution{
    public String find(int[] arr){
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int[] temparr= Arrays.copyOf(arr,arr.length);
       
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
            hmap.put(arr[i],0);
            break;
            }
             hmap.put(arr[i],arr[i+1]);
        }
        String res="";
        int count=0;
        for(int el:temparr){
            String value="";
            if(hmap.get(el)==0){
                value="";
            }
            else{
                value+=hmap.get(el);
            }
            if(count==temparr.length-1)
                res+=el+"->"+value;
            else
                res+=el+"->"+value+" ,";
            count++;
        }
        return res;
    }
}