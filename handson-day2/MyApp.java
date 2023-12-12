import java.util.Scanner;
public class MyApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ketik nama, email & no. HP: ");
        String scan = scanner.nextLine();
        scanner.close();
        String[] arrData = scan.split(" ");

        Student student = new Student();
        student.setName(arrData[0]);
        student.setEmail(arrData[1]);
        student.setPhoneNumber(arrData[2]);

        System.out.println("Student: " + student);
        System.out.println("Student.getName(): " + student.getName());
        System.out.println("Student.getEmail(): " + student.getEmail());
        System.out.println("Student.getPhoneNumber(): " + student.getPhoneNumber());
    }
}