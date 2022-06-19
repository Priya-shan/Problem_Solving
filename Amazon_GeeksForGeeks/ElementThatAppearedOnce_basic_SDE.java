package Amazon_GeeksForGeeks;

import java.util.*;

/**
 *
 * @author welcom
 */
public class ElementThatAppearedOnce_basic_SDE {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
    }
}
class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        //System.out.println("enters fn");
        Map<Integer,Integer> hmap=new HashMap<>();
        int count=0;
        for(int i:arr){
            count=hmap.containsKey(i)?hmap.get(i):0;
            hmap.put(i,count+1);
        }
        //System.out.println(hmap);
        for(int i:arr){
            if(hmap.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}