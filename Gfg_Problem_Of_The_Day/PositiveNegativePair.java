/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gfg_Problem_Of_The_Day;

import java.util.*;

/**
 * Jan-9-2022
 * Hint : Try using the fact that all the elements in the array are distinct. 
 *        Make a hash table of the absolute value of the elements in the array. 
 * @author welcom
 */
public class PositiveNegativePair {
     public static void main(String args[]){
        PositiveNegativePairSolution obj=new PositiveNegativePairSolution();
        int[] arr={1,3,6,-2,-1,-3,2,7};
        System.out.println(obj.findPairs(arr,arr.length));
    }
}
class PositiveNegativePairSolution
{
    //Function to return list containing all the pairs having both
    //negative and positive values of a number in the array.
    public static ArrayList<Integer>findPairs(int arr[], int n) 
    { 
    	// code here.
    	ArrayList<Integer> lst=new ArrayList<>();
    	
    	Set<Integer> set=new HashSet<>();
    	for(int el:arr){
    	    if(!set.contains(Math.abs(el))){
    	        set.add(Math.abs(el));
    	    }
    	    else{
    	            lst.add(-1*Math.abs(el));
    	            lst.add(Math.abs(el));
    	    }
    	}
    	
    	return lst;
    }
}