import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    WorkFile.read(students);
    Scanner in = new Scanner(System.in);
    boolean exit = true;
    while (exit) {
      System.out.println("Enter command");
      String command = in.next();
      switch (command) {
        case "/r":
          int rand = (int) (Math.random() * students.size());
          System.out.println(students.get(rand));
          System.out.println("enter mark");
          boolean correct = true;
          while (correct) {
            try {
              int mark = in.nextInt();
              students.get(rand).setMark(mark);
              correct = false;
            } catch (IllegalArgumentException e) {
              System.out.println("incorrect mark");
            }
          }

          break;
        case "/p":
          for (Student std : students) {
            System.out.println(std + String.format("%.2f", std.mark()));
          }
          break;
        case "/q":
          in.close();
          exit = false;
          break;
        default:
          System.out.println("Incorrect command");
      }
    }
  }
}