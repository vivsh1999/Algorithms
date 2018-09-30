package BinarySearchTree;

public interface  Tree<T> {
	//interface of a common tree
	//from here the BST will implement properties.
	public void traversal();
	public void insertNode(T data,Node<T> node);
	public void delete(T data);
	public T getMax();
	public T getMin();
}
