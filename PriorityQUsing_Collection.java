import java.util.*;
public class PriorityQUsing_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PriorityQueue<Integer> pq=new PriorityQueue<>();
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		pq.add(30);
		pq.add(10);
		pq.add(50);
		pq.add(20);
		pq.add(60);
		pq.add(40);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		System.out.println("Peek --> "+pq.peek());
		
//		Object[] arr=pq.toArray();
//		for(Object i:arr) {
//			System.out.print(i+" ");
//		}
	}

}
