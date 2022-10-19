package api;

import java.util.Scanner;

import static java.lang.System.in;

public class MainMenu {
    public static void main(String[] args) {
        try Scanner scan = new Scanner(in); {

            System.out.println("1. Find and reserve a room");
            System.out.println("2. See my reservations");
            System.out.println("3. Create a account");
            System.out.println("4. Admin");
            System.out.println("5. Exit");
            int selection = Integer.parseInt(scan.nextLine());


            if (selection == 1) {
                String room = scan.nextLine();
                System.out.println("1. Find and reserve a room " + room);
            } else if (selection == 2) {
                String reservations = scan.nextLine();
                System.out.println("2. See my reservations " + reservations);
            } else if (selection == 3) {
                String account = scan.nextLine();
                System.out.println("3. Create a account " + account);
            } else if (selection == 4) {
                String open_admin = scan.nextLine();
                System.out.println("4. Admin " + open_admin);
            } else if (selection == 5) {
                String close = scan.nextLine();
                System.out.println("5. Exit " + close);
            } else {
                System.out.println("Wrong option entered, please enter another option");
            }
        } catch (Exception ex) {
            System.out.println("\nError - Invalid Input\n");
        }

    }
}



