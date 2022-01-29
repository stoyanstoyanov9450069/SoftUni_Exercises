package Streams_Files_Dirctionaries;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//Write a program that reads a text file ("input.txt" from the Resources - Exercises)
//        and prints on the console the sum of the ASCII symbols of all characters inside of the file.
//        Use BufferedReader in combination with FileReader.



public class Sum_Bytes {
    public static void main(String[] args) {
        String input = "C:\\Users\\Exodia\\IdeaProjects\\SoftUni_Exercises\\src\\main\\java\\input.txt";
        long sum = 0;
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(input));
            String line = bufferedReader.readLine();

            while (line != null){
                for (char c: line.toCharArray()) {
                    sum += c;
                }

                line = bufferedReader.readLine();
            }
            System.out.println(sum);

        }catch (IOException exception){
            exception.printStackTrace();
        }

    }
}

