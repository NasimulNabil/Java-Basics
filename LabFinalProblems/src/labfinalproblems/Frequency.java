
package labfinalproblems;

import java.util.Scanner;


public class Frequency {
    public static void main(String[] args) {
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        int arr[]=new int[10];
        int digit=0;
        while(num!=0){
            digit=num%10;
            arr[digit]++;
            num/=10;
        }
        for(int i=0;i<arr.length;i++){
            int count=arr[i];
            if(count!=0){
                System.out.println(i+ "\t" +count);
            }
        }
        
    }
    
}
