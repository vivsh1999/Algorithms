package AVL;

public class AVLTree implements Tree{
	private Node root;
	@Override
	public void insert(int data) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void traverse() {
		if(root==null) {
			return;
		}
		inOrderTraversal(root);
		
	}
	private Node rightRotation(Node node) {
		Node tempLeft=node.getLeftNode();
		Node t=tempLeft.getRightNode();
		tempLeft.setRightNode(node);
		node.setLeftNode(t);
		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode()))+1);
		tempLeft.setHeight(Math.max(height(tempLeft.getLeftNode()), height(tempLeft.getRightNode()))+1);
		return tempLeft;
	}
	private Node leftRotation(Node node) {
		Node tempRight=node.getRightNode();
		Node t=tempRight.getLeftNode();
		tempRight.setLeftNode(node);
		node.setRightNode(t);
		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode()))+1);
		tempRight.setHeight(Math.max(height(tempRight.getLeftNode()), height(tempRight.getRightNode()))+1);
		return tempRight;
	}
	private void inOrderTraversal(Node root) {
		//Left-Root-Right
		if(root.getLeftNode()!=null) {
			inOrderTraversal(root.getLeftNode());
		}
		System.out.println(root);
		if(root.getRightNode()!=null) {
			inOrderTraversal(root.getRightNode());
		}
		
	}
	private int height(Node node) {
		if(node==null) {
			return -1;
		}
		return node.getHeight();
	}
	private int getBalance(Node node) {
		if(node==null) {
			return 0;
		}
		return height(node.getLeftNode())-height(node.getRightNode());
	}

}
