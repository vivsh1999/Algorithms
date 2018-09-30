package BinarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
	
	private Node<T> root;//root node
	
	public void insert(T data) {
		if(root==null) {
			root=new Node<T>(data);
			}
		else {
			insertNode(data,root);
		}
	}

	@Override
	public void traversal() {
		// TODO Auto-generated method stub
		
	}
	//it will insert a new node recursively
	@Override
	public void insertNode(T newData,Node<T> node) {
		if(newData.compareTo(node.getData())<0) {
			if(node.getLeftChild()!=null) {
				insertNode(newData,node.getLeftChild());
			}
			else {
				Node<T> newNode=new Node<T>(newData);
				node.setLeftChild(newNode);
			}
		}else {
			if(node.getRightChild()!=null) {
				insertNode(newData,node.getRightChild());
			}
			else {
				Node<T> newNode=new Node<T>(newData);
				node.setRightChild(newNode);
			}
		}
		
	}

	@Override
	public void delete(T data) {
		// TODO Auto-generated method stub
		
	}
	//get max node
	//keep on going right
	@Override
	public T getMax(Node<T> node) {
		if(node.getRightChild()!=null)
			return getMax(node.getRightChild());
		return node.getData();
	}
	//get min node
	//keep on going left
	@Override
	public T getMin(Node<T> node) {
		if(node.getLeftChild()!=null) {
			return getMin(node.getLeftChild());
		}
		return node.getData();
	}
	//main algorithm of BST
}
