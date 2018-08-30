package topologicalOrder;

import java.util.Stack;

public class topologicalOrdering {
	private Stack<Vertex> vertexStack;
	
	public topologicalOrdering() {
		this.vertexStack=new Stack<>();
	}
	//recursive DFS
	public void dfs(Vertex vertex) {
		vertex.setVisited(true);
		
		for (Vertex v : vertex.getNeighbourList()) {
			if(!v.isVisited()) {
				dfs(v);
			}
		}
		vertexStack.push(vertex);
	}
	public Stack<Vertex> getStack(){
		return this.vertexStack;
	}

}
