package BinarySearchTree;

public class App {
	public static void main(String[] args) {
	//application of BST
	/*Tree<Integer> bst =new BinarySearchTree<>();
	
	bst.insert(12);
	bst.insert(20);
	bst.insert(2);
	bst.insert(-1);
	bst.insert(5);
	
	//System.out.println(bst.getMinValue());
	bst.traversal();
	bst.delete(5);
	bst.traversal();*/
		
		
		
	Tree<Person> bst=new BinarySearchTree<>();
	//Person a("vivek",19),b("she",19),c("us",0);
	Person a=new Person("vivek",19);
	Person b=new Person("she",19);
	Person c=new Person("us",0);
	Person d=new Person("love",999999999);
	Person e=new Person("other",-1);
	
	//inserting persons
	bst.insert(a);
	bst.insert(b);
	bst.insert(c);
	bst.insert(d);
	bst.insert(e);
	bst.traversal();
	
	System.out.println(bst.getMinValue());
	System.out.println(bst.getMaxValue());
	
	bst.delete(e);
	bst.traversal();
	}
	
}
