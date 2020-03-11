import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("my-file.txt");
        Path pathCopy = Paths.get("my-file2.txt");
        Path fileName = path.getFileName();

        readfile(path,pathCopy,fileName);
    }
    public static void readfile (Path path, Path pathCopy, Path fileName) throws IOException {

        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }

            lines.add(fileName.toString());
            Files.write(pathCopy, lines);
        }
        catch(Exception e) {
        }
    }
}
