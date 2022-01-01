/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/*import java.util.Arrays;

/**
 *
 * @author welcom
 */
/*public class TwoStack {
    public static void main(String args[]){
    TStack st=new TStack();
    st.push1(10);
    st.push1(20);
    st.push1(30);
    st.push2(10);
    st.push2(20);
    st.push2(30);
    st.push2(40);
    st.push2(50);
        System.out.println(st);
        
        System.out.println(st.pop1());
        System.out.println(st.pop1());
        //System.out.println(st.pop1());
         
        System.out.println(st.isEmpty1());
                System.out.println(st.pop2());

    }
    
    
    
}
class TStack{
private int[] arr=new int[8];
int ptr1=0;
int ptr2=arr.length;

public void push1(int item){
    if(isFull1())
        throw new StackOverflowError("Stack1 is full");
arr[ptr1++]=item;
}

public int pop1(){
return arr[--ptr1];
}

public void push2(int item){
    if(isFull2())
        throw new StackOverflowError("Stack2 is full");
arr[--ptr2]=item;
}

public int pop2(){
return arr[ptr2];
}

public boolean isFull1(){
    return ptr1+1==ptr2;
}

public boolean isFull2(){
return ptr2==ptr1;
}

public boolean isEmpty1(){
    return ptr1==0;
}

public boolean isEmpty2(){
return ptr2==arr.length;
}

public String toString(){
    return Arrays.toString(arr);
}

}*/


// { Driver Code Starts


import java.util.*;


public class TwoStack
{
	
	int size;
	int top1,top2;
	//int arr[] = new int[size];
	int arr[] = new int[100]; 
	
	TwoStack()
	{
		int n =100;
		size = n;
		//arr[] = new int[n];
		top1 = -1;
		top2 = size;
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt();
		while(T>0)
		{
			TwoStack sq = new TwoStack();
			
			int Q = sc.nextInt();
			while(Q>0)
			{
				int stack_no = sc.nextInt();
				int QueryType = sc.nextInt();
				
				Stacks g = new Stacks();
				
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					if(stack_no == 1)
					 g.push1(a,sq);
					else if(stack_no ==2)
					 g.push2(a,sq);
				}else if(QueryType == 2)
				{
					if(stack_no==1)
					System.out.print(g.pop1(sq)+" ");
					else if(stack_no==2)
					System.out.print(g.pop2(sq)+" ");
				}
			
				Q--;
			}
				System.out.println();
		  T--;
		}
	}
}

// } Driver Code Ends



/* Structure of the class is
class TwoStack
{

	int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}*/
class Stacks extends TwoStack
{
    //Function to push an integer into the stack1.
    void push1(int x, TwoStack sq)
    {
        System.out.println("push1"+x);
        if(isFull1())
            throw new StackOverflowError("Stack1 is full");
        arr[++top1]=x;
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq)
    {
        System.out.println("push2"+x);
        if(isFull2())
            throw new StackOverflowError("Stack2 is full");
        arr[--top2]=x;
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq)
    {
        System.out.println("pop1");
        if(isEmpty1())
            return -1;
        else
            return arr[top1];
    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq)
    {
        System.out.println("pop2");
        if(isEmpty2())
            return -1;
        else
            return arr[top2];
    }
    
    //mycode
    public boolean isFull1(){
        return top1+1==top2;
    }

    public boolean isFull2(){
        return top2-1==top1;
    }

    public boolean isEmpty1(){
        return top1==-1;
    }

    public boolean isEmpty2(){
        return top2==size;
    }
}
 

