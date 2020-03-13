import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {

        reverseFile();

    }

    public static void reverseFile () {

        Path path = Paths.get("reversed-order.txt");

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

        for (int i = lines.size()-1; i > 0; i--) {
            String line = lines.get(i);
            String newLine ="";
            for (int j = 0; j < line.length(); j++) {
                newLine += (line.charAt(j) + "");
            }
            finished.add(newLine);
        }
        return finished;
    }
}