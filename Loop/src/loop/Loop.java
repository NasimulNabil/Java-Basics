
package loop;
import java.util.Scanner;
public class Loop{
    public static void main(String[] args) {
int i,n;
Scanner scanf =new Scanner (System.in);
n=scanf.nextInt();
for(i=2;i<n;i++)
{
    if(n%i==0)
        System.out.println("Number is not prime");
}
        
    }
    
}
