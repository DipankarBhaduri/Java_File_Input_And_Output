package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileWithText {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("MyFile.txt"));
        for (int i = 0; i < 100; i++) {
            bufferedWriter.write("\nI AM A JAVA DEVELOPER");
            bufferedWriter.write("\nHERE IS THE ANATHER LINE");
        }
        bufferedWriter.close();
    }
}
