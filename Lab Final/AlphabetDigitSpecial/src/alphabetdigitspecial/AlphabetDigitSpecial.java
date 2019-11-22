package alphabetdigitspecial;

import java.util.Scanner;

public class AlphabetDigitSpecial {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        char ch=scanf.next().charAt(0);
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println("Alphabet");
        }
        else if(ch>='0'&&ch<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
    
}
