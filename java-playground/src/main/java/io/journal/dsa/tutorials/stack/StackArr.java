package io.journal.dsa.tutorials.stack;

import java.io.Serializable;
import java.util.ArrayList;

// using arraylist
public class StackArr<T> {
    int size;
    int top = -1; // pointer for the top element
    ArrayList<T> A;

    // Constructor of this class
    // To initialize stack
    StackArr(int size) {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }

    public StackArr(int size, ArrayList<T> a) {
        this.size = size;
        A = a;
    }

    void push(T data) throws StackOverflow {
        if (top == size - 1) {
            System.out.println("StackArray-Overflow!");
            throw new StackOverflow();
        } else {
            top++;
            A.add(data); // Creating new element
        }
    }

    T top() throws StackUnderflow {
        // If stack is empty
        if (top == -1) {
            System.out.println("StackArray Underflow");
            throw new StackUnderflow();
        } else
            return A.get(top);
    }

    T pop() throws StackUnderflow {
        T data = null;
        if (top == -1) {
            System.out.println("StackArray Underflow");
            throw new StackUnderflow();
        } else {
            data = A.get(top);
            top--;
        }
        return data;
    }

    boolean empty() {
        return top == -1;
    }

    // GETTER & SETTERS

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}


class StackUnderflow extends Exception implements Serializable {
    private static final long serialVersionUID = 10002L;
    public String toString() {
        return "Stack is Empty!";
    }
}

class StackOverflow extends Exception implements Serializable {
    private static final long serialVersionUID = 10001L;
    public String toString() {
        return "Stack is Full!";
    }
}