/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Amazon_Interview_Questions;

import java.util.*;

/**
 *
 * @author Shanmuga Priya M
 */
public class Dummy_Website {
    public static void main(String[] args) {
        String[] desc={"register david david123","register adam 1Adam1","login david david123","login adam 1adam1","logout david"};
        int n=desc.length;
        HashMap<String,String> users_reg=new HashMap<>();
        HashMap<String,String> users_login=new HashMap<>();
        ArrayList<String> res=new ArrayList<>();
        String operation,user,pw;
        
        for(String s:desc){
//            System.out.println(users_reg);
//            System.out.println(users_login);
            String[] temp=s.split(" ");
            operation=temp[0];
           
            if(operation.equals("register")){
                user=temp[1];
                pw=temp[2];
                if(!users_reg.containsKey(user)){
                    users_reg.put(user, pw);
                    res.add("registered successfully");
                }
                else{
                    res.add("registeration Unsuccessfull");
                }
            }
            else if(temp[0].equals("login")){
                user=temp[1];
                pw=temp[2];
                if(users_reg.containsKey(user) && users_reg.get(user).equals(pw)){
                    users_login.put(user, pw);
                    res.add("Loggedin successfully");
                }
                else{
                    res.add("Login Unsuccessfull");
                }
            }
            else{
                user=temp[1];
                if(users_login.containsKey(user)){
                    res.add("Loggedout Successfully");
                    users_login.remove(user);
                }
                else{
                    res.add("Logout UnSuccessfull");
                }
            }
        }
        System.out.println(res);
        
    }
}
