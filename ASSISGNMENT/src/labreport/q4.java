package labreport;

import java.util.Scanner;

public class q4 {


    public static void main(String[] args) {
        int length;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        length = input.nextInt();
        int[][] a = new int[2][length];
        for (int i = 0;i<2;i++){
            for (int j = 0;j<length;j++){
                System.out.println("Array "+(i+1));
                System.out.print("Enter the value for element "+(j+1)+" : ");
                a[i][j]= input.nextInt();
            }
        }
        int [][] ans = new int[length][length];
        int [] location = new int[length];
        for(int i = 0;i<length;i++){
            for (int j = 0;j<length;j++){
                ans[i][j] = a[0][i]^a[1][j];
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
