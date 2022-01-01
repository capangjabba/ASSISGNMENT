package labreport;

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int calculate=0;
		System.out.print("S :");
		String s = input.next();
		System.out.print("K :");
		int k = input.nextInt();
		for(int i=0; i<s.length(); i++){
			if('?'==s.charAt(i))
				calculate++;
		}
		if(s.length()>8 || calculate>3){
			System.out.println("Maximum digits are only 8 including maximum 3 wildcards ");
		}
		else
			System.out.println( Q3(s,k));
	}



	public static int Q3(String s, int k){
		int c=0;
		String temp1, temp2, temp3;
		boolean f1 = false, f2=false, f3=false;

		for(int i=0; i < s.length(); i++) { // loop
			if(s.charAt(i) == '?') {
				f1 = true;
				for(int j=0; j <= 9; j++) { // swap
					if(i == 0 && j==0);
					else {
						temp1 = s.substring(0, i) + j + s.substring(i+1);
						//System.out.println(i + ": " + temp1);
						for(int l=i+1; l < s.length(); l++) { // loop
							if(temp1.charAt(l) == '?') {
								f2 = true;
								for(int m=0; m <= 9; m++) { // swap
									temp2 = temp1.substring(0, l) + m + temp1.substring(l+1);
									//System.out.println(i + ": " + temp2);
									for(int n=l+1; n < s.length(); n++) { // loop
										if(temp2.charAt(n) == '?') {
											f3 = true;
											for(int o=0; o <= 9; o++){ // swap
												temp3 = temp2.substring(0, n) + o + temp2.substring(n+1);
												//System.out.println(i + ": " + temp3);
												if(Integer.parseInt(temp3) % k == 0) {
													c++;
												}
											}
										}
									}
									if(!f3) {
										if(Integer.parseInt(temp2) % k == 0) {
											c++;
										}
									}
								}
							}
						}
						if(!f2) {
							if(Integer.parseInt(temp1) % k == 0) {
								c++;
							}
						}
					}
				}
			}
		}
		if(!f1) {
			if(Integer.parseInt(s) % k == 0) {
				c++;
			}
		}
		return c;
	}
}
