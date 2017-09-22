package assignment10.problem1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}
	
	/**
	* Prints the values in the nodes of the tree
	* in sorted order. Inorder Traversal
	*/
	public void printTree() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printTree(root);
	}
	
	// Inorder Traversal to print the nodes in Ascending order
	private void printTree( BinaryNode t ){
		if( t != null ){
			printTree( t.left );
		    System.out.print(t.element+",");
		    printTree( t.right );
		} 
	}
	
	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(BinaryNode t) {
		if( t != null ){
			System.out.print(t.element+",");
			preOrder( t.left );
			preOrder( t.right );
		} 
	}
	
	public void postOrder(){
		postOrder(root);
	}
	
	private void postOrder(BinaryNode t) { 
		if( t != null ){
			postOrder( t.left );
			postOrder( t.right );
			System.out.print(t.element+",");
		}
	}
	
	public boolean contains(Integer key) {
		BinaryNode t = root;
		
		while(t != null) {
			if(key.compareTo(t.element)<0) {
				t = t.left;
			}				
			else if(key.compareTo(t.element)>0){ 
				t = t.right;
			}
			else {
				return true;
			}

		}
		
		return false;
	}
	
	public Integer getRoot() {
		if(root == null) return -1;
		else return root.element;
	}
	
	public Integer leafNodes() {
		return leafNodes(root);
	}
	
	private int leafNodes(BinaryNode t) { 
		if(t == null) return 0;
		if(t.left == null && t.right == null) return 1;
		else return leafNodes(t.left) + leafNodes(t.right);
	}
	
	public int size() {
		return getSize(root);
	}
	
	private int getSize(BinaryNode t) {
		if(t == null) return 0;
		else if(t.left == null && t.right == null) return 1;
		else return 1 + getSize(t.left) + getSize(t.right);
	}
	
	public boolean isEmpty() {
		if(root == null) return false;
		return true;
	}
	
	public Integer findMin(){
		return findMinVal(root);
	}
	
	private Integer findMinVal(BinaryNode t){
		if(t == null) return 0;
		
		while(t.left != null) {
			t = t.left;
		}
		
		return t.element;
	}
	
	public Integer findMax(){
		return findMaxVal(root);
	}
	
	private Integer findMaxVal(BinaryNode t){
		if(t == null) return 0;
		
		while(t.right != null) {
			t = t.right;
		}
		
		return t.element;
	}
		 
	//Assume the data in the Node is an Integer.	
	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		}
		else { 
			BinaryNode n = root;
			boolean inserted = false;

			while(!inserted)//true
				{
				if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new BinaryNode(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				}				
				else if(x.compareTo(n.element)>0){ 
					//space found on the right					
					if(n.right==null){
					n.right = new BinaryNode(x,null,null);
					inserted = true;
					}
						//keep looking for a place to insert (a null)
					else {
							n = n.right;
					}
										
				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}
	
	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left;      // Left child
		private BinaryNode right;     // Right child	  
		// Constructors 
		
		BinaryNode( Integer theElement ){
			this( theElement, null, null );
		}	

		BinaryNode( Integer element, BinaryNode left, BinaryNode right ){
			this.element = element;
			this.left = left;
			this.right = right;
		}
		
	}
		

	public static void main(String[] args) {
		
		MyBST mybst = new MyBST();
		
		int [] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};
	
		/*for (int j = 0; j < a.length; j++ ) {
			mybst.insert(a[j]);
					
		}
		mybst.insert(12);
		mybst.printTree();
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for (int j = 0; j < a.length; j++ ) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();		
			Integer nextItem = null;
			while(it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			} 
			System.out.println();
		}
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11)+", "+ map.get(10);
		System.out.println(str);*/
		
		System.out.println("Start from here -- >>");
		a = new int[]{43, 15, 60, 8, 30, 50, 82, 20, 35, 70};
		
		System.out.println("\nQuestion data: " + Arrays.toString(a));
		mybst = new MyBST();
		for (int j = 0; j < a.length; j++ ) {
			mybst.insert(a[j]);
					
		}
		
		System.out.println("\na. PreOrder[VLR]: ");
		mybst.preOrder();
		System.out.println("\n\nb. PostOrder[LRV]: ");
		mybst.postOrder();
		
		System.out.println("\n\nc. Contains: ");
		System.out.println("Contains 43: " + mybst.contains(43));
		System.out.println("Contains 60: " + mybst.contains(60));
		System.out.println("Contains 93: " + mybst.contains(93));
		System.out.println("\nd. getRoot: " + mybst.getRoot());
		System.out.println("\ne. leafnodes: " + mybst.leafNodes());
		System.out.println("\nf. Size: " + mybst.size());
		System.out.println("\ng. Min Value: " + mybst.findMin());
		System.out.println("\nh. Max Value: " + mybst.findMax());
	}
}

/**
	OUTPUT:-
	Start from here -- >>

	Question data: [43, 15, 60, 8, 30, 50, 82, 20, 35, 70]
	
	a. PreOrder[VLR]: 
	43,15,8,30,20,35,60,50,82,70,
	
	b. PostOrder[LRV]: 
	8,20,35,30,15,50,70,82,60,43,
	
	c. Contains: 
	Contains 43: true
	Contains 60: true
	Contains 93: false
	
	d. getRoot: 43
	
	e. leafnodes: 5
	
	f. Size: 10
	
	g. Min Value: 8
	
	h. Max Value: 82

*/