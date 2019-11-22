
package alphabetornot;

import java.util.Scanner;

public class Alphabetornot {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        char ch=scanf.next().charAt(0);
        if(ch>='a'&&ch<='z'|| ch>='A'&&ch<='Z'){
            System.out.println(ch+" is an alphabet");
        }
        else{
            System.out.println(ch+" is not an alphabet");
        }
    }
    
}
