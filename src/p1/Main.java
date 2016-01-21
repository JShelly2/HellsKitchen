package p1;

import java.util.Scanner;

/*
Joshua Shelly
700622764
Demo menue 0.8
1/21/16
CSC164-402
 */
public class Main {
    public static void main(String[] Jagger) {
        Scanner input = new Scanner(System.in);
        String sandwich = null;
        char option;
        double price = 0, total = 0;
        System.out.println("Welcome to Table Flip Inc. \n What is your order?");
        do {
            System.out.println("(H)am [$5.50] \n(B)eef [$6.50] \n(S)alami [$4.75] \n(T)una [$5.00] \n(D)one [Complete Transaction] \nPlease print your choice:");
            option = input.next().toUpperCase().charAt(0);
            switch (option) {
                case 'H':
                    price = 5.50;
                    sandwich = "Ham";
                    break;
                case 'B':
                    price = 6.50;
                    sandwich = "Beef";
                    break;
                case 'S':
                    price = 4.75;
                    sandwich = "Salami";
                    break;
                case 'T':
                    price = 5.00;
                    sandwich = "Tuna";
                    break;
                default:
                    price = 0.00;
                    System.out.println("OPTION ISN'T ON THE LIST (ノಠ益ಠ)ノ彡┻━┻ ");
                case 'D':
                    break;
            }
            total += price;
            if (price != 0)
                System.out.println("Current Price is " + total + " USD with the latest addition of the " + sandwich + " sandwich");
        } while (option != 'D');
        System.out.println("Total Price is " + total + " USD\n");
        System.out.println("Thanks for ordering (┛◉Д◉)┛彡┻━┻ \n Prick.");
        // write your code here
    }
}
