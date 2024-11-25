package SinglyLinkedList.createInitialise;
import java.io.*;

public class LinkedList {
    Node head;

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
        // Create a new node with the given data
        Node new_node = new Node(data);

        // If the LinkedList is empty, make the new node the head
        if (list.head == null) { // Fixed comparison (changed '=' to '==')
            list.head = new_node;
        } else {
            // Else traverse to the last node and insert
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // Insert the new_node at the end
            last.next = new_node; // Added missing semicolon
        }

        return list;
    }

    // Method to print the LinkedList
    public static void printList(LinkedList list) {
        Node currNode = list.head;

        System.out.println("Linked List:");
        // Traverse through the LinkedList
        while (currNode != null) { // Fixed variable name case sensitivity
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println(); // Print a newline after the list
    }

    // Main method to test the LinkedList
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert data into the LinkedList
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 7);
        list = insert(list, 11);
        list = insert(list, 43);
        list = insert(list, 98);
        list = insert(list, 9);
        list = insert(list, 13);

        // Print the LinkedList
        printList(list);
    }
}



