package OOPS;

import java.util.Arrays;
import java.util.Random;

//A class is named group of properties and functions
//A class is a template of an object
//An object is an instance of the class
//variabes that are declared outside the method and inside the class
public class first {
    public static void main(String[] args) {
        // store 5 roll nos
        int [] numbers = new int[5];

        //store 5 names

        String [] names = new String[5];

        //data of 5 students : [roll no, name, marks]
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        Student rick = new Student(13, "Soumya Banerjee", 88.5f);
        Student rahul = new Student();
//        rick.rno = 13;
//        rick.name = "Soumya Banerjee";
//        rick.marks = 88.5f;
//        rick.changeName("Shoe lover");
//        rick.greeting();

//        System.out.println(rick.rno);
//        System.out.println(rick.name);
//        System.out.println(rick.marks);

        Student random = new Student(rick);

        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);
    }
}
//creation of a class
// class {class name} { datatypes }

class Student {
    //data of 5 students : [roll no, name, marks]
    int rno;
    String name;
    float marks = 90.0f;

    // we need a way to add the values of the above
    //properties objects by objects

    //we need one word to access every object

    void greeting () {
        System.out.println("Hello my name is " + this.name);
    }

    void changeName (String newName){
        this.name = newName;
    }

    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
    Student () {
        this.rno = 13;
        this.name = "Soumya Banerjee";
        this.marks = 88.5f;
    }

    //Student arpit = new Student (17, "Arpit", 89.7f);
    //here, 'this' will be replaced with 'arpit'
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}