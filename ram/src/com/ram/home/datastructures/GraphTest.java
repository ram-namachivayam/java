package com.ram.home.datastructures;

public class GraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph theGraph =  new Graph();
		
		theGraph.addVertex('A'); // 0 (start for dfs)
		theGraph.addVertex('B'); // 1
		theGraph.addVertex('C'); // 2
		theGraph.addVertex('D'); // 3
		theGraph.addVertex('E'); // 4
		
//		theGraph.addEdge(0, 1); // AB
//		theGraph.addEdge(1, 2); // BC
//		theGraph.addEdge(0, 3); // AD
//		theGraph.addEdge(3, 4); // DE
//		
		theGraph.addEdge(0, 1); // AB
		theGraph.addEdge(0, 2); // AC
		theGraph.addEdge(0, 3); // AD
		theGraph.addEdge(0, 4); // AE
		theGraph.addEdge(1, 2); // BC
		theGraph.addEdge(1, 3); // BD
		theGraph.addEdge(1, 4); // BE
		theGraph.addEdge(2, 3); // CD
		theGraph.addEdge(2, 4); // CE
		theGraph.addEdge(3, 4); // DE
		
		System.out.print("DFS Visits: ");
		theGraph.dfs();
		System.out.println();
		
		System.out.print("BFS Visits: ");
		theGraph.bfs();
		System.out.println();
		
		System.out.print("Min Spanning Tree: ");
		theGraph.mst();
		System.out.println();

	}

}
