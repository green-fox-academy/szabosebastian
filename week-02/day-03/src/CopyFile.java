import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) throws IOException {

    Path path = Paths.get("my-file.txt");
    Path pathCopy = Paths.get("my-file2.txt");
    Path fileName = path.getFileName();

    System.out.println(readfile(path, pathCopy, fileName));
  }

  public static boolean readfile(Path testPath, Path pathCopy, Path fileName) throws IOException {

    try {
      List<String> lines = Files.readAllLines(testPath);
      for (String line : lines) {
        System.out.println(line);
      }

      lines.add(fileName.toString());
      Files.write(pathCopy, lines);

      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
