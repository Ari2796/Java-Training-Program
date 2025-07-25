package Graphs;
import java.util.*;
public class BFS {
	int v;
	int[][] arr;
	public BFS(int n) {
		this.v=n;
		this.arr=new int[n][n];
	}
	public void edges(int i,int j) {
		arr[i][j]=1;
		arr[j][i]=1;
	}
	public void bfs(int first) {
		Queue<Integer> x = new LinkedList<>();
		boolean visited[] = new boolean[v];
		x.add(first);
		visited[first]=true;
		System.out.print("BFS ->");
		while(!x.isEmpty()) {
			int vertex = x.poll();
			System.out.print(vertex+" ");
			for(int j=0;j<v;j++) {
				if(arr[vertex][j]==1 && !visited[j]) {
					x.add(j);
					visited[j]=true;
				}
			}
		}
		System.out.println();
	}
	public void display() {
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args) {
		BFS a=new BFS(5);
		a.edges(2, 3);
		a.edges(2, 1);
		a.edges(2, 2);
		a.edges(2, 4);
		a.edges(2, 0);
		a.edges(0, 3);
		
		a.display();
		a.bfs(0);
		
	}
}
