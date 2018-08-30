package CycleDetector;

import java.util.List;

public class CycleDetector {
	public void detectCycle(List<Vertex> vertexList) {
		for (Vertex v:vertexList) {
			if(!v.isVisited()) {
				dfs(v);
			}
			
		}
		
		
		
	}

	private void dfs(Vertex v) {
		//System.out.println("DFS on "+v);
		v.setBeingVisited(true);
		for(Vertex vertex:v.getNeihbourList()) {
			if(vertex.isBeingVisited()) {
				System.err.println("Cycle detected!!!"+" At "+vertex);
				//System.out.println();
				return;
			}
			if(!vertex.isVisited()) {
				//System.out.println("Visiting "+vertex+" recursively...");
				vertex.setVisited(true);
				dfs(vertex);
			}
		}
		//System.out.println("setting "+v+" beingVisited false and visited true.");
		v.setBeingVisited(false);
		v.setVisited(true); 
		
	}

	

}
