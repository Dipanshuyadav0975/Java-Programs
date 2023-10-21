import java.util.Scanner;
public class TwoNumbers 
{
    public static void main(String...args)
    {
        float num1 , num2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number : ");
        num1 = sc.nextFloat();
            System.out.println("Enter the second number : ");
            num2 =sc.nextFloat();
        }
        System.out.print("Sum of given two number = ");
        System.out.println(num1+num2);
    }
    
}
