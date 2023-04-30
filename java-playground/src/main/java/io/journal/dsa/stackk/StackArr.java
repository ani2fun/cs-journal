package io.journal.dsa.stackk;

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

    void push(T data) {
        if (top == size - 1)
            System.out.println("StackArray-Overflow!");
        else {
            top++;
            A.add(data); // Creating new element
        }
    }

    T top() {
        // If stack is empty
        if (top == -1) {
            System.out.println("StackArray Underflow");
            return null;
        } else
            return A.get(top);
    }

    T pop() {
        T data = null;
        if (top == -1)
            System.out.println("StackArray Underflow");
        else {
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
