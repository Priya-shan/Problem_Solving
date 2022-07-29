/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HCL;

/**
 *
 * @author welcom
 */
import java.util.*;

public class pythogorus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        double sum;
        int t = sc.nextInt();
        while (t > 0) {
            String str = sc.next();
            String[] sarr = str.split(" ");
            int a=Integer.parseInt(sarr[0]);
            int b=Integer.parseInt(sarr[1]);
            sum = Math.pow(a, 2) + Math.pow(b, 2);
            double result = Math.pow(sum, 0.5);
            System.out.println(result);
            t--;
        }
    }
}
