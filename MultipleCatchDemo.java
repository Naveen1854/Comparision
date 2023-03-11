import java.util.*;
public class MultipleCatchDemo{
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Scanner sc = new Scanner(System.in);
        try{
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = a/b;
        }
        catch(ArithmeticException ae){
            System.out.println("The denominator should not be zero");
            System.out.println("Enter new value for b:");
            b = sc.nextInt();
            c = a/b;
        }
        catch(ArrayIndexOutOfBoundsException kN){
            System.out.println("This program excepting input from user");
            System.out.println("Enter values for a & b");
            a = sc.nextInt();
            b = sc.nextInt();
            c = a/b;
        }
        System.out.println(c);
    }
}