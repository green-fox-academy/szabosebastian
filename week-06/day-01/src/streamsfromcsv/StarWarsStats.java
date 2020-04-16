package streamsfromcsv;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StarWarsStats {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("src\\streamsfromcsv\\swcharacters.csv");

    Stream<String> lines = Files.lines(path);

    List<String[]> line = lines.map(l -> l.split(";"))
        .collect(toList());

    int massIndex = line.stream()
        .findFirst()
        .map(header -> Arrays.asList(header).indexOf("mass"))
        .orElse(-1);

    int nameIndex = line.stream()
        .findFirst()
        .map(header -> Arrays.asList(header).indexOf("name"))
        .orElse(-1);

    int heightIndex = line.stream()
        .findFirst()
        .map(header -> Arrays.asList(header).indexOf("height"))
        .orElse(-1);

    int genderIndex = line.stream()
        .findFirst()
        .map(header -> Arrays.asList(header).indexOf("gender"))
        .orElse(-1);

    int birthIndex = line.stream()
        .findFirst()
        .map(header -> Arrays.asList(header).indexOf("birth_year"))
        .orElse(-1);

    List<String> mass = line.stream()
        .skip(1)
        .map(row -> row[massIndex])
        .collect(toList());

    List<String> name = line.stream()
        .skip(1)
        .map(row -> row[nameIndex])
        .collect(toList());

    List<String> height = line.stream()
        .skip(1)
        .map(row -> row[heightIndex])
        .collect(toList());

    List<String> gender = line.stream()
        .skip(1)
        .map(row -> row[genderIndex])
        .collect(toList());

    List<String> birth = line.stream()
        .skip(1)
        .map(row -> row[birthIndex])
        .map(year -> year.substring(0, year.length() - 3))
        .collect(toList());

    Double heaviest = mass.stream()
        .filter(x -> !x.matches("unknown"))
        .mapToDouble(Double::parseDouble)
        .max()
        .getAsDouble();

    Stream<String> result = Stream.concat(gender.stream(), height.stream());
    List<String> resultList = new ArrayList<>();

    resultList = result.collect(toList());

    System.out.println(resultList);


    Integer heavy = heaviest.intValue();
    int heaviestIndex = mass.indexOf(heavy.toString());

    List<String> maleAvgList = new ArrayList<>();
    List<String> femaleAvgList = new ArrayList<>();

    int maleBelow21 = 0;
    int maleBetween21and40 = 0;
    int maleAbove40 = 0;
    int maleUnknown = 0;

    int femaleBelow21 = 0;
    int femaleBetween21and40 = 0;
    int femaleAbove40 = 0;
    int femaleUnknown = 0;

    int otherBelow21 = 0;
    int otherBetween21and40 = 0;
    int otherAbove40 = 0;
    int otherUnknown = 0;

    for (int i = 0; i < gender.size(); i++) {
      if (gender.get(i).equals("male")) {
        maleAvgList.add(height.get(i));
        if (birth.get(i).equals("unkn")) {
          maleUnknown++;
        } else if (Double.parseDouble(birth.get(i)) < 21) {
          maleBelow21++;
        } else if (Double.parseDouble(birth.get(i)) >= 21 && Double.parseDouble(birth.get(i)) <= 40) {
          maleBetween21and40++;
        } else if (Double.parseDouble(birth.get(i)) > 40) {
          maleAbove40++;
        }
      } else if (gender.get(i).equals("female")) {
        femaleAvgList.add(height.get(i));
        if (birth.get(i).equals("unkn")) {
          femaleUnknown++;
        } else if (Double.parseDouble(birth.get(i)) < 21) {
          femaleBelow21++;
        } else if (Double.parseDouble(birth.get(i)) >= 21 && Double.parseDouble(birth.get(i)) <= 40) {
          femaleBetween21and40++;
        } else if (Double.parseDouble(birth.get(i)) > 40) {
          femaleAbove40++;
        }
      } else {
        if (birth.get(i).equals("unkn")) {
          otherUnknown++;
        } else if (Double.parseDouble(birth.get(i)) < 21) {
          otherBelow21++;
        } else if (Double.parseDouble(birth.get(i)) >= 21 && Double.parseDouble(birth.get(i)) <= 40) {
          otherBetween21and40++;
        } else if (Double.parseDouble(birth.get(i)) > 40) {
          otherAbove40++;
        }
      }
    }

    Double maleAverage = maleAvgList.stream()
        .filter(x -> !x.matches("unknown"))
        .mapToDouble(Double::parseDouble)
        .average()
        .getAsDouble();

    Double femaleAverage = femaleAvgList.stream()
        .filter(x -> !x.matches("unknown"))
        .mapToDouble(Double::parseDouble)
        .average()
        .getAsDouble();


    System.out.println("Heaviest character: " + name.get(heaviestIndex));
    System.out.println("Average height of the male characters: " + maleAverage);
    System.out.println("Average height of the female characters: " + femaleAverage);

    System.out.println("male: " + maleBelow21 + " " + maleBetween21and40 + " " + maleAbove40 + " " + maleUnknown);
    System.out.println("female: " + femaleBelow21 + " " + femaleBetween21and40 + " " + femaleAbove40 + " " + femaleUnknown);
    System.out.println("other: " + otherBelow21 + " " + otherBetween21and40 + " " + otherAbove40 + " " + otherUnknown);


  }
}
