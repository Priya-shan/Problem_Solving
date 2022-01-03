/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_gfg;

/**
 *formula : sqrt( (x2-x1)^2 + (y2-y1)^2 )
 * @author welcom
 */
public class DistanceBet2Pts__school {
    public static void main(String args[]) {
        DistanceBet2PtsSolution obj = new DistanceBet2PtsSolution();
        //System.out.println(Math.pow(5, 2));
        System.out.println(obj.distance(-20,23,-15,68));
        System.out.println(obj.distance(0, 0, 2, -2));
    }
}


class DistanceBet2PtsSolution{
     public int distance(int x1, int y1, int x2, int y2)
    {
          return (int)Math.round(Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)));
    }
}