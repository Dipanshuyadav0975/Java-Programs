//Sum of "n" natural numbers
import java.util.Scanner;

public class NaturalSum
{
    public static void main (String[]args)
    {
        System.out.println("TILL WHERE YOU WANT TO SUM  ? ");
        int sum;
        try(Scanner sc = new Scanner(System.in))
        {
            sum = sc.nextInt();
        }
            System.out.printf("THE SUM OF THE GIVEN NUMBER IS %d . ",sum=(sum+1)*sum/2);
        
    }
}