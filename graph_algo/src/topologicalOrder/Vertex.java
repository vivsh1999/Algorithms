package topologicalOrder;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String data;
	private boolean visited;
	private List<Vertex> neighbourList;

	// Constructor
	public Vertex(String data) {

		this.data = data;                                                       
		this.neighbourList = new ArrayList<>();
	}

	public void addNeighbour(Vertex v) {
		this.neighbourList.add(v);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void setNeighbourList(List<Vertex> neighbourList) {
		this.neighbourList = neighbourList;
	}

	@Override
	public String toString() {
		return "Vertex [data=" + data + "]";
	}

}
