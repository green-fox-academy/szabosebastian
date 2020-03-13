import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DecryptDoubled {
    public static void main(String[] args) {

        decrypto();

    }

    public static void decrypto () {

        Path path = Paths.get("dublicated-chars.txt");

        try {
            List<String> lines = Files.readAllLines(path);
            List<String> decrypted = decryptedLines(lines);

            for (String line : decrypted) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> decryptedLines(List<String> lines) {

        List<String> finished = new ArrayList<>();

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                String newLine ="";
                for (int j = 0; j < line.length(); j++) {
                    if (j % 2 != 0) newLine += (line.charAt(j) + "");
                }
                finished.add(newLine);
            }
            return finished;
        }
    }
