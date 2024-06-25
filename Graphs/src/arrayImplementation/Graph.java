package arrayImplementation;

import java.util.Scanner;
import java.util.Stack;

public class Graph {
	private char[] vertices;		//character array to store vertices of graph
	private int noOfVertices;		//variable to store number of vertices on graph
	private int[][] adjMatrix;		//adjacent matrix to store connectivity of graph
	
	public Graph(int noOfVertices) {
		this.vertices = new char[noOfVertices];
		this.noOfVertices = noOfVertices;
		this.adjMatrix = new int[noOfVertices][noOfVertices];
	}
	
	//to insert vertices and edges
	public void insert() {	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter vertices : ");
		for(int i=0;i<vertices.length;i++) {
			vertices[i]=(char)(65+i);			//to assign values on its own
			//vertices[i]=sc.nextLine().charAt(0);//to take input from user
		}
		
		System.out.println("Enter edges : ");
		for(int i=0;i<noOfVertices;i++) {
			for(int j=0;j<noOfVertices;j++) {
				adjMatrix[i][j]=sc.nextInt();
				//System.out.println("Edge "+vertices[i]+" "+adjMatrix[i][j]);
			}
		}
		
		sc.close();
	}
	
	//to display graph
	public void display() {
		System.out.println("Adjacancy Matrix");
		for(int i=0;i<noOfVertices;i++) {
			System.out.print(vertices[i]+" ");
			
			for(int j=0;j<noOfVertices;j++) {				
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	//DFS traversal
	public void dfsTraversal(int v) {	//v is the index of vertex with which we start iterating
		int[] visited=new int[noOfVertices];
		Stack<Integer> stack=new Stack<>();
		
//		System.out.println(no);
		
	}

}
