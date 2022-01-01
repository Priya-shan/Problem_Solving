/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.Arrays;

/**
 *
 * @author welcom
 */
public class PriorityQueueImplementation {
    public static void main(String args[]){
        PriorityQueue pq=new PriorityQueue();
        pq.add(1);
        pq.add(3);
        pq.add(5);
        pq.add(7);
        pq.add(2);
         System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        //pq.add(8);
        System.out.println(pq);
    }
}
class PriorityQueue{
    private int[] arr=new int[5];
    private int[] arr2=new int[5];
int count;
public void add(int val){
    //System.out.println(count);
    //System.out.println(val);
    if(count==arr.length){
    throw new IllegalStateException();
    }
    int i;
    //pinala irundhu loop pani value epa greater ah ilayo apo insert panudhu
    //1 3 5 7
    //add 2
    //1  ->val(2)<-   3     5     7
for(i=count-1;i>=0;i--){
    if(arr[i]>val){
    arr[i+1]=arr[i];
    }
    else
        break;
}
arr[i+1]=val;
count++;
}
public int remove(){
if(count==0){
throw new IllegalStateException();
}
return arr[--count];
}
public String toString(){
    arr2=Arrays.copyOfRange(arr, 0, count);
return Arrays.toString(arr2);
}
}