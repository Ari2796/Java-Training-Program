package DSA.LinkedList;
import java.util.*;

class Node2 {
    int data;
    Node2 prev;
    Node2 next;

    public Node2(int x) {
        this.data = x;
        this.prev = this;
        this.next = this;
    }
}

public class Circular_LinkedList {
    Node2 head = null;

    public void insertbeg(int x) {
        Node2 newnode = new Node2(x);
        if (head == null) {
            head = newnode;
        } else {
            Node2 tail = head.prev;
            newnode.next = head;
            newnode.prev = tail;
            head.prev = newnode;
            tail.next = newnode;
            head = newnode;
        }
    }

    public void insertPosition(int p, int x) {
        if (p < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (head == null || p == 0) {
            insertbeg(x);
            return;
        }
        Node2 temp = head;
        int c = 0;
        while (c < p - 1 && temp.next != head) {
            temp = temp.next;
            c++;
        }
        if (c < p - 1) {
            System.out.println("Position out of range");
            return;
        }
        Node2 newnode = new Node2(x);
        newnode.next = temp.next;
        newnode.prev = temp;
        temp.next.prev = newnode;
        temp.next = newnode;
    }

    public void delete(int p) {
        if (head == null || p < 0) {
            System.out.println("Invalid position or empty list");
            return;
        }
        if (head.next == head && p == 0) {
            head = null;
            return;
        }
        if (p == 0) {
            Node2 tail = head.prev;
            head = head.next;
            head.prev = tail;
            tail.next = head;
            return;
        }
        Node2 temp = head;
        int c = 0;
        while (c < p && temp.next != head) {
            temp = temp.next;
            c++;
        }
        if (c < p) {
            System.out.println("Position out of range");
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node2 temp = head;
        System.out.print("List (forward): ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // ➕ Method: Sort the circular doubly linked list
    public void sort() {
        if (head == null || head.next == head) return;

        boolean swapped;
        do {
            swapped = false;
            Node2 curr = head;
            do {
                Node2 next = curr.next;
                if (next != head && curr.data > next.data) {
                    int t = curr.data;
                    curr.data = next.data;
                    next.data = t;
                    swapped = true;
                }
                curr = curr.next;
            } while (curr.next != head);
        } while (swapped);
    }

    // ➕ Method: Remove duplicates from a sorted list
    public void removeDuplicates() {
        if (head == null || head.next == head) return;

        Node2 curr = head;
        do {
            Node2 nextNode = curr.next;
            while (nextNode != head && curr.data == nextNode.data) {
                nextNode.prev.next = nextNode.next;
                nextNode.next.prev = nextNode.prev;
                if (nextNode == head) head = head.next;
                nextNode = nextNode.next;
            }
            curr = curr.next;
        } while (curr != head);
    }

    // ➕ Method: Print the middle of the list
    public void printMiddle() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node2 slow = head, fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element: " + slow.data);
    }

    // 🏁 Main Menu
    public static void main(String[] args) {
        Circular_LinkedList dll = new Circular_LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at position");
            System.out.println("3. Delete at position");
            System.out.println("4. Display list");
            System.out.println("5. Sort list");
            System.out.println("6. Remove duplicates");
            System.out.println("7. Print middle element");
            System.out.println("8. Exit");
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
                    dll.sort();
                    System.out.println("List sorted.");
                    break;
                case 6:
                    dll.removeDuplicates();
                    System.out.println("Duplicates removed.");
                    break;
                case 7:
                    dll.printMiddle();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 8);

        sc.close();
    }
}
