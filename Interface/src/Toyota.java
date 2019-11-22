/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Toyota extends Car implements Drive Power {
private double price;
public Toyota(String model,double price){
super(model);
this.price=price;

}
}
public void start(){
System.out.println("Start");
}
public void stop(){

}

    

