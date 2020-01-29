package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("C:/999/readme.txt");
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // чтение
        //Scanner scan = new Scanner(file);
        // запись
        PrintWriter pw = new PrintWriter(file);
        pw.println("adasdfasdfasdf");
        pw.close();




    }
}
