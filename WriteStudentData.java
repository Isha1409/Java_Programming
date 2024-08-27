import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteStudentData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        try (FileOutputStream fos = new FileOutputStream("students.dat");
             DataOutputStream dos = new DataOutputStream(fos)) {

            dos.writeInt(numberOfStudents); 
            for (int i = 1; i <= numberOfStudents; i++) {
                System.out.print("Enter name of student " + i + ": ");
                String name = scanner.nextLine();
                System.out.print("Enter age of student " + i + ": ");
                int age = scanner.nextInt();
                scanner.nextLine(); 
                dos.writeUTF(name); 
                dos.writeInt(age);  
            }

            System.out.println("Student data successfully written to students.dat");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
