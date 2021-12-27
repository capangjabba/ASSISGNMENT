package labreport;

import java.util.Scanner;

public class q4 {
    public static int[][] xor(int[] a,int[] b,int length){
        int [][] ans = new int[length][length];
        for(int i = 0;i<length;i++){
            for (int j = 0;j<length;j++){
                ans[i][j] = a[i]^b[j];
            }
        }
        return ans;
    }
    public static int maxSum(int[][] ans,int length){
        int sum, max_sum=0;
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
            case 9:
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
                                                for (int q=0;q<length;q++) {
                                                    if (q==i || q==j || q==k || q==l || q==m || q==n || q==o || q==p){
                                                        continue;
                                                    }
                                                    sum = ans[0][i] + ans[1][j] + ans[2][k] + ans[3][l] + ans[4][m] + ans[5][n] + ans[6][o] + ans[7][p] + ans[8][q];
                                                    if (sum > max_sum) {
                                                        max_sum = sum;
                                                    }
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
            case 10:
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
                                                for (int q=0;q<length;q++) {
                                                    if (q==i || q==j || q==k || q==l || q==m || q==n || q==o || q==p){
                                                        continue;
                                                    }
                                                    for (int r=0;r<length;r++) {
                                                        if (r==i || r==j || r==k || r==l || r==m || r==n || r==o || r==p || r==q){
                                                            continue;
                                                        }
                                                        sum = ans[0][i] + ans[1][j] + ans[2][k] + ans[3][l] + ans[4][m] + ans[5][n] + ans[6][o] + ans[7][p] + ans[8][q] + ans[9][r];
                                                        if (sum > max_sum) {
                                                            max_sum = sum;
                                                        }
                                                    }
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
        return max_sum;
    }

    public static void main(String[] args) {
        int length;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        length = input.nextInt();

        int[] a = new int[length];
        int[] b = new int[length];

        for (int i = 0;i<2;i++){
            for (int j = 0;j<length;j++){
                System.out.println("Array "+(i+1));
                System.out.print("Enter the value for element "+(j+1)+" : ");
                if (i == 0){
                    a[j] = input.nextInt();
                }else {
                    b[j] = input.nextInt();
                }
            }
        }
        int [][] ans = xor(a,b,length);

        System.out.println("max sum : "+ maxSum(ans,length));
    }
}
