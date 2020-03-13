import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {

        reverseFile();

    }

    public static void reverseFile () {

        Path path = Paths.get("reversed-lines.txt");

        try {
            List<String> lines = Files.readAllLines(path);
            List<String> reversed = reversedLines(lines);

            for (String line : reversed) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> reversedLines(List<String> lines) {

        List<String> finished = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String newLine ="";
            for (int j = line.length()-1; j > 0; j--) {
               newLine += (line.charAt(j) + "");
            }
            finished.add(newLine);
        }
        return finished;
    }
}