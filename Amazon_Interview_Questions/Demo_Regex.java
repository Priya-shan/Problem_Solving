/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Amazon_Interview_Questions;

import java.io.*;
import java.util.*;

/**
 *
 * @author Shanmuga Priya M
 */
public class Demo_Regex {
  final static String regularExpression= "^[ab]$|^[a]+([ab]*)+[a]$|^[b]+([ab]*)+[b]$";
    //final static String regularExpression= "^a(a+b)*a|b(a+b)*b$";
  //python -> r'^[a-b]$|^([a-b]).*\1$
    
    public static void main(String[] args) throws IOException {
        String str="abbb";
        if (str.matches(regularExpression)) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
