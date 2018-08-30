package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
	public void bfs(Vertex root) {
	Queue<Vertex> queue=new LinkedList<>();

	root.setViewed(true);
	queue.add(root);
	
	while(!queue.isEmpty()) {
		Vertex actualVertex=queue.remove();
		System.out.println(""+actualVertex);
		for(Vertex v:actualVertex.getNeighbourList()) {
			if(!v.isViewed()) {
			v.setViewed(true);
			queue.add(v);
			}
			
		}
	}
	}

}
