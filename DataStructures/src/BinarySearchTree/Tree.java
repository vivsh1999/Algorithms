package BinarySearchTree;

public interface  Tree<T> {
	//interface of a common tree
	//from here the BST will implement properties.
	public void traversal();
	public void insert(T data);
	public void delete(T data);
	public T getMax();
	public T getMin();
}
