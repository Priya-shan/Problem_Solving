/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SquareShift_OnCampus;

/**
 *
 * @author welcom
 */
public class StarPattern {
    public static void main(String[] args) {
        int n=5;
        int s=5;
        for(int i=0;i<(n*2-1);i++){
            for(int j=0;j<(n*2-1);j++){
                if(j==(s-1) || j>(s-1)){
                    System.out.print("*");
                    s--;
                    //break;
                }
                else{
                System.out.print("-");
                }
            }
            System.out.println("");
            
        }
    }
}
