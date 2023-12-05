package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveInAbsulatePath {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Self-Progress\\output.txt"));
        for(int i = 0; i < 20; i++) {
            bufferedWriter.write("\n" + "I AM WORKING AS A JAVA DEVELOPER");
            bufferedWriter.write("\n" + "I AM IN E-LABS.AI");
        }
        bufferedWriter.close();
    }
}
