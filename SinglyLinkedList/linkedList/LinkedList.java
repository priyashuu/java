import java.io.*;

public class LinkedList {
    Node head; // Head of the list

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);

        // If the LinkedList is empty, make the new node the head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse to the last node and insert
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // Insert the new_node at the end
            last.next = new_node;
        }
        return list; // Added missing semicolon
    }

    // Method to print the LinkedList
    public static void printList(LinkedList list) {
        Node currNode = list.head;

        System.out.println("Linked list:");
        // Traverse through the LinkedList
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println(); // Newline for better readability
    }

    // Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements into the LinkedList
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);

        // Print the LinkedList
        printList(list);
    }
}
