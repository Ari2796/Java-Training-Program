package Graphs;
import java.util.*;
public class adjacencyListUndirected {
	int v;
	List<List<Integer>> a=new ArrayList<>();
	public adjacencyListUndirected(int n) {
		this.v=n;
		
		for(int i=0;i<n;i++) {
			a.add(new ArrayList<>());
		}
	}
	public void edges(int i,int j) {
		if(!a.get(i).contains(j)) a.get(i).add(j);
		if(!a.get(j).contains(i))a.get(j).add(i);
	}
	public void display() {
		for(int i=0;i<v;i++) {
			System.out.print(i+"-->");
			for(int j:a.get(i)) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args) {
		adjacencyListUndirected a=new adjacencyListUndirected(5);
		a.edges(2, 3);
		a.edges(2, 1);
		a.edges(2, 2);
		a.edges(2, 4);
		a.edges(2, 0);
		a.edges(0, 3);
		
		a.display();
		
	}
}
