/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author user2
 */
public class example {

    /**
     * @param args the command line arguments
     */
    //Integer and String variables are set to null so Programme will print "d.pnt is null 0 0"
    //If integer and string values are assigned the programme will print the respective vales
    //if int x=10,int y=5, String name="Value";the programme will print"pnt is value 10 5
    
    int x; int y;
   String name;
   public static void main(String args[]) {
   example pnt = new example();
   System.out.println ("pnt is " + pnt.name + " " + pnt.x + " " + pnt.y);
   
}
}
    
//Result= "d.pnt is null 0 0

