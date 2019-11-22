
package exceptionhandling;


public class InsufficientBalance Exception extends Exception{
public InsufficientBalance(String msg){
super(msg);
}
    
}
class Test{
    public static void main(String[] args) {
        double balance;
        try{
            if(balance<=0)
                throw new InsufficieneBalance Exception ("No balance");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
