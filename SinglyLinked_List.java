

class Node{
	int data;
	Node next;
	public Node(int x) {
		this.data=x;
		this.next=null;
	}
}
public class SinglyLinked_List {
    Node head;

    public void insertBegin(int x) {
        Node newnode = new Node(x);
        newnode.next = head;
        head = newnode;
    }

    public void insertPosition(int p, int x) {
        if (p < 0) {
            System.out.println("Invalid");
            return;
        }

        Node newnode = new Node(x);
        if (p == 0) {
            newnode.next = head;
            head = newnode;
            return;
        }

        int c = 0;
        Node t = head;

        while (t != null && c < p - 1) {
            t = t.next;
            c++;
        }

        if (t == null) {
            System.out.println("Position out of range");
            return;
        }

        newnode.next = t.next;
        t.next = newnode;
    }

    public void deleteContains(int x) {
        if (head == null)
            return;

        if (head.data == x) {
            head = head.next;
            return;
        }

        Node t = head;

        while (t.next != null && t.next.data != x) {
            t = t.next;
        }

        if (t.next == null)
            return;

        t.next = t.next.next;
    }

    public void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    

    public static void main(String[] args) {
    	SinglyLinked_List obj = new SinglyLinked_List();
        System.out.println("1.Insert At Begin");
        obj.insertBegin(30);
        obj.insertBegin(20);
        obj.insertBegin(10);
        obj.display();
        obj.insertPosition(1, 15);
        obj.display();

        obj.deleteContains(20);
        obj.display();
    }
}