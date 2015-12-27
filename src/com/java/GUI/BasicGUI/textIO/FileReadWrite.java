package com.java.GUI.BasicGUI.textIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by dedeHan on 26.12.2015.
 */
public class FileReadWrite {

    public static String path = "F:\\Java Kursu\\";

    public FileReadWrite(String ReadFileName, String WriteFileName) {

        //buffer for text

        char[] buffer = new char[128];
        for (int i =0; i<buffer.length; i++) {
            buffer[i]='-';
        }

        //create two file-variable

        File readFile = new File(path+ReadFileName);
        File writeFile = new File(path+WriteFileName);

        //Reading
        if (readFile.exists()) {
            try {
                //create reader
                FileReader fr = new FileReader(readFile);

                //read the file and store 100 characters in the
                //buffer starting at position 5 of the buffer
                fr.read(buffer,5,100);
                fr.close();
            } catch (Exception e) {
                System.out.println("problem: openimg file "+readFile.getName());
            }
        }
        else
        {
            System.out.println("File not found"+readFile.getName());
        }

        System.out.println("buffer>"+buffer+"<Buffer");

        //Write
        try {
            if (writeFile.exists()) {
                writeFile.delete();
            }

            if (writeFile.createNewFile()) {
                FileWriter fw = new FileWriter(writeFile);
                fw.write(buffer, 7, 40);

                fw.close();
            } else {
                System.out.println("File not created " + writeFile.getName());
            }
        } catch (Exception e) {
            System.out.println("problem: opening file " + writeFile.getName());
        }
    }

    public static void main(String[] args) {
        FileReadWrite rwf = new FileReadWrite("testFile.txt","testFile1.txt");
    }
}
