class ArrayQueue {
    private int front, rear, size, cap;
    private int[] queue;

    public ArrayQueue(int capacity) {
        front = 0;
        rear = -1;
        size = 0;
        cap = capacity;
        queue = new int[capacity];
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        rear = (rear + 1) % cap;
        queue[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int v = queue[front];
        front = (front + 1) % cap;
        size--;
        return v;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % cap] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return size == cap;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
public class CircularQ {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display(); // 10 20 30 40 50

        q.dequeue(); // remove 10
        q.dequeue(); // remove 20
        q.display(); // 30 40 50

        q.enqueue(60);
        q.enqueue(70);
        q.display(); // 30 40 50 60 70

        System.out.println("Front element is: " + q.peek()); // 30
    }
}