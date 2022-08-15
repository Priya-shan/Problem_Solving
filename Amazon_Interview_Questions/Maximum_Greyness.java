/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Amazon_Interview_Questions;

/**
 *
 * @author Shanmuga Priya M
 */
public class Maximum_Greyness {
    public static void main(String[] args) {
        String[] arr={"101","001","110"};
        int n=arr.length;
        int m=arr[0].length();
        int max_grey=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int black=0;
                int white=0;
                //row cnt
                for(int k=0;k<m;k++){
                    if(arr[i].charAt(k)=='0'){
                        white++;
                    }
                    else{
                        black++;
                    }
                }
                //col count
                for(int k=0;k<n;k++){
                    if(arr[k].charAt(j)=='0'){
                        white++;
                    }
                    else{
                        black++;
                    }
                }
                int curr_grey=black-white;
                if(max_grey<curr_grey){
                    max_grey=curr_grey;
                }
            }
        }
        System.out.println(max_grey);
    }
}
