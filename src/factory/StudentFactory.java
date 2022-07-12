package factory;


import modell.Student;

import java.util.ArrayList;

public abstract class StudentFactory {



    public static Student newStudent(String id){
        return new Student(id);
    }



}
