package labreport;

import java.util.Scanner;

public class q4 {


    public static void main(String[] args) {
        int length, sum, max_sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
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
        for (int i = 0;i<length;i++){
            for (int j = 0;j<length;j++){
                if (j==i){
                    continue;
                }
                for (int k = 0;k<length;k++){
                    if (k==i || k==j){
                        continue;
                    }
                    for (int l = 0;l<length;l++){
                        if (l==i || l==j || l==k){
                            continue;
                        }
                        for (int m = 0;m<length;m++){
                            if (m==i || m==j || m==k || m==l){
                                continue;
                            }
                            sum = ans[0][i]+ ans[1][j] + ans[2][k] + ans[3][l] + ans[4][m];
                            if (sum>max_sum){
                                max_sum=sum;
                                System.out.println("coordinate: "+i+j+k+l+m);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("max sum : "+ max_sum);
    }
}
