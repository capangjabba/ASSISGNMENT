
package labreport;

import static java.lang.Math.pow;
import java.util.Scanner;

public class q3 {
    public static int Q3(String s, int k){
	int cnt=0, count=0;
	double Power;
	int num = s.length();
	for(int i=0;i<num;i++){
	    char number = s.charAt(i);
	    if(!Character.isDigit(number))
		cnt++;
	}
	cnt = (int)pow(10,cnt);
	int[]WildCard = new int[1000];
	for(int q = 0; q<num; q++){
	    for(int i = 0; i<10;i++){
		for(int j=0;j<10;j++){
		    for(int l=0; l<10; l++){
			char number = s.charAt(q);
			if (Character.isDigit(number)) {
			    int temp = Character.getNumericValue(number);
			    Power = temp * pow(10,num - 1- q);
			    WildCard[(i*100)+(j*10)+l] = WildCard[(i*100)+(j*10)+l] + (int) Power;
			}
			else{
			    if(i==0 && j==0 && l==0)
				continue;
			    WildCard[(i*100)+(j*10)+l] = (int) (WildCard[(i*100)+(j*10)+l-1] + 1*pow(10,num-1-q));
			}
		    }
	    }
	}
	for(int i = 0;i<cnt;i++){
	    if(WildCard[i]%k==0){
		if('?'==s.charAt(0) && WildCard[i]>=(int)(1*pow(10,num-1))){
		    count++;
		}
		else if(WildCard[i]>=(int)(1*pow(10,num-1))){
		    count++;
		}
	    }
	}
	return count;
    }
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
	    System.out.println("Maximum digits are only 8 including 3 wildcards ");
	}
	else
            System.out.println( Q3(s,k));
    }