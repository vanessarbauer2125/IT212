package waitinglist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WaitingListManager manager = new WaitingListManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Waiting List Manager ---");
            System.out.println("1. Add person");
            System.out.println("2. Serve person");
            System.out.println("3. Check if person is in list");
            System.out.println("4. Show waiting list size");
            System.out.println("5. Display waiting list");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter name to add: ");
                    manager.addPerson(scanner.nextLine());
                    break;
                case 2:
                    System.out.println(manager.servePerson());
                    break;
                case 3:
                    System.out.print("Enter name to check: ");
                    String name = scanner.nextLine();
                    System.out.println(manager.isPersonInList(name)
                            ? name + " is in the waiting list."
                            : name + " is NOT in the waiting list.");
                    break;
                case 4:
                    System.out.println("Waiting list size: " + manager.waitingListSize());
                    break;
                case 5:
                    manager.displayWaitingList();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
