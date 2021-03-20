package ElectricityBillingSystem;

import java.util.Scanner;

public class Menu extends ElectricityBillingSystem{
    int count;

    static Scanner sc = new Scanner(System.in);

    public void showMainMenu() {
        System.out.println("\nWelcome to Electricity Billing System");
        System.out.println("~~~~~~~~~~Main Menu~~~~~~~~~~");
        System.out.println("1. Add Data");
        System.out.println("2. Display All Records");
        System.out.println("3. Exit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void processChoice(){
        int choice=-1;

        while(choice!=3) {
            showMainMenu();
            System.out.print("Please enter your choice: ");
            choice = sc.nextInt();

            while(choice<=0||choice>3) {
                System.out.println("Invalid selection");
                System.out.print("Please enter your choice: ");
                choice = sc.nextInt();
            }

            if (choice == 1) {
                RunningProgram runningProgram = new RunningProgram();
                count = runningProgram.addItem(count);
            }

            else if (choice == 2) {
                RunningProgram runningProgram = new RunningProgram();
                runningProgram.displayData(count);
            }
        }
        System.out.println("Thank You and Bye.");
        System.exit(0);
    }
}
