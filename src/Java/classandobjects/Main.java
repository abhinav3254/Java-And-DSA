package Java.classandobjects;

import java.util.Arrays;

public class Main {

    public Main () {
        System.out.println("Inside Main Const");
        Student student = new Student(12,"Abhinav",80);
    }
    public static void main(String[] args) {
        // Student student = new Student(1,"Abhinav",95);
        Student student; // goes to heap memory
        // happens at Compile time
        student = new Student(); // goes to stack memory
        // happens at Run time
//        System.out.println(student.marks);

//        Student[] students = new Student[5];
//        System.out.println(Arrays.toString(students));

//        System.out.println(student);
//

//        student.marks = 98.0f;
//        System.out.println(student.marks);

        

    }
}
