class Student {
    int rollno;
    String name;

    // constructor same name as of class
    // does not return any value
    // automatically invoked when object is created

    Student() {
        System.out.println("Constructor is invoked");
    }

    // parameterized constructor
    Student(int r, String n) {
        this.rollno = r;
        this.name = n;
    }
}
// DESTRUCTORS
// jese constructors hote he wese hi destructors hote
// java me destructors nahi hote kyuki java me garbage collector hota he
// garbage collector automatically destroys the object when it is no longer needed

public class objects {
    public static void main(String[] args) {
        Student s1 = new Student(2, "Raj");
        System.out.println(s1.rollno + " " + s1.name);
    }
}