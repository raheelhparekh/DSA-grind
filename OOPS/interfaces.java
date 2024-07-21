interface Animal{
    // this is an abstract function void walk();
    // by default abstract hota he , so we can remove abstract keyword
    void walk();

    // interface me methdod ka body/implementation nahi hota , non abstract method nahi hota
    // void eat(){
    //     System.out.println("Animal is eating");
    // };


    //NOTE: cannot have constructor in interface
    // Animal(){
    //     System.out.println("Animal Constructor is created");
    // }
}


interface Herbivore{
   
}

// Note: IMPLEMENTS KEYWORD IS USED
// multiple inheritance is possible here in interfaces and not in classes
class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("Horse is walking");
    }
    
}

public class interfaces {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();  
    }
    
}
