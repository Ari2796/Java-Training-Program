package DSA.LinkedList;
import java.util.*;

class Node1 {
    int data;
    Node1 prev;
    Node1 next;

    public Node1(int x) {
        this.data = x;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinked_List {
    Node1 head;

    public void insertbeg(int x) {
        Node1 newnode = new Node1(x);
        newnode.next = head;

        if (head != null)
            head.prev = newnode;

        head = newnode;
    }

    public void insertPosition(int p, int x) {
        if (p < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (p == 0) {
            insertbeg(x);
            return;
        }

        Node1 temp = head;
        int c = 0;
        while (temp != null && c < p - 1) {
            temp = temp.next;
            c++;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        Node1 newnode = new Node1(x);
        newnode.next = temp.next;
        newnode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newnode;

        temp.next = newnode;
    }

    public void delete(int p) {
        if (p < 0 || head == null) {
            System.out.println("Invalid position or empty list");
            return;
        }

        if (p == 0) {
            Node1 temp = head;
            head = head.next;
            if (head != null)
                head.prev = null;
            temp.next = null;
            return;
        }

        Node1 temp = head;
        int c = 0;
        while (temp != null && c < p) {
            temp = temp.next;
            c++;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        if (temp.prev != null)
            temp.prev.next = temp.next;
        if (temp.next != null)
            temp.next.prev = temp.prev;

        temp.prev = null;
        temp.next = null;
    }

    public void displayForward() {
        Node1 temp = head;
        System.out.print("List (forward): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinked_List dll = new DoublyLinked_List();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at position");
            System.out.println("3. Delete at position");
            System.out.println("4. Display list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            int data, pos;

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at beginning: ");
                    data = sc.nextInt();
                    dll.insertbeg(data);
                    break;

                case 2:
                    System.out.print("Enter position to insert: ");
                    pos = sc.nextInt();
                    System.out.print("Enter value: ");
                    data = sc.nextInt();
                    dll.insertPosition(pos, data);
                    break;

                case 3:
                    System.out.print("Enter position to delete: ");
                    pos = sc.nextInt();
                    dll.delete(pos);
                    break;

                case 4:
                    dll.displayForward();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
