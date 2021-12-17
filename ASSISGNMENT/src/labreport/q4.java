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
        int[] coordinate = {100,100,100,100,100};
        for(int i = 0;i<length;i++){
            for (int j = 0;j<length;j++){
                ans[i][j] = a[0][i]^a[1][j];
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        // the algorithm for max sum arghhhh

        switch (length){
            case 1:
                max_sum+= ans[0][0];
                break;
            case 2:
                for(int i = 0;i<length;i++) {
                    for (int j = 0; j < length; j++) {
                        if (j == i) {
                            continue;
                        }
                        sum = ans[0][i] + ans[1][j];
                        if (sum > max_sum) {
                            max_sum = sum;
                            System.out.println("coordinate: " + i + j);
                        }
                    }
                }
                break;
            case 3:
                for (int i = 0;i<length;i++) {
                    for (int j = 0; j < length; j++) {
                        if (j == i) {
                            continue;
                        }
                        for (int k = 0; k < length; k++) {
                            if (k == i || k == j) {
                                continue;
                            }
                            sum = ans[0][i] + ans[1][j] + ans[2][k];
                            if (sum > max_sum) {
                                max_sum = sum;
                                System.out.println("coordinate: " + i + j + k);
                            }
                        }
                    }
                }
                break;
            case 4:
                for (int i = 0;i<length;i++) {
                    for (int j = 0; j < length; j++) {
                        if (j == i) {
                            continue;
                        }
                        for (int k = 0; k < length; k++) {
                            if (k == i || k == j) {
                                continue;
                            }
                            for (int l = 0; l < length; l++) {
                                if (l == i || l == j || l == k) {
                                    continue;
                                }
                                sum = ans[0][i] + ans[1][j] + ans[2][k] + ans[3][l];
                                if (sum > max_sum) {
                                    max_sum = sum;
                                    System.out.println("coordinate: " + i + j + k + l);
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
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
                break;
            case 6:
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
                                    for (int n=0;n<length;n++){
                                        if (n==i || n==j || n==k || n==l || n==m){
                                            continue;
                                        }
                                        sum = ans[0][i]+ ans[1][j] + ans[2][k] + ans[3][l] + ans[4][m] + ans[5][n];
                                        if (sum>max_sum) {
                                            max_sum = sum;
                                            System.out.println("coordinate: " + i + j + k + l + m + n);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
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
                                    for (int n=0;n<length;n++){
                                        if (n==i || n==j || n==k || n==l || n==m){
                                            continue;
                                        }
                                        for (int o=0;o<length;o++) {
                                            if (o==i || o==j || o==k || o==l || o==m || o==n){
                                                continue;
                                            }
                                            sum = ans[0][i] + ans[1][j] + ans[2][k] + ans[3][l] + ans[4][m] + ans[5][n] + ans[6][o];
                                            if (sum > max_sum) {
                                                max_sum = sum;
                                                System.out.println("coordinate: " + i + j + k + l + m + n + o);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 8:
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
                                    for (int n=0;n<length;n++){
                                        if (n==i || n==j || n==k || n==l || n==m){
                                            continue;
                                        }
                                        for (int o=0;o<length;o++) {
                                            if (o==i || o==j || o==k || o==l || o==m || o==n){
                                                continue;
                                            }
                                            for (int p=0;p<length;p++) {
                                                if (p==i || p==j || p==k || p==l || p==m || p==n || p==o){
                                                    continue;
                                                }
                                                sum = ans[0][i] + ans[1][j] + ans[2][k] + ans[3][l] + ans[4][m] + ans[5][n] + ans[6][o] + ans[7][p];
                                                if (sum > max_sum) {
                                                    max_sum = sum;
                                                    System.out.println("coordinate: " + i + j + k + l + m + n + o + p);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;

        }


        System.out.println("max sum : "+ max_sum);
    }
}
