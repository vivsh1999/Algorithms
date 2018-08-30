package CycleDetector;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name;
	private boolean visited;
	private boolean beingVisited;
	private List<Vertex> neihbourList;
	
	public Vertex(String name) {
		this.name=name;
		this.neihbourList=new ArrayList<>();
	}
	public void addNeighbour(Vertex v) {
		this.neihbourList.add(v);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public boolean isBeingVisited() {
		return beingVisited;
	}
	public void setBeingVisited(boolean beingVisited) {
		this.beingVisited = beingVisited;
	}
	public List<Vertex> getNeihbourList() {
		return neihbourList;
	}
	public void setNeihbourList(List<Vertex> neihbourList) {
		this.neihbourList = neihbourList;
	}
	@Override
	public String toString() {
		return "Vertex [name=" + name + "]";
	}
	
	

}
