// Compile time polymorphism --> Function overloading
// Function overloading matlab same name ke multiple functions but uske parameters different honge
// agar parameter same rakhna he toh return type different rakhna hoga

class Student{
    String name;
    int rollno;

    public void printInfo(int r){
        System.out.println(r);
    }

    public void printInfo(String n){
        System.out.println(n);
    }

    public void printInfo(int r, String n){
        System.out.println(r + " " + n);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo(2);
        s1.printInfo("Raj");
        s1.printInfo(100, "Jay");
    }
}