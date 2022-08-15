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
public class Armaze {
    public static void main(String[] args) {
        String sw="ab";
        String rw="abd";
        int j=0;
        for(int i=0;i<sw.length();i++){
            if(sw.charAt(i)==rw.charAt(j)){
                j++;
            }
        }
        System.out.println(rw.length()-j);
    }
}
