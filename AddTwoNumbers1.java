import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner sc = new scanner (System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextINT();

        System.out.println("Enter Second Number: ");
        num2 = sc.nextINT();
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}
