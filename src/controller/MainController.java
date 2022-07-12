package controller;

import Generator.RandomGenerator;
import Storage.StudentStorage;
import factory.ResultFactory;
import io.FileIn;
import modell.Exam;
import modell.Student;


public class MainController
{
    StudentStorage students= new StudentStorage();




public void start(){
 String fileNames[]={"Elmélet 1 pj","Elmélet 1","Elmélet 2 pj","Elmélet 2","Elmélet 3 pj", "Elmélet 3",
            "Gyakorlat 1 pj", "Gyakorlat 1","Gyakorlat 2 pj","Gyakorlat 2","Gyakorlat 3 pj","Gyakorlat 3"};


try {


    for (int i = 0; i <12; i++) {
        DataController.start(FileIn.read("Adatok/"+fileNames[i], "csv"),students,fileNames[i]);
    }


    for (int i = 0; i < students.size(); i++) {
        students.get(i).addResult(ResultFactory.newResult("Elmélet 3", (int)(RandomGenerator.generate(0.0,1.0)*100),false));
        students.get(i).addResult(ResultFactory.newResult("Gyakorlat 3", (int)(RandomGenerator.generate(0.0,1.0)*100),false));
    }

    for (int i = 0; i < students.size(); i++) {
        students.get(i).getGrades();
    }







students.listStudents();



}
catch (Exception e){
    System.out.println("Some error occured: "+e.getMessage());
}




}




}
