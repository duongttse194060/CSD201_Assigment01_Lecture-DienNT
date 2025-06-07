/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execution;

/**
 *
 * @author ADMIN
 */
public class LinkList {

    private Node head;

    public LinkList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node c = head;
        while (c.next != null) {
            c = c.next;
        }
        c.next = newNode;
    }

    public void addAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        if (position < 0) {
            System.out.println("Invalid position! ");
            return;
        }
        int index = 0;
        Node c = head;
        while (c != null && index < position - 1) {
            c = c.next;
            index++;
        }
        if (c == null) {
            System.out.println("Position out of bound !");
            return;
        }
        newNode.next = c.next;
        c.next = newNode;
    }

    public void sortList() {
        Node i = head;
        while (i != null) {
            Node min = i;
            Node j = i.next;
            while (j != null) {
                if (j.data < min.data) {
                    min = j;
                }
                j = j.next;
            }
            int temp = i.data;
            i.data = min.data;
            min.data = temp;
            i = i.next;
        }
    }

    public void addIntoSortList(int data) {
        Node newNode = new Node(data);
        if (isEmpty() || data <= head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node c = head;
        while (c.next != null && c.next.data <= data) {
            c = c.next;
        }
        newNode.next = c.next;
        c.next = newNode;
    }

    public int deleteFirst() {
        if (isEmpty()) {
            throw new RuntimeException("List is currently empty. There nothing to remove. ");
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public int deleteLast() {
        if (isEmpty()) {
            throw new RuntimeException("List is currently empty. There nothing to remove. ");
        }
        if (head.next == null) {
            int data = head.data;
            head = null;
            return data;
        }
        Node c = head;
        while (c.next.next != null) {
            c = c.next;
        }
        int data = c.next.data;
        c.next = null;
        return data;
    }

    public int deleteAtPostion(int position) {
        if (isEmpty()) {
            throw new RuntimeException("List is currently empty. There nothing to remove. ");
        }
        if (position == 0) {
            int data = head.data;
            head = head.next;
            return data;
        }
        if (position < 0) {
            System.out.println("Invalid position! ");
            return 0;
        }
        Node c = head;
        int index = 0;
        while (c != null && index < position - 1) {
            c = c.next;
            index++;
        }
        if (c == null || c.next == null) {
            System.out.println("Position is out of bound!");
            return 0;
        }
        int data = c.next.data;
        c.next = c.next.next;
        return data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("===================================");
            System.out.println("Your linked list is currently empty!");
            System.out.println("===================================");
            return;
        }

        System.out.println("Your linked list currently contains:");
        Node c = head;
        while (c != null) {
            System.out.print("[" + c.data + "] -> ");
            c = c.next;
        }
        System.out.println("null");
    }

}
