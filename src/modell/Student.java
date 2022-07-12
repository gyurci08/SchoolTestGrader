package modell;


import Generator.RandomGenerator;
import calculator.CalculateGrade;
import factory.ResultFactory;

import java.util.ArrayList;

public class Student {
    private String id;
    ArrayList<Result> results=new ArrayList<>();
    private int elmeleti;
    private int gyakorlati;

    public int getElmeleti() {
        return elmeleti;
    }

    public int getGyakorlati() {
        return gyakorlati;
    }

    public void getGrades(){
        int elm1=0;
        int elm2=0;
        int elm3=0;
       int gyak1=0;
        int gyak2=0;
        int gyak3=0;

        for (int i = 0; i < results.size(); i++) {
           if(results.get(i).getType().substring(0,9).equals("Elmélet 1")) elm1=(int)results.get(i).getPercent();
        }
        for (int i = 0; i < results.size(); i++) {
            if(results.get(i).getType().substring(0,9).equals("Elmélet 2")) elm2=(int)results.get(i).getPercent();
        }
        for (int i = 0; i < results.size(); i++) {
            if(results.get(i).getType().substring(0,9).equals("Elmélet 3")) elm3=(int)results.get(i).getPercent();
        }
        for (int i = 0; i < results.size(); i++) {
          try{  if(results.get(i).getType().substring(0,11).equals("Gyakorlat 1")) gyak1=(int)results.get(i).getPercent();}
          catch (Exception  StringIndexOutOfBoundsException) {i++;}
        }
        for (int i = 0; i < results.size(); i++) {
            try{  if(results.get(i).getType().substring(0,11).equals("Gyakorlat 2")) gyak2=(int)results.get(i).getPercent();}
            catch (Exception  StringIndexOutOfBoundsException) {i++;}
        }
        for (int i = 0; i < results.size(); i++) {
            try{  if(results.get(i).getType().substring(0,11).equals("Gyakorlat 3")) gyak3=(int)results.get(i).getPercent();}
            catch (Exception  StringIndexOutOfBoundsException) {i++;}
        }


      elmeleti= CalculateGrade.getGrade(elm1,elm2,elm3);
        gyakorlati= CalculateGrade.getGrade(gyak1,gyak2,gyak3);
    }




    public void addResult(Result a){
        boolean javitva=false;
        for (int i = 0; i < results.size(); i++) {
            if(results.get(i).getType().equals(a.getType()+" pj")) {javitva=true; break;}
        }
        if(!javitva) results.add(a);
}

public Result getResult(int i){
    return results.get(i);
}


    public String getId() {
        return id;
    }



    public int getResultSize(){
    return results.size();
    }



    public Student(String id){
this.id=id;
    }



}




