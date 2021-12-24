/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labreport;

import java.util.Scanner;

/**
 *
 * @author Ilham
 */
public class q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter a number");
       int input = sc.nextInt();
       
       System.out.print(input + " = ");
       
       String m = powers2(input);
       
       System.out.print(m);
    }
    
    static String powers2(int x)
    {
        
        int[]p= new int[20];
        int i=0,j=0;
        String g = ("");
        
        while(x>0)
        {
            p[i++]=x%2;
            x=x/2;
            j++;
        }
        
        for(i=0;i<j;i++)
        {
            if(p[i]==0)
            {
                continue;
            }
            
            else
            {
                if(i==j-1)
                {
                    int z = (int) Math.pow(2,i);
                    System.out.print(z);
                }
                else
                {
                    int z = (int) Math.pow(2,i);
                    System.out.print(z + " + ");
                }
                
            }
        }
        
        System.out.println();
        return g;
    }
}
