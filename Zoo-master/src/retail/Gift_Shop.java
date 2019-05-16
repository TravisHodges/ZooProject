package retail;

import java.util.Scanner;

public class Gift_Shop
{
    public static void Gift_Shop(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        String[] gifts;
        gifts = new String[10];

        gifts[0] = "Item 1: $5 -- Zebra keychain" + " \n ";
        gifts[1] = "Item 2: $0 -- Item Name" + " \n ";
        gifts[2] = "Item 3: $0 -- Item Name" + " \n ";
        gifts[3] = "Item 4: $0 -- Item Name" + " \n ";
        gifts[4] = "Item 5: $0 -- Item Name" + " \n ";
        gifts[5] = "Item 6: $0 -- Item Name" + " \n ";
        gifts[6] = "Item 7: $0 -- Item Name" + " \n ";
        gifts[7] = "Item 8: $0 -- Item Name" + " \n ";
        gifts[8] = "Item 9: $0 -- Item Name" + " \n ";
        gifts[9] = "Item 10: $0 -- Item Name" + " \n ";

        System.out.println("Available gifts: " + "\n " + gifts +" \n ");


        while (choice != 999)
        {
            if (choice == 1)
            {

            }
            if (choice == 2)
            {

            }
            if (choice == 3)
            {

            }
            if (choice == 4)
            {

            }
            if (choice == 5)
            {

            }
            if (choice == 6)
            {

            }
            if (choice == 7)
            {

            }
            if (choice == 8)
            {

            }
            if (choice == 9)
            {

            }
            if (choice == 10)
            {

            }
            else if (( choice <= 0 ) || ( choice > 10))
            {

            }
        }
    }
}
