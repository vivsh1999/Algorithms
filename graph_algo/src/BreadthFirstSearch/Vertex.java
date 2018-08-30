package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private boolean viewed;
	private int data;
	private List<Vertex> neighbourList;
	//constructor
	public Vertex(int data) {
		this.neighbourList=new ArrayList<>();
		this.data = data;
	}
	//getters and setters

	public boolean isViewed() {
		return viewed;
	}

	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void setNeighbourList(List<Vertex> neighbourList) {
		this.neighbourList = neighbourList;
	}
	public void addNeighbourVertex(Vertex vertex) {
		this.neighbourList.add(vertex);
	}
	
	@Override
	public String toString() {
		return ""+this.data;
	}
	
	
	

}
