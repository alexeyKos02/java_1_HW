import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static void Read(ArrayList<Student> students) {
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
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Read(students);
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
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case "/p":
                    for (Student std : students) {
                        System.out.println(std + String.format("%.2f",std.mark()));
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