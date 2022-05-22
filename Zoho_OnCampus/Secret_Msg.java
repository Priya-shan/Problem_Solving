/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_OnCampus;

import java.util.HashMap;
import java.util.*;

/*
A Top secret message containing letters from A to z is being encoded to numbers 
using the following mapping a equal to 1 b equal to 2 is a equal to 26 you have 
to determine the total number of ways that message can be decoded 

example
Given an encoded message 123 
it could be decoded as 
a b c (1 2 3) 
L c(12 3) 
a w (1 23) 
total ways are 3

Output 3
 */
public class Secret_Msg {
    public static void main(String[] args) {
        Map<Integer,Character> hmap=new HashMap<>();
        int ascii=97;
        for(int i=1;i<27;i++){
            hmap.put(i, (char)ascii++);
        }
        System.out.println(hmap);
    }
}
