package io.journal.dsa.tutorials.linkedlist;

public class SinglyLinkedListDemo {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(1);
        singlyLinkedList.append(2);
        singlyLinkedList.append(3);
        singlyLinkedList.append(4);
        System.out.println("--- PRINT LIST ---");
        singlyLinkedList.printList();
        System.out.println("------------------");

        int index = 2;
        int value = 10;
        System.out.println("The current value at index: " + index + " is : " + singlyLinkedList.get(index).value);
        System.out.println("Insert value: " + value + " at index: " + index);
        singlyLinkedList.insert(index, value);
        System.out.println("Then final value at index: " + index + " will be : " + singlyLinkedList.get(index).value);

        System.out.println("--- PRINT LIST ---");
        singlyLinkedList.printList();
        System.out.println("------------------");

    }
}
