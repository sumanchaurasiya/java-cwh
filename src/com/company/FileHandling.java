package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
//code to create a new file
        /*
        File file = new File("myfile.txt");
        try{
            file.createNewFile();
        }
        catch(IOException e){
            System.out.println("unable to create this file");
            e.printStackTrace();
        }

         */

        //code to write to a file
        /*
        try{
            FileWriter fileWriter = new FileWriter("myfile.txt");
            fileWriter.write("My name is Suman Chaurasiya\n Iam learning java");
            fileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

         */

        //code to read a file

        File file = new File("myfile.txt");
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        //deleting a file
        File myFile = new File("myfile.txt");
        if(myFile.delete()){
            System.out.println("i have deleted " + myFile.getName());
        }
        else{
            System.out.println("some problem occurred");
        }


    }
}
