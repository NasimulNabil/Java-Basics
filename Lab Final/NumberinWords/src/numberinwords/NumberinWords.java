
package numberinwords;

import java.util.Scanner;

public class NumberinWords {
    public static void main(String[] args) {
        int num=0;
        Scanner scanf=new Scanner(System.in);
        int n=scanf.nextInt();
        while(n!=0){
            num=(num*10)+(n%10);
            n/=10;
        }
        while(num!=0){
            switch(num%10){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            num/=10;
        }
        System.out.print("\n");
    }
    
}
