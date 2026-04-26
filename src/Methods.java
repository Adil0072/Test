import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        sum();
        sum();
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
