
package labreport;

import java.util.*;

public class q3 {
  
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter String: ");
    String s = scanner.nextLine();
    System.out.print("Enter Number: ");
    int k = scanner.nextInt();
    int first = 0;
    int last = 0;
  
    
    for(int i = 0; i< s.length(); i++){
        if(i== 8){
        break;
        }
        if(s.charAt(i) == '?'){
            if(i==0){
            first = 1;
            last = 9;
            }
            else{
            first = first*10;
            last = last*10 + 9;
            }
        }
        else{
        first = first*10 + Character.getNumericValue(s.charAt(i));
        last = last*10 + Character.getNumericValue(s.charAt(i));
        }
    }   
    
    int count = 0;
    for(int i= first; i<= last; i++){
        if(i%k == 0){
        count++;
        }
    }
    
    System.out.print(count);

   }
}  

