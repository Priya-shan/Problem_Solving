/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Accenture_Contest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author welcom
 */
public class SustainableFuel {
 
    public static void main(String[] args) throws IOException {
        int N=4;
        int[] A={1,-2,3,-4};
        int Q=1;
        int[][] queries={{2,4,2,3}};
        long[] res=min_sum_queries(N,A,Q,queries);
        System.out.println("-----"+Arrays.toString(res));
    }
    public static long[] min_sum_queries(int N, int[] A, int Q, int[][] queries){
        long[] result = new long[Q];
        int index=0;
        for(int i=0;i<Q;i++){
            int lft=queries[i][0];
            int rt=queries[i][1];
            int min=queries[i][2];
            int max=queries[i][3];
            List<Integer> lst=new ArrayList<Integer>();
            List<Integer> temp=new ArrayList<Integer>();
            lst=trimArray(lft,rt,A);
            int mini=Integer.MAX_VALUE;
            int sum;
            for(int j=0;j<Math.pow(2,lst.size());j++){
                String s=Integer.toBinaryString(j);
                while(s.length()<lst.size()){
                    s="0"+s;
                }
                for(int k=0;k<s.length();k++){
                    if(s.charAt(k)=='1'){
                        temp.add(lst.get(k));
                    }
                }
                if(isValid(temp,min,max)){
                    sum=listSum(temp);
                    if(sum<mini){
                        mini=sum;
                    }
                }
                temp.clear();
            }
            result[index++]=mini;

        }
        return result;
    }
    static boolean isValid(List<Integer> temp,int min,int max){
        if(temp.size()>=min && temp.size()<=max){
            return true;
        }
        return false;
    }
    static int listSum(List<Integer> temp){
        int sum=0;
        for(int i:temp){
            sum+=i;
        }
        return sum;
    }
    static List<Integer> trimArray(int lft,int rt,int[] A){
        List<Integer> lst1=new ArrayList<Integer>();
        for(int i=lft-1;i<rt;i++){
            lst1.add(A[i]);
        }
        return lst1;
    }
}
class soln{
    
}