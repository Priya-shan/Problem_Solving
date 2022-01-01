/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Arrays;

/**
 *
 * @author welcom
 */
public class Stackk {
    private int[] arr=new int[5];
    private int[] arr1= new int[5];
    private int count=0;
    
    public void push(int item){
        if(count==arr.length){
            throw new StackOverflowError("Stack is full");
        }
        else{
    arr[count++]=item;
        }
    }
    
    public int pop(){
    if(count==0)
        throw new IllegalStateException("Stack is empty");
    return arr[--count];
    }
    
    public int peek(){
    return arr[count-1];
    }
    
    public boolean isEmpty(){
        return count==0;
    }
    
    @Override
    public String toString(){
        
    arr1= Arrays.copyOfRange(arr, 0, count);
    return Arrays.toString(arr1);
    }
}
