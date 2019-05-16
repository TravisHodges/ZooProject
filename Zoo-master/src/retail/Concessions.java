package retail;

import money.Wallet;

import java.util.Scanner;

public class Concessions
{

    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int choice = 0;

        String[] concessions;
        concessions = new String[5];

        concessions[0] = "Item 1: $4 -- Pretzel" + " \n " ;
        concessions[1] = "Item 2: $2 -- Hot Dog" + " \n " ;
        concessions[2] = "Item 3: $1 -- Popcorn" + " \n " ;
        concessions[3] = "Item 4: $3 -- Pizza Slice" + " \n " ;
        concessions[4] = "Item 5: $1 -- Soda" + " \n " ;

        System.out.println("Menu: " + "\n " + concessions +" \n ");

        while (choice != 999)
       {
           System.out.println("What would you like to order? Enter the item number or 999 to quit. >>> ");
           choice = input.nextInt(concessions.length);

           if (choice == 1)
           {
               System.out.println(" You chose a pretzel. ");

           }
           else if (choice == 2)
           {
               System.out.println("You chose a Hot Dog. ");

           }
           else if (choice == 3)
           {
               System.out.println("You chose Popcorn. ");

           }
           else if (choice == 4)
           {
               System.out.println("You chose a Pizza Slice. ");

           }
           else if (choice == 5)
           {
               System.out.println("You chose Soda. ");

           }
           else if (( choice <= 0 ) || ( choice > 5))
           {
               System.out.println("Invalid Selection. ");
               
           }

       }
    }

}
