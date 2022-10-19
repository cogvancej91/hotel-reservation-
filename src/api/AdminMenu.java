package api;

import java.util.Scanner;
public class AdminMenu {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        System.out.println(1. +"See all Customers" +args[0]);
        System.out.println(2. +"See all Rooms" +args[1]);
        System.out.println(3. +"See all Reservations" +args[2]);
        System.out.println(4. +"Add a Room" +args[3]);
        System.out.println(5. +"Back to Main Menu" +args[4]);

    }
}
