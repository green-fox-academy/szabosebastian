import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) throws IOException {
        readFile();

    }

    public static void readFile () throws IOException {
        Path filePath = Paths.get("log.txt");

        List<String> lines = Files.readAllLines(filePath);
        List<String> cuttedIP = IPaddress(lines);

        for (String line: cuttedIP) {
            System.out.println(line);
        }
    }
    public static List<String> IPaddress (List <String> lines) {
        List<String> onlyIPlist = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String newLine ="";
            for (int j = 0; j < line.length(); j++) {
                if(j > 26  && j < 38 )
                    newLine += (line.charAt(j));
        }
/*            if (newLine.equals(newLine)){
                System.out.println();
            } else {

            }*/
            onlyIPlist.add(newLine);
        }
        return onlyIPlist;
    }
}
