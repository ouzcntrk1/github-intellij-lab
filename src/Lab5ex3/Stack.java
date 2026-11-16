package Lab5ex3;


//Şefik Oğuzhan Cantürk
//240446032
//16.11.2026


public class Stack {

    private char[] items;
    private int top;

    public Stack(int capacity) {
        items = new char[capacity];
        top = -1;
    }

    public void push(char value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        top++;
        items[top] = value;
    }

    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char removedValue = items[top];
        top--;
        return removedValue;
    }

    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return items[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == items.length - 1;
    }
}