/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execution;

/**
 *
 * @author ADMIN
 */
public class Stack {

    private Node top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. ");
        }
        top = top.next;
    }

    public void checkEmpty() {
        if (isEmpty()) {
            System.out.println("Stack is empty. ");
        } else {
            System.out.println("Stack is not empty. ");
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. ");
        }
        return top.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("==============================");
            System.out.println("Your stack is currently empty!");
            System.out.println("==============================");
            return;
        }

        System.out.println("|======= Top of Stack =========");
        Node c = top;
        while (c != null) {
            System.out.println("| " + c.data);
            c = c.next;
        }
        System.out.println("v====== Bottom of Stack =======");
    }

}
