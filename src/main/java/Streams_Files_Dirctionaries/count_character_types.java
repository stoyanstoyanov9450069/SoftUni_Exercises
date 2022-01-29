package Streams_Files_Dirctionaries;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

//Write a program that reads a list of words from the file ("input.txt" from the Resources - Exercises)
// and finds the count of vowels, consonants, and punctuation marks. Assume that:
//        ⦁	a, e, i, o, u are vowels, only lower case.
//        ⦁	All others are consonants.
//        ⦁	Punctuation marks are (! , . ?).
//        ⦁	Do not count whitespace.
//        Write the results to another file – "output.txt".


public class count_character_types {
    public static void main(String[] args) throws IOException {

        int vowelCount = 0;
        int puncCount = 0;
        int consonantsCount = 0;

        String input = "C:\\Users\\Exodia\\IdeaProjects\\SoftUni_Exercises\\src\\main\\java\\input.txt";
        String output = "C:\\Users\\Exodia\\IdeaProjects\\SoftUni_Exercises\\src\\main\\java\\output.txt";
        List<String> allLines = Files.readAllLines(Path.of(input));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));

        for (String line: allLines) {

            for (int index = 0; index < line.length() ; index++) {
                char currentSymbol = line.charAt(index);
                if (currentSymbol == ' '){
                    continue;
                }else if (currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol=='i' || currentSymbol == 'o' || currentSymbol == 'u'){
                    vowelCount++;
                }else if (currentSymbol == '.' || currentSymbol == '!' || currentSymbol == '?' || currentSymbol == ','){
                    puncCount++;
                }else {
                    consonantsCount++;
                }
            }

        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantsCount);
        System.out.println("Punctuation: " + puncCount);
    }
}
