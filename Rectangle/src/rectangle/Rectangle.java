/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author hp
 */
public class Rectangle {
    int height,width;
    Rectangle (int height,int width){
        this.height=height;
        this.width=width;
    }
    public void display()
    {
        System.out.println(height*width);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r[]=new Rectangle [3];
        r[0]=new Rectangle(12,12);
        r[1]=new Rectangle (34,98);
        r[2]=new Rectangle (44,33);
        for(int i=0;i<r.length;i++)
            r[i].display();
            
        
    }
    
}
