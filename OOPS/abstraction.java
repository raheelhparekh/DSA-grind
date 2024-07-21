
// matlab animal class exist karta he but uska koi object banke matlab nahi he 
// uska koi real world me existence nahi he , objects Horse, chicken banake matlab he
abstract class Animal{

    // i want every animal to walk so yeh exist har animal ke liye karega jabki iska koi function ka body nahi he
    abstract void walk();

    // abstract class me normal function bhi ho sakti he
    public void eat(){
        System.out.println("Animal is eating");
    }

    // constructor bhi ho sakta he
    Animal(){
        System.out.println("Animal Constructor is created");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor is created");
    }
    public void walk(){
        System.out.println("Horse is walking");
    }

}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken is walking");
    }
}

// Abstraction means hiding the information that is not necessary to the user and only showing the information that is necessary to the user

public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        Chicken c = new Chicken();
        c.walk();

        // now if we try to create an object of Animal class then it will give an error--> Runtime error ayega
        // Animal a = new Animal();
        // a.walk();

    }
}
