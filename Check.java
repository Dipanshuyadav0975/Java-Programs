// WAP TO CHECK A NUMBER IS POSITIVE OR NOT

import java.util.Scanner;

public class Check
{
    public static void main (String...args)
    {
        System.out.println("GIVE THE NUMBER YOU WANT TO CHECK");
        try(Scanner sc =  new Scanner(System.in)){
            float number = sc.nextFloat();
            if(number<0)
            System.out.println("THE GIVEN NUMBER IS NEGATIVE.");
            else
            System.out.println("THE GIVEN NUMBER IS POSITIVE.");
        }
    }
}