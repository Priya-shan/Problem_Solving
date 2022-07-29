/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.*;
import java.util.regex.*;

/**
 *
 * @author welcom
 */
public class gfg {

    public static void main(String[] args) {
//        String s="2.2.2.2";
//        s.replace("ap","");
//        String S="1";
        String l="00900";
        l=l.replaceAll("^0+(?!$)", "");
        System.out.println(l);
//        System.out.println(isValid(s));
}
    public static  boolean isValid(String s) {
        // Write your code here
        Pattern REGEX=Pattern.compile("^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]+\\.){3}+[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]$");

        Matcher matcher = REGEX.matcher(s);
        return matcher.find();
    }
}
