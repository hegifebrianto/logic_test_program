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
       
       
        for(i=0;i<=5;i++)
        {
            
            for(j=i;j<5;j++)
            {
                System.out.print(" ");
            }
            
            for(k=0;k<(2*i)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
    
    
}
