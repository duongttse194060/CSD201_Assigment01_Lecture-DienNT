/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.Scanner;
import execution.Stack;

/**
 *
 * @author ADMIN
 */
public class StackMenu {

    public void showStackMenu() {

        Stack myStack = new Stack();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("========= Stack Demostration =========");
            System.out.println("1. Push a number to the stack.");
            System.out.println("2. Pop a number from the stack.");
            System.out.println("3. Get the top element from the stack.");
            System.out.println("4. Check if stack is empty or not.");
            System.out.println("======================================");
            System.out.println("Your choice:");

            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
                continue;
            }
            boolean continueInput;

            switch (choice) {
                case 1:
                    System.out.println("You choose option 1: Push a number to the stack. ");
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
                        myStack.push(inputNum);
                        myStack.display();

                        while (true) {
                            System.out.print("Do you want to push another integer to the stack (Y/N)? ");
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
                    System.out.println("You choose option 2: Pop a number from the stack. ");
                    continueInput = true;
                    do {
                        myStack.pop();
                        myStack.display();
                        while (true) {
                            System.out.print("Do you want continue pop a node from the stack (Y/N)? ");
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

                case 3:
                    System.out.println("You choose option 3: Get the top element from the stack. ");
                    System.out.println("The top value of the stack is: " + myStack.peek());
                    break;
                    
                case 4:
                    System.out.println("You choose option 4: Check if the stack is empty or not. ");
                    myStack.checkEmpty();
                    break;

                default:
                    System.out.println("Invalid choice, program exited...");
                    return;
            }
        } while (true);
    }
}
