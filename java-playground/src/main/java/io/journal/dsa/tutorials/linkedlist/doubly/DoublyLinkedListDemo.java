package io.journal.dsa.tutorials.linkedlist.doubly;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        System.out.println("########################");
        appendDemo();
        System.out.println("########################");
        removeLastDemo();
        System.out.println("########################");
        prependDemo();
        System.out.println("########################");
        removeFirst();
        System.out.println("########################");
        getAtIndexDemo();
        System.out.println("########################");
        setAtIndexDemo();
        System.out.println("########################");
        insertAtIndexDemo();
        System.out.println("########################");
        removeAtIndexDemo();
        System.out.println("########################");
        reverseDemo1();
        System.out.println("########################");
        reverseDemo2();
        System.out.println("########################");
        reverseDemo3();
    }

    private static void reverseDemo1() {
        System.out.println("(WIP)FIX IT");
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);

        System.out.println("DLL before reverse:");
        myDLL.printList();

        myDLL.head = myDLL.reverse1();

        System.out.println("\nDLL after reverse:");
        myDLL.printList();


        /*
       		EXPECTED OUTPUT:
        	----------------
            DLL before reverse:
            1
            2
            3
            4
            5

            DLL after reverse:
            5
            4
            3
            2
            1

     	*/
    }

    private static void reverseDemo2() {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);

        System.out.println("DLL before reverse:");
        myDLL.printList();

        myDLL.reverse2();

        System.out.println("\nDLL after reverse:");
        myDLL.printList();


        /*
       		EXPECTED OUTPUT:
        	----------------
            DLL before reverse:
            1
            2
            3
            4
            5

            DLL after reverse:
            5
            4
            3
            2
            1

     	*/
    }
    private static void reverseDemo3() {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);

        System.out.println("DLL before reverse:");
        myDLL.printList();

        myDLL.reverse3();

        System.out.println("\nDLL after reverse:");
        myDLL.printList();


        /*
       		EXPECTED OUTPUT:
        	----------------
            DLL before reverse:
            1
            2
            3
            4
            5

            DLL after reverse:
            5
            4
            3
            2
            1

     	*/
    }

    private static void prependDemo() {
        DoublyLinkedList prependList = new DoublyLinkedList(2);
        prependList.append(3);

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        prependList.printAll();

        prependList.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        prependList.printAll();


        /*
            EXPECTED OUTPUT:

            Before prepend():
            -----------------
            Head: 2
            Tail: 3
            Length: 2

            Doubly Linked List:
            2
            3


            After prepend():
            ----------------
            Head: 1
            Tail: 3
            Length: 3

            Doubly Linked List:
            1
            2
            3

        */
    }

    private static void removeLastDemo() {
        DoublyLinkedList removeLastLL = new DoublyLinkedList(1);
        removeLastLL.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(removeLastLL.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(removeLastLL.removeLast().value);
        // (0) Items - Returns null
        System.out.println(removeLastLL.removeLast());

    	/*
        	EXPECTED OUTPUT:
        	----------------
        	2
        	1
        	null

     	*/
    }

    private static void appendDemo() {
        DoublyLinkedList appendList = new DoublyLinkedList(1);
        appendList.append(2);

        appendList.printAll();

        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 2
        	Length: 2

        	Doubly Linked List:
        	1
        	2
     	*/
    }

    private static void removeFirst() {

        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myDLL.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myDLL.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myDLL.removeFirst());


        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null

        */
    }

    private static void getAtIndexDemo() {
        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);


        System.out.println(myDLL.get(3).value);


        /*
            EXPECTED OUTPUT:
            ----------------
            3

        */
    }

    private static void setAtIndexDemo() {
        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);

        System.out.println("DLL before set():");
        myDLL.printList();

        myDLL.set(2, 99);

        System.out.println("\nDLL after set():");
        myDLL.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            DLL before set():
            0
            1
            2
            3

            DLL after set():
            0
            1
            99
            3

        */
    }

    private static void insertAtIndexDemo() {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(3);

        System.out.println("DLL before insert():");
        myDLL.printList();

        myDLL.insert(1, 2);

        System.out.println("\nDLL after insert(2) in middle:");
        myDLL.printList();

        myDLL.insert(0, 0);

        System.out.println("\nDLL after insert(0) at beginning:");
        myDLL.printList();

        myDLL.insert(4, 4);

        System.out.println("\nDLL after insert(4) at end:");
        myDLL.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            DLL before insert():
            1
            3

            DLL after insert(2) in middle:
            1
            2
            3

            DLL after insert(0) at beginning:
            0
            1
            2
            3

            DLL after insert(4) at end:
            0
            1
            2
            3
            4

        */
    }

    private static void removeAtIndexDemo() {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);

        System.out.println("DLL before remove():");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(2).value);
        System.out.println("DLL after remove() in middle:");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(0).value);
        System.out.println("DLL after remove() of first node:");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(2).value);
        System.out.println("DLL after remove() of last node:");
        myDLL.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            DLL before remove():
            1
            2
            3
            4
            5

            Removed node:
            3
            DLL after remove() in middle:
            1
            2
            4
            5

            Removed node:
            1
            DLL after remove() of first node:
            2
            4
            5

            Removed node:
            5
            DLL after remove() of last node:
            2
            4

        */
    }


}
