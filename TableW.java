//TABLE BY USING WHILE LOOP
import java.util.Scanner;
public class TableW {

    public static void main (String[]args)
    {
        System.out.println("WHICH TABLE YOU WANT TO KNOW ? ");
        int table;
        int toWhere;
        try(Scanner sc = new Scanner(System.in))
        {
            table = sc.nextInt();
            System.out.println("TO WHERE YOU WANT TO KNOW THE TABLE.");
            toWhere = sc.nextInt();
        }
                
        int i=1 ;
        while(i<=toWhere){
            System.out.printf("%d x %d = %d\n",table , i,table*i);
            i++;
        }
    }
}