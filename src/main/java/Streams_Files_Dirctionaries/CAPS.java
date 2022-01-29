package Streams_Files_Dirctionaries;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


// Write a program that reads a text file ("input.txt" from the Resources - Exercises)
// and changes the casing of all letters to the upper. Write the output to another file ("output.txt").


public class CAPS {
    public static void main(String[] args) throws IOException {

        String input = "C:\\Users\\Exodia\\IdeaProjects\\SoftUni_Exercises\\src\\main\\java\\input.txt";
        String output = "C:\\Users\\Exodia\\IdeaProjects\\SoftUni_Exercises\\src\\main\\java\\output.txt";
        List<String> allLines = Files.readAllLines(Path.of(input));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));

        for (String line: allLines) {
            writer.write(line.toUpperCase());
            writer.newLine();

        }
        writer.close();
    }
}
