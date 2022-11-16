import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class WorkFile {

  static void read(List<Student> students) {
    File file = new File("input.txt");
    try {
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String line;
      int number = 1;
      while ((line = reader.readLine()) != null) {
        var lineS = line.split(" ");
        if (lineS.length > 2) {
          System.out.println(number + "line is incorrect");
          number++;
          continue;
        }
        students.add(new Student(lineS[0], lineS[1]));
        number++;
      }
    } catch (IOException e) {
      System.out.println("file handling error");
    }
  }
}
