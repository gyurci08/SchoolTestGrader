package Storage;


import factory.StudentFactory;
import modell.Result;
import modell.Student;

import java.util.ArrayList;

public class StudentStorage {
    private ArrayList<Student> students= new ArrayList<>();



    public Student get(int i){
        return students.get(i);
    }



    public boolean isStudentIn(String id) {
        for (Student s:students) {
            if(s.getId().equals(id)) {return true;}
        }

        return false;
    }

    public Student getStudent(String id) {
        for (Student s:students) {
            if(s.getId().equals(id)) {return s;}
        }
        return new Student(id);
    }

    public int size(){
        return students.size();
    }






    public void listStudents(){

        for (Student s:students) {
            System.out.println(s.getId());
            for (int i = 0; i < s.getResultSize(); i++) {
                System.out.println("\t"+s.getResult(i).getType()+"\t"+s.getResult(i).getPercent());
            }
            System.out.println("Grades: "+s.getElmeleti()+" "+s.getGyakorlati());
        }
    }


    public void add(String id, int percent, String type){
        boolean isJavito=false;
        if(type.endsWith("pj")) isJavito=true;
        Student student=getStudent(id);
            if(!isStudentIn(id)) students.add(student);
            student.addResult(new Result(type, percent, isJavito));

    }








    public StudentStorage(){}
}
