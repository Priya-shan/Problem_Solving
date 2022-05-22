//not yet completed
package Zoho_OnCampus;

import java.util.*;

/*
5.Write a program to form lines using the given set of words. 
The line formation should follow the below rules.
I. Total characters in a single line excluding the space 
between the words and the favorite character should not 
exceed the maximum number
II. Favorite character is case insensitive, i.e,if the favorite is 
specified as’d’ then both ‘d’ and ‘D’ should be left out 
while counting.
III. Words should not be broken up. Complete words alone 
should be used in a line. A word should be in one line only
Input:
Max char per line:10
Favorite character:o
Words: zoho,Eating,Watching,pogo,Loving,Mango
Output:
Watching zoho(10)
Eating Mango(10)
Loving pogo(7)
Input:
Max char per line:15
Favorite character:w
Words: Twinkle,Twinkle,little,star,how,I,wonder,what,you,are
Output:
Twinkle Twinkle what(15)
little wonder star(15)
you are how I(9)
*/
public class formLines {
    public static void main(String[] args) {
       List<String> words=new ArrayList<>();
        words.add("zoho");
        words.add("eating");
        words.add("watching");
        words.add("pogo");
        words.add("loving");
        words.add("mango");
       // System.out.println(words); 
        int i=0;
        char fav='o';
        
        while(words.size()>0){
            
            int max=0;
        for(int j=i+1;j<words.size();j++){
            if(count(words.get(i),fav)+count(words.get(j),fav)==10){
                System.out.println(words.get(i)+" "+words.get(j));
                words.remove(j);
                words.remove(i);
                break;
            }
            if(count(words.get(i),fav)+count(words.get(j),fav)<10){
                if(max<count(words.get(i),fav)+count(words.get(j),fav)){
                    max=count(words.get(i),fav)+count(words.get(j),fav);
                }
                if(max==10){
                    System.out.println(words.get(i)+" "+words.get(j));
                    words.remove(j);
                    words.remove(i);
                    break;
                }
            }
            System.out.println(words.get(i)+" "+words.get(j));
            words.remove(j);
            words.remove(i);
        }
        
        }
    }
    public static int count(String s,char fav){
        int cnt=0;
        for(char ch:s.toCharArray()){
            if(ch==fav){
                continue;
            }
            cnt++;
        }
        return cnt;
    }
            
}
