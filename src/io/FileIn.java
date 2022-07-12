package io;

import Storage.StudentStorage;
import modell.Result;
import modell.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class FileIn {
    private static Scanner be;

    public static ArrayList read(String fileName, String fileType) throws FileNotFoundException {
        ArrayList<String> adat= new ArrayList<>();
        be=new Scanner(new File(fileName+"."+fileType));

        while(be.hasNextLine()){
           adat.add(be.nextLine());
        }
        be.close();

        return adat;


    }



}
