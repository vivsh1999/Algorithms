package BinarySearchTree;

public class Node<T> {
	//represent node in tree structure
	//made it generic to be universal
	private T data;
	private Node<T> leftChild;
	private Node<T> rightChild;
	//constructor
	public Node(T data) {
		this.data=data;
	}
	
	public T getData() {
		return data;
	}
	public Node<T> getLeftChild() {
		return leftChild;
	}
	public Node<T> getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}
	public void setData(T data) {
		this.data = data;
	}
	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;

	}
	
	
	//telling that you have to print out data
	@Override
	public String toString() {
		
		return this.data.toString();
	}

	
}
