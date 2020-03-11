import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) throws IOException {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"
        try {
            writeFile();
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }

    public static void writeFile () throws IOException {
        String str = "Szebi";
        FileWriter writer = new FileWriter("my-file.txt");
        writer.write(str);

        writer.close();
    }
}