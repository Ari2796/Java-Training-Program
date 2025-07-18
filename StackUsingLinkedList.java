class stack{
	class Node{
		Node next;
		int data;
		public Node(int x) {
			this.data=x;
			this.next=null;
		}
	}
		Node top=null;
		public void push(int x) {
			Node newnode=new Node(x);
			newnode.next=top;
			top=newnode;
		}
		public int pop() {
			if(isEmpty()) {
				return -1;
			}
			int a=top.data;
			top=top.next;
			return a;
		}
		public int peek() {
			if(isEmpty()) {
				return -1;
			}
			return top.data;
		}
		public boolean isEmpty() {
			if(top==null) return true;
			return false;
		}
		public void display() {
			Node temp=top;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	

	
}
public class StackUsingLinkedList {
	public static void main(String[] args) {
	stack a=new stack();
	a.push(10);
	a.push(20);
	a.push(30);
	a.push(40);
	a.push(50);
	a.display();
	a.pop();
	a.display();
	System.out.println(a.peek());
	}
}