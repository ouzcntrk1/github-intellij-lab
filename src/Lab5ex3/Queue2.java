package Lab5ex3;


//Şefik Oğuzhan Cantürk
//240446032
//16.11.2026


public class Queue2 {

    private char[] items;
    private int front;
    private int rear;
    private int count;

    public Queue2(int capacity) {
        items = new char[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(char value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % items.length;
        items[rear] = value;
        count++;
    }

    public char dequeue() {
        if (isEmpty()) {
            return '\0';
        }
        char removedValue = items[front];
        front = (front + 1) % items.length;
        count--;
        return removedValue;
    }

    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public int size() {
        return count;
    }
}