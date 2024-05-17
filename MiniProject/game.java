import java.util.Scanner;

public class game{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("\n!!! INSTRUCTION  !!! \nYOU HAVE TO GUESS THE NUMBER FROM 1 - 100. \nFOR STOP THE GAME YOU HAVE TO PRESS -1.\nTO START THE GAME PRESS 1.\n");
        
        int response = sc.nextInt();
        play(response);
        
    }

    public static void play(int a){
        int ans= 0;
        System.out.println("$$$ WELCOME PLAYER $$$");
        Scanner sc = new Scanner(System.in) ;
           int mynumber = (int)(Math.random()*100);
           int usernumber =0;

           do{
               System.out.println("Guess my number : ");
                usernumber = sc.nextInt();

               if(mynumber == usernumber){
               System.out.println("\nWOOOOOOOHOOOOOOOOOO ....... CORRECT NUMBER !!!!!");
               System.out.println("\nSee you next time \n");
               ++ans;
               break;
               }

               else if (usernumber > mynumber)
               System.out.println("Number is too large ");

               else 
               System.out.println("Number is too small");
           }while ( usernumber >= 0);

           if (ans == 0){
           System.out.print("MY NUMBER WAS : ");
           System.out.println(mynumber); }
       
    } 
}
