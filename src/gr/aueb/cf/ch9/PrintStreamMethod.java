package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamMethod {

    public static void main(String[] args) {

//        try(PrintStream ps = new PrintStream("D:/Files/File1.txt", StandardCharsets.UTF_8);) {
        try(PrintStream ps = new PrintStream(new FileOutputStream("D:/Files/File1.txt", true), true, StandardCharsets.UTF_8)) {
            printMethod(ps, "Hello Coding Factory");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void printMethod(PrintStream ps, String message) {
        ps.println(message);
    }
}
