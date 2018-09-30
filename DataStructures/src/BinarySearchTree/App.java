package BinarySearchTree;

public class App {
	public static void main(String[] args) {
	//application of BST
	Tree<Integer> bst =new BinarySearchTree<>();
	
	bst.insert(12);
	bst.insert(20);
	bst.insert(2);
	bst.insert(-1);
	bst.insert(5);
	
	//System.out.println(bst.getMinValue());
	bst.traversal();
	bst.delete(5);
	bst.traversal();
	}
	
}
