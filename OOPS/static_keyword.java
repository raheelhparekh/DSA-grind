class Student{
    String name;
    // static keyword is used to make a variable common to all objects of the class
    // static means school ka naam ek hi hoga sabke liye
    static String school;
}

public class static_keyword {
    public static void main(String[] args) {
        Student.school = "CCS"; // static he direct class ke name se access kar sakte he

        Student s1 = new Student();
        s1.name = "Rohan";
        System.out.println(s1.name + " " + Student.school); 
    }
}
