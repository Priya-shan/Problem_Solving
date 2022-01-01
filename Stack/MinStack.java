/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author welcom
 */
class MinStack {

    /*Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    
    int min;

    public MinStack() {

    }

    public void push(int val) {
        st1.push(val);

        //arr[++count]=val;
        if (st2.isEmpty()) {
            st2.push(val);
            min = val;
        } else {
            min = st2.peek();
            if (val < min) {

                min = val;

            }
            st2.push(min);

        }
        System.out.println(st1);
        System.out.println(st2);
    }

    public void pop() {

        st1.pop();
        st2.pop();
        System.out.println(st1);
        System.out.println(st2);
    }

    public int top() {
        return st1.peek();
    }

    public int getMin() {

        return st2.peek();
    }*/
    int[] arr = new int[1000];
    int[] minarr = new int[1000];
    int[] rarr = new int[1000];
    int[] rminarr = new int[1000];
    int count;
    int mincnt;
    int min;

    public void push(int val) {
        arr[++count] = val;
        if (mincnt == -1) {
            minarr[++mincnt] = val;
            min = val;
        } else {
            min = minarr[mincnt];
            if (val < min) {
                minarr[++mincnt] = val;
            } else {
                minarr[++mincnt] = min;
            }
        }
 rarr=Arrays.copyOfRange(arr, 0, count+1);
 rminarr=Arrays.copyOfRange(minarr, 0, mincnt+1);
 
        System.out.println(Arrays.toString(rarr));
        System.out.println(Arrays.toString(rminarr));
    }

    public void pop() {

        count--;
        mincnt--;
    }

    public int top() {
        return arr[count];
    }

    public int getMin() {

        return minarr[mincnt];
    }

    public static void main(String args[]) {
        MinStack obj = new MinStack();
        System.out.println("push -10");
        obj.push(-10);
        System.out.println("push 14");
        obj.push(14);
        System.out.println("getmin");
        obj.getMin();
        System.out.println("getmin");
        obj.getMin();
        System.out.println("push -20");
        obj.push(-20);
        System.out.println("getmin");
        obj.getMin();
        System.out.println("getmin");
        obj.getMin();
        System.out.println("top");
        obj.top();
        System.out.println("getmin");
        obj.getMin();
        System.out.println("pop");
        obj.pop();

        System.out.println("push 10");
        obj.push(10);
        System.out.println("push -7");
        obj.push(-7);
        System.out.println("getmin");
        obj.getMin();
        System.out.println("push -7");
        obj.push(-7);
        System.out.println("pop");
        obj.pop();
        System.out.println("top");
        obj.top();
        System.out.println("getmin");
        obj.getMin();
        System.out.println("pop");
        obj.pop();
        /*
[[],[-10],[14],[],[],[-20],[],[],[],[],[],[10],[-7],[],[-7],[],[],[],[]]*/
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 *
 * obj.push(val); obj.pop(); int param_3 = obj.top(); int param_4 =
 * obj.getMin();
 */
