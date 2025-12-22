// public class OOPs {
//     public static void main(String[] args) {
//         Pen p1=new Pen();
//         p1.setTip(5);
//         p1.setColor("Blue");
//         System.out.println("Color of pen is: " + p1.getColor());
//         System.out.println("Tip of pen is: " + p1.getTip());
//     }   
// }
// class Pen{ 
//     String color;
//     int tip;

//     void setColor(String newColor){
//         color=newColor;
//     }
//     void setTip(int newTip){
//         tip=newTip;
//     }

//     // Getters and SETTERS :
//     String getColor(){
//         return this.color;

//     }
//     int getTip(){
//         return this.tip;
//     }
// }
// ----------------------------------------------------------------------------------------------------------------
// ## Constructors in java : 


// public class OOPs{
//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name=" Krishna ";
//         s1.age=20;
//         s1.roll=108;
//         System.out.println("Name of student is: " + s1.name);
//         System.out.println("Age of student is: " + s1.age); 
//         System.out.println("Roll number of student is: " + s1.roll);

//     }
// }
//  class Student{
//     String name;
//     int age;
//     int roll;
//     // Default constructor :
//     // This constructor is called when an object of the class is created without any parameters.
//  Student(){

//     }
// }
// -------------------------------------------------------------------------------------------------------
// ## Constructors with parameters in java :
// Parameterized constructors allow you to initialize an object with specific values at the time of creation. This is useful for setting initial states or properties of an object.
//  default  constructor is a constructor that does not take any parameters. It is automatically provided by Java if no other constructors are defined in the class. The default constructor initializes object attributes to their default values (e.g., null for objects, 0 for integers, etc.).


// import java.util.*;
// public class OOPs {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         Student s2 = new Student("Krishna");
//         Student s3 = new Student(20);
//         Student s4 = new Student(108, true); // Constructor with roll
//         Student s5 = new Student("Krishna", 20);
//         Student s6 = new Student("Krishna", 20, 108);

//         System.out.println("\n--- Student Details ---");
//         s1.display();  // Default constructor
//         s2.display();  // Only name set
//         s3.display();  // Only age set
//         s4.display();  // Only roll set
//         s5.display();  // name and age set
//         s6.display();  // name, age, and roll set
//     }
// }
// class Student {
//     String name;
//     int age;
//     int roll;
//     Student() {
//         System.out.println("Default constructor called");
//     }
//     Student(String name) {
//         System.out.println("Parameterized constructor with name called");
//         this.name = name;
//     }
//     Student(int age) {
//         System.out.println("Constructor with age called");
//         this.age = age;
//     }
//     // Constructor with roll :
//     Student(int roll, boolean isRoll) {
//         System.out.println("Constructor with roll called");
//         this.roll = roll;
//     }
//     Student(String name, int age) {
//         System.out.println("Constructor with 2 parameters called");
//         this.name = name;
//         this.age = age;
//     }
//   Student(String name, int age, int roll) {
//         System.out.println("Constructor with 3 parameters called");
//         this.name = name;
//         this.age = age;
//         this.roll = roll;
//     }
//     void display() {
//         System.out.println("Name: " + name + ", Age: " + age + ", Roll: " + roll);
//     }
// }
// ----------------------------------------------
// ## copy  constructor in java :
// A copy constructor is a special type of constructor that creates a new object as a copy of an existing object. It is used to initialize an object with the values of another object of the same class.


// import java.util.*;
// public class OOPs {
//     public static void main(String[] args) {
//         Student s1 = new Student("Krishna", 20, 108);// parameterized constructor
//         Student s2 = new Student(s1); // Copy constructor
//         System.out.println("Original Student: ");
//         s1.display();
//         System.out.println("Copied Student: ");
//         s2.display();
//     }
// }
// class Student {
//     String name;
//     int age;
//     int roll;

//     // Default constructor :
//     Student() {
//         System.out.println("Default constructor called");
//     }
//     // Parameterized constructor :
//     Student(String name, int age, int roll) {
//         System.out.println("Parameterized constructor called");
//         this.name = name;
//         this.age = age;
//         this.roll = roll;
//     }    
//     // Copy constructor :
//     Student(Student other) {
//         System.out.println("Copy constructor called");
//         this.name = other.name;
//         this.age = other.age;
//         this.roll = other.roll;
//     }
//     void display() {
//         System.out.println("Name: " + name + ", Age: " + age +
//                            ", Roll: " + roll);
//     }      
// }  
// -------------------------------------------------------------------------------------------------------------------------------------------------
// ## Shallow Copy and Deep Copy in Java:
// Shallow Copy: A shallow copy creates a new object, but it copies the references of the fields from the original object. If the original object contains references to mutable objects, changes made to those objects will be reflected in both the original and copied objects.
// Deep Copy: A deep copy creates a new object and also recursively copies all objects referenced by the original object. This means that changes made to mutable objects in the copied object will not affect the original object.


import java.util.Arrays;
class Student {
    String name;
    int[] marks; // Array field

    // Constructor
    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks; // Reference passed (shallow)
    }

    // Shallow Copy Constructor
    Student(Student other) {
        this.name = other.name;
        this.marks = other.marks; // SHALLOW COPY (same reference)
    }

    // Deep Copy Method
    Student deepCopy() {
        int[] newMarks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            newMarks[i] = marks[i]; // Copy each value
        }
        return new Student(new String(this.name), newMarks);
    }

    void display() {
        System.out.print("Name: " + name + ", Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}

public class OOPs {
    public static void main(String[] args) {
        int[] marks = {90, 85, 95};

        Student s1 = new Student("Krishna", marks);
        Student s2 = new Student(s1);             // Shallow Copy
        Student s3 = s1.deepCopy();               // Deep Copy

        System.out.println("=== Before Modifying Original ===");
        s1.display();
        s2.display();
        s3.display();

        // Modify original array
        s1.marks[0] = 100;
        s1.name = "Radha";

        System.out.println("\n=== After Modifying Original ===");
        s1.display();
        s2.display(); // Will reflect changes (shallow copy)
        s3.display(); // Will remain unchanged (deep copy)
    }
}

// -------------------------------------------------------------------------------------------------------
        //   ## destructors in java :
// Destructors in Java are not explicitly defined like in C++. Java has a garbage collector that automatically manages memory and cleans up objects that are no longer in use. However, you can define a method called `finalize()` in your class, which acts as a destructor. This method is called by the garbage collector before reclaiming the memory occupied by the object.
// However, relying on `finalize()` is discouraged in modern Java programming due to unpredictability

