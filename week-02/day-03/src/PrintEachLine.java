import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) throws IOException {
        try {
            Path path = Paths.get("my-file.txt");
            List<String> lines = Files.readAllLines(path);
            for (String line: lines) {
                System.out.println(line);
            }
        } catch (NoSuchFileException e){
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}
