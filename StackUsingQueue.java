import java.util.*;
public class StackUsingQueue {
	static Queue<Integer> x=new LinkedList<>();
	public void push(int v) {
		x.offer(v);
		for(int i=1;i<x.size();i++) {
			x.offer(x.poll());
		}
	}
	public int pop() {
		 if (x.isEmpty()) {
	            return -1;
	        }
	        return x.poll();
	}
	public int peek() {
        if (x.isEmpty()) {
            return -1;
        }
        return x.peek();
    }

    public boolean isEmpty() {
        return x.isEmpty();
    }
    public static void main(String[] args) {
    	StackUsingQueue sq=new StackUsingQueue();
    	sq.push(10);
    	sq.push(20);
    	sq.push(30);
    	sq.push(40);
    	sq.push(50);
    	System.out.println(x);
    	sq.pop();
    	System.out.println(x);
    	
    }
}
