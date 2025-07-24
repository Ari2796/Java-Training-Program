package Graphs;

public class adjacencyMatrixUndirected {
	int v;
	int[][] arr;
	public adjacencyMatrixUndirected(int n) {
		this.v=n;
		this.arr=new int[n][n];
	}
	public void edges(int i,int j) {
		arr[i][j]=1;
		arr[j][i]=1;
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
		adjacencyMatrixUndirected a=new adjacencyMatrixUndirected(5);
		a.edges(2, 3);
		a.edges(2, 1);
		a.edges(2, 2);
		a.edges(2, 4);
		a.edges(2, 0);
		a.edges(0, 3);
		
		a.display();
		
	}
	
}
