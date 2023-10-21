// FIND THE LARGEST AMONG THE THREE NUMBERS
import java.util.Scanner;

public class LargestNumber 
{
    public static void main(String...args)
    {
        int num1,num2,num3;
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("ENTER THE FIRST NUMBER ");
            num1 =sc.nextInt();
            System.out.println("ENTER THE SECOND NUMBER ");
            num2 = sc.nextInt();
            System.out.println("ENTER THE THIRD NUMBER ");
            num3 = sc.nextInt();
        }
        int res = (num1>num2 && num1>num3)? num1: (num2>num3? num2:num3);
        System.out.printf("The largest number is %d",res);
       
    }
}
