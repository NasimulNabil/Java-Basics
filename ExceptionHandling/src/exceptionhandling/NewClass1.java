
package exceptionhandling;
public class NewClass1 {
    public static void calculate() throws Exception{
        System.out.println(10/0);
    }
    public static void main(String[] args) throws Exception {
        calculate();
        
    }
    
}
class Division{
    public static void main(String[] args) {
        int a=10,b=5,c=-5;
        int result;
        try{
            result=a/(b+c);
            System.out.println("result="+result);
        }
        catch(ArithmeticException e){
        System.out.println("Division by zero is a exception");
        
    }
        finally{System.out.println("Final block");}
    }
}