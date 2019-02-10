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
	public int height(Node node) {
		if(node==null) {
			return -1;
		}
		return node.getHeight();
	}
	public int getBalance(Node node) {
		if(node==null) {
			return 0;
		}
		return height(node.getLeftNode())-height(node.getRightNode());
	}

}
