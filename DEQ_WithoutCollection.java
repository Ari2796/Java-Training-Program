package DoubleEndedQueue;

class Node {
    int[] a;
    int size;

    public Node(int size) {
        this.size = size;
        a = new int[size];
    }
}

public class DEQ_WithoutCollection {
    Node node;
    int front, rear;

    public DEQ_WithoutCollection(int size) {
        node = new Node(size);
        front = -1;
        rear = 0;
    }

    public void insertFront(int value) {
        if ((front == 0 && rear == node.size - 1) || (front == rear + 1)) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = node.size - 1;
        } else {
            front--;
        }

        node.a[front] = value;
    }

    public void insertRear(int value) {
        if ((front == 0 && rear == node.size - 1) || (front == rear + 1)) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == node.size - 1) {
            rear = 0;
        } else {
            rear++;
        }

        node.a[rear] = value;
    }

    public void deleteFront() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Deleted from front: " + node.a[front]);

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == node.size - 1) {
            front = 0;
        } else {
            front++;
        }
    }

    public void deleteRear() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Deleted from rear: " + node.a[rear]);

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = node.size - 1;
        } else {
            rear--;
        }
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Deque elements: ");
        int i = front;
        while (true) {
            System.out.print(node.a[i] + " ");
            if (i == rear) break;
            i = (i + 1) % node.size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DEQ_WithoutCollection dq = new DEQ_WithoutCollection(5);

        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertFront(2);
        dq.display();

        dq.deleteRear();
        dq.display(); 

        dq.deleteFront();
        dq.display(); 
    }
}
