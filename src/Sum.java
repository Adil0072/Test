import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1,num2,sum;
        System.out.println("Enter 1st number: ");
        num1 = input.nextFloat();
        System.out.println("Enter 2nd number: ");
        num2 = input.nextFloat();
        sum = num1 + num2;
        System.out.println("sum is: " +sum);
    }
}