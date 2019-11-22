
package summerf18;


public  class Car extends Vehicle implements Service,Display {

  private int nowheel;
  private double price;
  public Car(String model,int nowheel,double price){
      super(model);
      this.nowheel=nowheel;
      this.price=price;
      
  }
  public void start(){
      System.out.println("start");
      
  }
  public void stop(){
      System.out.println("stop");
  }
  public void refuel(){
      System.out.println("yes");
  }
  public void on(){
      System.out.println("on");
  }
  public void off(){
      System.out.println("off");
  }
  public void display(){
      System.out.println("Model: "+model+"No wheel: "+nowheel+"Price: "+price);
      
  }
  public static void main(String[]args){
      Car c=new Car ("BMW",5,123456);
      c.display();
      c.start();
      c.stop();
      c.refuel();
      c.on();
      c.off();
  }

    
    
}
