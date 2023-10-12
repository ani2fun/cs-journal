package io.journal.dsa.problems.recursion;

public class ALinkedList {

    // Linked List Node
    static class Node {
        int value;
        Node next;
    }

    public static void reverse(Node head) {

        // Base case
        if (head == null) {
            return;
        }

        // Recursive case
        else {
            reverse(head.next);
            System.out.print(head.value + " ");
        }
    }

    static Node insertAtHead(Node tempHead, int newValue) {
        Node newNode = new Node();
        newNode.value = newValue;
        newNode.next = tempHead;
        tempHead = newNode;

        return tempHead;
    }

    public static void main(String args[]) {
        // Empty Linked List
        Node head = null;

        // Linked List = 1->2->3->4->5
        head = insertAtHead(head, 5);
        head = insertAtHead(head, 4);
        head = insertAtHead(head, 3);
        head = insertAtHead(head, 2);
        head = insertAtHead(head, 1);

        // Print the original Linked List
        System.out.println("Linked List: ");
        for (Node i = head; i != null; i = i.next) {
            System.out.print(i.value + " ");
        }

        // Print the reversed Linked List
        System.out.println(" ");
        System.out.println("Reversed Linked List: ");
        reverse(head);
    }
}

