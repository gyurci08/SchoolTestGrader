package controller;

import Storage.StudentStorage;

import java.util.ArrayList;

public abstract class DataController {







    public static void start(ArrayList raw, StudentStorage s, String type){
        String sor;
        String darabsor[];


        for (int i =0; i < raw.size(); i++) {
sor=raw.get(i).toString();
sor=sor.replace(",",".");
darabsor=sor.split(";");
s.add(darabsor[0], (int)(Double.parseDouble(darabsor[1])*100), type);
        }







    }


}
