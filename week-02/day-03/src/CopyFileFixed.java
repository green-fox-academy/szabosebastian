import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFileFixed {

  // Write a function that copies the contents of a file into another
  // It should take the filenames as parameters
  // It should return a boolean that shows if the copy was successful


  public static void main(String[] args) {

    Path path = Paths.get("my-file.txt");
    String fileName = path.toString();

    fileReader(path, fileName);

  }

  public static boolean fileReader(Path path, String fileName) {

    Path fileCopied = Paths.get("fileCopied.txt");

    try {
      List<String> fileContent = Files.readAllLines(path);
      fileContent.add(fileName);

      Files.write(fileCopied, fileContent);

      return true;
    } catch (IOException e) {
      return false;
    }
  }
}
