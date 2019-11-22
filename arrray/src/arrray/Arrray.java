
package arrray; 
 import java.util.Scanner;

public class Arrray {
   


    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner scanf=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=scanf.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print("value :" +a[i]);
        }
    }
    
}
