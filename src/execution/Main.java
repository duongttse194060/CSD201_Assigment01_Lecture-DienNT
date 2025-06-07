/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execution;

import java.util.Scanner;
import menu.LinkListMenu;
import menu.StackMenu;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("=========== Assigment 01 =========");
            System.out.println("Choose an option: ");
            System.out.println("1. Linked List Demostration: ");
            System.out.println("2. Stack Demostration: ");
            System.out.println("==================================");
            System.out.println("Your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
                continue;
            }
            switch (choice) {
                case 1:
                    LinkListMenu myList = new LinkListMenu();
                    myList.showListMenu();
                    break;
                    
                case 2:
                    StackMenu myStack = new StackMenu();
                    myStack.showStackMenu();
                    break;
                    
                default:
                    System.out.println("Invalid choice, program exited. ");
                    return;

            }
        } while (true);
    }
}
