
package javaapplication24;

public class NewClass{
    
}
  class Item {
    
    private int itemid;
    private String iname;
    private String qty;
    private double price;
    private String Date;
 public Item(int itemid, String iname, String qty, double price)
    {
        this.itemid = itemid;
        this.iname = iname;
        this.qty = qty;
        this.price = price;
    }

    public void display()
    {
        
        System.out.println("Item ID: "+itemid+"  Name: "+iname+"Qty: "+qty+"Price: "+price);
   
    }
}
 
class Customer  {
    
    private String cname;
    private int cell;
    private int age;
    private String customerid;
    private Item item;
    private String Email;

    public Customer(String cname, int cell, int age, String customerid, Item item, String Email) {
        this.cname = cname;
        this.cell = cell;
        this.age = age;
        this.customerid = customerid;
        this.item = item;
        this.Email = Email;
    }
  public void display()
    {
        System.out.println("Customer Detail: ");
        System.out.println("----------------\n");       
        System.out.println("Name: "+cname+"     Age: "+age+"\nCell: "+cell+"    Email:"+Email+"\nCustomer ID: "+customerid);
        System.out.println("Item Purchased: ");
        System.out.println("----------------\n");
        System.out.println("Purchased Date: 14 December, 2018" );
        item.display();
    }
    
    public static void main(String[] args) { 
        Item i1 = new Item(1001, "Cucumber", "2kg", 20);
        Item i2 = new Item(1001, "Banana", "12ps", 12);  
        Customer c1 = new Customer(  "Kakku", 013241222, 22, "C001",i1,"sojib.19991018@gmail.com" );  
        c1.display();
        i2.display();
         
       
    }}
    

