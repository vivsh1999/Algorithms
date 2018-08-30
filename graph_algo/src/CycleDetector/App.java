package CycleDetector;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String args[]) {
		
		Vertex v1=new Vertex("1");
		Vertex v2=new Vertex("2");
		Vertex v3=new Vertex("3"); 
		Vertex v4=new Vertex("4");
		Vertex v5=new Vertex("5");
		Vertex v6=new Vertex("6");
		Vertex v7=new Vertex("7");
		Vertex v8=new Vertex("8");
		Vertex v9=new Vertex("9");
		
		v1.addNeighbour(v2);
		v3.addNeighbour(v1);
		
		v2.addNeighbour(v3);
		
		v4.addNeighbour(v1);
		v4.addNeighbour(v5);
		
		v5.addNeighbour(v6);
		
		v6.addNeighbour(v4);
		
		v7.addNeighbour(v8);
		v8.addNeighbour(v9);
		v9.addNeighbour(v7);
		
		List<Vertex> vertexList =new ArrayList<>();
		vertexList.add(v1);
		vertexList.add(v2);
		vertexList.add(v3);
		vertexList.add(v4);
		vertexList.add(v5);
		vertexList.add(v6);
		vertexList.add(v7);
		vertexList.add(v8);
		vertexList.add(v9);
		
		CycleDetector cd=new CycleDetector();
		cd.detectCycle(vertexList);
		
	}
	

}
