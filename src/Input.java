import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//    System.out.println("Enter your rollno: ");
//    int rollno = input.nextInt();
//    System.out.println("Roll Number is " +rollno);

   // System.out.println(input.nextLine());

    String name = input.next();
    System.out.println(name);

    float marks = input.nextFloat();
    System.out.println(marks);
    }
}
