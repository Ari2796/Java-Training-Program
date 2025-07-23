public class StackUsingArray {
	private int top;
	private int a[];
	private int size;
	public StackUsingArray(int x) {
		this.size=x;
		this.a=new int[x];
		this.top=-1;
		
	}
	public void push(int val) {
		if(isfull()) {
			System.out.println("Overflow");
			return;
		}
		a[++top]=val;

	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return -1;
		}
		
		return a[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return -1;
		}
		return a[top];
	}
	public boolean isfull() {
		return top==size-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int size=5;
		StackUsingArray a=new StackUsingArray(size);
		a.push(10);
		a.push(20);
		a.push(30);
		a.push(40);
		System.out.println();
		a.pop();
		a.display();
		//a.peek();
		
	}
	
}
