package MainController;

import lombok.ToString;
import org.apache.commons.math3.random.RandomGenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;

public class Main {


    public static void main(String[] args) {
      int [] arr ={1,3,2,5,6,2,1,};

    }

    public int cout(int a, int b) {
        return a + b;
    }

    public Integer add(Object x) {
        if (x instanceof Integer) {

        } else if (x instanceof String) {

        } else return 0;
        return 0;
    }

    void getTreeFiles(String path) {
        List<String> listFilesList = new ArrayList<>();
        File file = new File(path);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                listFilesList.add(listFiles[i].toString());
                if (listFiles[i].isDirectory()) {
                    listFilesList.add(listFiles[i].toString());
                    System.out.println(listFiles[i].toString());
                    getTreeFiles(listFiles[i].toString());
                }
            }
            try {
                FileWriter fileWriter = new FileWriter("resault.txt");
                fileWriter.write(listFilesList.toString());
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    } public static double sqr(double arg) {
        while (true);
    }
}

