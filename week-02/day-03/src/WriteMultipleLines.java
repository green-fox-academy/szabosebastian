import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("my-file.txt");
        String word = "apple";
        int numberOfLines = 5;
        try{
            myFunction(path,word,numberOfLines);
        } catch (Exception e){
            System.out.println("NO ERRORS");
        }
    }

    public static void myFunction (Path path, String word, int numberOfLines) throws IOException {
        List<String> lines = new ArrayList<>();

        for (int i = 0; i < numberOfLines; i++) {
            lines.add(word);
        }
        Files.write(path, lines);
    }
}
