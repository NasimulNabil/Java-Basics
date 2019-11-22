/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public abstract class Car {
    protected String model;
    public Car(String model){
        this.model=model;
    }
    public abstract void display();
    
}
