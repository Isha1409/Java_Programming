import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadStudentData {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("students.dat");
             DataInputStream dis = new DataInputStream(fis)) {

            int numberOfStudents = dis.readInt();
            System.out.println("Number of students: " + numberOfStudents);

            for (int i = 1; i <= numberOfStudents; i++) {
                String name = dis.readUTF(); 
                int age = dis.readInt();   
                System.out.println("Student " + i + ": " + name + ", Age: " + age);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
