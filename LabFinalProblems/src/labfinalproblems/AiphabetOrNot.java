
package labfinalproblems;

import java.util.Scanner;


 
public class AiphabetOrNot {
    public static void main(String[] args) {
      
        Scanner scanf=new Scanner(System.in);
       char ch;
        ch = scanf.next().charAt(0);
        if(ch>='a'&& ch<='z'||ch>='A'&& ch<='Z'){
            System.out.println("Alphabet");
        }
        else if(ch>='0' && ch<='9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
                
        
    }
       
                
    }
    
    

