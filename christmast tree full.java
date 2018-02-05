/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author hegifebrianto
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Output:
        *
       **
      ***
     ****
    *****
    
    */
    public static void main(String[] args) {
       int i,j,k,l,s;
       
        for(i=0; i<5; i++) 
        {
            for (j=0; j<(5-i); j++) 
            {
                System.out.print(" ");
            }
            for( s=2; s<2*i+1; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
       

    }
    
    
    
}
