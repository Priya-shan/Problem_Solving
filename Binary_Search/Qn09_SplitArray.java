/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Binary_Search;

/**
 *
 * @author Shanmuga Priya M
 */
//https://leetcode.com/problems/split-array-largest-sum/
public class Qn09_SplitArray {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=Math.max(arr[i], start);
            end+=arr[i];
        }
        System.out.println(start+" "+end);
        int m=2;
        System.out.println(DoBinarySearch(arr,m,start,end));
        
        
    }

    private static int DoBinarySearch(int[] arr, int m,int start, int end) {
        while(start<end){
            int mid=(start+end)/2;
            
            int sum=0;
            int pieces=1;
            for(int n:arr){
                if(sum+n>mid){
                    sum=n;
                    pieces++;
                }
                else{
                    sum+=n;
                }
            }
            //value kuttiya irukanala adhigama piriudhu
            if(pieces>m){
                start=mid+1;
            }
            //value perusa irukanala crtaa piriudhu aana ans varala
            else{
                end=mid;
            }
        }
        return start;
    }
    
}
