/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.Scanner;
import execution.LinkList;

/**
 *
 * @author ADMIN
 */
public class LinkListMenu {

    public void showListMenu() {
        LinkList myList = new LinkList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=================== Linked List Demonstration ===================");
            System.out.println("Choose an option to do with the link list:");
            System.out.println("1. Insert a number at the beginning.");
            System.out.println("2. Insert a number at the end.");
            System.out.println("3. Insert a number at the input position.");
            System.out.println("4. Insert a number at the sorted list.");
            System.out.println("5. Delete the number at the beginning.");
            System.out.println("6. Delete the number at the end.");
            System.out.println("7. Delete the number at the input position.");
            System.out.println("8. Delete the number at the input position from the sorted list.");
            System.out.println("Other. Back to main menu....");
            System.out.println("=================================================================");
            System.out.print("Your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
                continue;
            }
            boolean continueInput;

            switch (choice) {
                case 1:
                    System.out.println("You choose option 1: Insert a number at the beginning:");
                    continueInput = true;
                    while (continueInput) {
                        int inputNum = 0;
                        while (true) {
                            System.out.print("Enter an integer number: ");
                            String input = sc.nextLine();
                            try {
                                inputNum = Integer.parseInt(input);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Must be an integer.");
                            }
                        }
                        myList.addFirst(inputNum);
                        myList.display();

                        while (true) {
                            System.out.print("Do you want to add another integer number at the beginning (Y/N)? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("n")) {
                                continueInput = false;
                                break;
                            } else if (answer.equalsIgnoreCase("y")) {
                                break;
                            } else {
                                System.out.println("Invalid input, please try again.");
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println("You choose option 2: Insert a number at the end:");
                    continueInput = true;
                    while (continueInput) {
                        int inputNum = 0;
                        while (true) {
                            System.out.print("Enter an integer number: ");
                            String input = sc.nextLine();
                            try {
                                inputNum = Integer.parseInt(input);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Must be an integer.");
                            }
                        }
                        myList.addLast(inputNum);
                        myList.display();

                        while (true) {
                            System.out.print("Do you want to add another integer number at the end (Y/N)? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("n")) {
                                continueInput = false;
                                break;
                            } else if (answer.equalsIgnoreCase("y")) {
                                break;
                            } else {
                                System.out.println("Invalid input, please try again.");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("You choose option 3: Insert a number at the input position:");
                    continueInput = true;
                    while (continueInput) {
                        int inputNum = 0;
                        int position = 0;

                        while (true) {
                            System.out.print("Enter an integer number: ");
                            String input = sc.nextLine();
                            try {
                                inputNum = Integer.parseInt(input);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Must be an integer.");
                            }
                        }
                        while (true) {
                            System.out.print("Enter the position you wish to add the node: ");
                            String input = sc.nextLine();
                            try {
                                position = Integer.parseInt(input);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Must be an integer.");
                            }
                        }
                        myList.addAtPosition(inputNum, position);
                        myList.display();

                        while (true) {
                            System.out.print("Do you want to add another integer number at the position (Y/N)? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("n")) {
                                continueInput = false;
                                break;
                            } else if (answer.equalsIgnoreCase("y")) {
                                break;
                            } else {
                                System.out.println("Invalid input, please try again.");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("You choose number 4: Add a number to a sorted list: ");
                    continueInput = true;
                    while (continueInput) {
                        int inputNum = 0;
                        while (true) {
                            System.out.println("Enter a integer number to add to the sorted list");
                            String input = sc.nextLine();
                            try {
                                inputNum = Integer.parseInt(input);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Must be an integer.");
                            }
                        }
                        myList.sortList();
                        myList.addIntoSortList(inputNum);
                        myList.display();

                        while (true) {
                            System.out.print("Do you want to add another integer number at the position (Y/N)? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("n")) {
                                continueInput = false;
                                break;
                            } else if (answer.equalsIgnoreCase("y")) {
                                break;
                            } else {
                                System.out.println("Invalid input, please try again.");
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("You choose option 5: Delete the first node of the list");
                    continueInput = true;
                    do {
                        myList.deleteFirst();
                        myList.display();

                        while (true) {
                            System.out.print("Do you want continue delete the first node (Y/N)? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("n")) {
                                continueInput = false;
                                break;
                            } else if (answer.equalsIgnoreCase("y")) {
                                break;
                            } else {
                                System.out.println("Invalid input, please try again.");
                            }
                        }
                    } while (continueInput);
                    break;

                case 6:
                    System.out.println("You choose option 6: Delete the last node of the list");
                    continueInput = true;
                    do {
                        myList.deleteLast();
                        myList.display();

                        while (true) {
                            System.out.print("Do you want continue delete the last node (Y/N)? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("n")) {
                                continueInput = false;
                                break;
                            } else if (answer.equalsIgnoreCase("y")) {
                                break;
                            } else {
                                System.out.println("Invalid input, please try again.");
                            }
                        }
                    } while (continueInput);
                    break;

                case 7:
                    System.out.println("You choose option 7: Delete the node at the input position:");
                    continueInput = true;
                    while (continueInput) {
                        int position = 0;

                        while (true) {
                            System.out.print("Enter the position you wish to delete the node: ");
                            String input = sc.nextLine();
                            try {
                                position = Integer.parseInt(input);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Must be an integer.");
                            }
                        }
                        myList.deleteAtPostion(position);
                        myList.display();

                        while (true) {
                            System.out.print("Do you want to delete another node at the position (Y/N)? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("n")) {
                                continueInput = false;
                                break;
                            } else if (answer.equalsIgnoreCase("y")) {
                                break;
                            } else {
                                System.out.println("Invalid input, please try again.");
                            }
                        }
                    }
                    break;

                case 8:
                    System.out.println("You choose option 8: Delete the node at the input position in the sorted list:");
                    continueInput = true;
                    while (continueInput) {
                        int position = 0;

                        while (true) {
                            System.out.print("Enter the position you wish to delete the node: ");
                            String input = sc.nextLine();
                            try {
                                position = Integer.parseInt(input);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input. Must be an integer.");
                            }
                        }
                        myList.sortList();
                        myList.deleteAtPostion(position);                       
                        System.out.println("The list after deleted and sorted: ");
                        myList.display();

                        while (true) {
                            System.out.print("Do you want to delete another node at the position in the sorted list (Y/N)? ");
                            String answer = sc.nextLine();
                            if (answer.equalsIgnoreCase("n")) {
                                continueInput = false;
                                break;
                            } else if (answer.equalsIgnoreCase("y")) {
                                break;
                            } else {
                                System.out.println("Invalid input, please try again.");
                            }
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice, program exited...");
                    return;
            }
        } while (true);
    }

}
