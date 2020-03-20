import java.io.*;

public class CountLines {
  public static void main(String[] args) throws IOException {
    int startLine = 0;

    try {
      System.out.println(countingLines(startLine));
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    } catch (Exception e) {
      System.out.println("There is a problem");
    }
  }

  public static int countingLines(int numberOfLines) throws IOException {

    File name = new File("my-file.txt");
    String fileName = name.getName();
    System.out.println(fileName);

    BufferedReader reader = new BufferedReader(new FileReader("my-file.txt"));

    int lines = 0;

      while (reader.readLine() != null) {
          lines++;
      }
    reader.close();

    return lines;
  }
}
