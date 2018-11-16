package BinarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
	
	private Node<T> root;//root node
	
	@Override
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
		if(root!=null) {
			inOrderTraverse(root);
		}
		
	}
	//structure for other delete method
	
	private Node<T> delete(Node<T> node, T data) {
		//return null for no entries or empty node
		if(node==null)return null;
		//if data at node is less than the data at present node go to left
		if(data.compareTo(node.getData())<0) {
			node.setLeftChild(delete(node.getLeftChild(),data));
		}else if(data.compareTo(node.getData())>0)
			node.setRightChild(delete(node.getRightChild(),data));
		else {
			if(node.getLeftChild()==null&&node.getRightChild()==null) {
				System.out.println("removing a leaf node...");
				return null;
			}else
				if(node.getLeftChild()==null) {
					System.out.println("Removing the right child...");
					Node<T> temp=node.getRightChild();
					node=null;
					return temp;
				}else
					if(node.getRightChild()==null) {
						System.out.println("Removing the left child...");
						Node<T> temp=node.getLeftChild();
						node=null;
						return temp;
					}
			//this is the case where node has both the child
			System.out.println("removing node with 2 child...");
			Node<T> tempNode=getPredessesor(node.getLeftChild());
			node.setData(tempNode.getData());
			node.setLeftChild(delete(node.getLeftChild(),tempNode.getData()));
			
		}
		return node;
	}
	
	private Node<T> getPredessesor(Node<T> node) {
		if(node.getRightChild()!=null)
			return getPredessesor(node.getRightChild());
		return node;
	}
	
	private void inOrderTraverse(Node<T> node) {
		if(node.getLeftChild()!=null)
			inOrderTraverse(node.getLeftChild());
		System.out.print(node+"->");
		if(node.getRightChild()!=null) {
			inOrderTraverse(node.getRightChild());
		}
	}
	//it will insert a new node recursively
	private void insertNode(T newData,Node<T> node) {
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
		if(root!=null) {
			root=delete(root,data);
		}
		
	}
	

	//get max node
	//keep on going right
	
	private T getMax(Node<T> node) {
		if(node.getRightChild()!=null)
			return getMax(node.getRightChild());
		return node.getData();
	}
	//get min node
	//keep on going left
	
	private T getMin(Node<T> node) {
		if(node.getLeftChild()!=null) {
			return getMin(node.getLeftChild());
		}
		return node.getData();
	}
	//main algorithm of BST

	@Override
	public T getMaxValue() {
		if(root==null)return null;
		return getMax(root);
	}

	@Override
	public T getMinValue() {
		if(root==null)
		return null;
		return getMin(root);
	}
}
