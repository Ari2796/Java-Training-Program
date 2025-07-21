



package DoubleEndedQueue;
import java.util.*;
public class DEQ_Collection {
	public static void main(String[] args) {
		Deque <Integer> x=new LinkedList<>();
		x.addFirst(10);
		x.addFirst(20);
		x.addFirst(30);
		x.addFirst(40);
		x.addFirst(50);
		System.out.println(x);
		x.removeFirst();
		System.out.println(x);
		x.removeLast();
		System.out.println(x);
		System.out.println("peek first :"+x.peekFirst());
		System.out.println("peek last :"+x.peekLast());

	}
}
