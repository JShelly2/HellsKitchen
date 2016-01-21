package p1;

import java.util.Scanner;
/*
Joshua Shelly
700622764
Demo menue 0.1
1/21/16
CSC164-402
 */
public class Main {
    public static void main(String[] Jagger) {
        Scanner input = new Scanner(System.in);
        char option;
        System.out.println("Welcome to Hell's Kitchen");
        do{
            System.out.println("(H)am \n(B)eef \n(S)alami \n(T)una \n(D)one");
            String choice = input.next();
            choice = choice.toUpperCase();
            option = choice.charAt(0);
            System.out.println("Choice is " + choice + " and option is " + option);
        } while (option != 'D');
        System.out.println("Thanks for ordering \n Prick.");
        // write your code here
    }
}
