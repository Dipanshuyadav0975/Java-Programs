// TABLE BY USING FOR LOOP
import java.util.Scanner;

public class TableF
{
    public static void main (String[]args)
    {
        System.out.println("WHICH TABLE YOU WANT TO KNOW ? ");
        int table , toWhere;
        try(Scanner sc = new Scanner(System.in))
        {
            table = sc.nextInt();
            System.out.println("TO WHERE YOU WANT TO KNOW THE TABLE.");
            toWhere = sc.nextInt();
        }
                
        for (int i=1 ;i<=toWhere;i++)
            System.out.printf("%d x %d = %d\n",table , i,table*i);
        
    }
}