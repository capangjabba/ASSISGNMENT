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
public class q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many numbers?");
        int numbers = sc.nextInt();
        System.out.println("Enter the numbers: ");
        
        int[] arr = new int[numbers];
        
        for(int i=0;i<arr.length;i++)
        {    
            arr[i] = sc.nextInt(); //prompt the user to enter input
        }
        
        for(int pass=0;pass<arr.length-1;pass++) 
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1]; //sort the element in ascending order
                    arr[j+1] = temp;
                }
            }
        }
        
       double z = median(arr); //call a method that calculates median
       System.out.printf("%.1f\n",z);
    }
    
    static double median(int[]x) //accepts integer as parameter and return double
    {
        
        double m;
        
        if(x.length%2!=0)      //if it is odd
        {
           m = 1.0*x[(x.length+1)/2-1];
        }
        
        else            //if it is even
        {
           m = 1.0*(x[x.length/2-1]+x[x.length/2])/2;
        }
        
        return m;
    }
}
