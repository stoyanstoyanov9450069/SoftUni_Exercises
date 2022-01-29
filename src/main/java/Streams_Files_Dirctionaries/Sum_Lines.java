package Streams_Files_Dirctionaries;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//Write a program that reads a text file ("input.txt" from the Resources - Exercises)
//        and prints on the console the sum of the ASCII symbols of each of its lines.
//        Use BufferedReader in combination with FileReader.

public class Sum_Lines {
    public static void main(String[] args) {
        String input = "C:\\Users\\Exodia\\IdeaProjects\\SoftUni_Exercises\\src\\main\\java\\input.txt";

        try {BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(input));
            String line = bufferedReader.readLine();

            while (line != null){
                long sum = 0;
                for (char c: line.toCharArray()) {
                    sum += c;
                }
                System.out.println(sum);
                line = bufferedReader.readLine();
            }

        }catch (IOException exception){
            exception.printStackTrace();
        }

    }
}
