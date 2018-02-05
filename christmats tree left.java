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
       int i,j,k,l;
       
       for(i=5,k=0;i>0;i--,k++)
       {
           for(j=i;j>0;j--)
           {
               System.out.print(" ");
           }
           
           for(l=0;l<=k;l++)
           {
               System.out.print("*");
           }
           
            System.out.println();
       }
       

    }
    
    
    
}
