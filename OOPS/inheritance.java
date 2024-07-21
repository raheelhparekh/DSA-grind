// Description: Inheritance in Java
// re usability badh jati he 
// ek class ke properties dusri class me use karne ke liye inheritance ka use hota he


class Shape{
    // parent class/base class
    String color;
    void draw(){
        System.out.println("Drawing shape but color is : "+ color);
    }
}

// extends means Rectangle class ne le liya class Shape ki properties
// rectangle class me sab property hogi shape class ki even if we dont write them
class Rectangle extends Shape{
    // child class/ derived class
    
}

class Circle extends Shape{
    
}

public class inheritance {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.color = "Red";
        Circle c = new Circle();
        c.color = "Blue";
        r.draw();
        c.draw();
    }
}

// 5 levels of inheritance in java 

// Single Inheritance
// SHAPE 
// Triangle extends Shape

// Multilevel Inheritance
// SHAPE
// Triangle extends Shape
// EquilateralTriangle extends Triangle

// Hierarchical Inheritance
// SHAPE
// Triangle extends Shape
// Rectangle extends Shape

// Hybrid Inheritance
// SHAPE
// Triangle extends Shape
// Rectangle extends Shape
// Square extends Triangle, Rectangle



