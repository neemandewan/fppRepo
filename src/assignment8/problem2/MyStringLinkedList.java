package assignment8.problem2;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
		    	header.previous = n;
		    	header = n;
		}
	}

	// Implement the code
	public void addLast(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
		    Node l = findLast();
		    Node n = new Node(l, item, null);
		    l.next = n;
		    n.previous = l;
		}
	}


	// implement the code
	public void postAddNode(Node n, String value) {
		Node temp;
		if(n==null){
			temp=new Node(null,value,null);
		}else if(n.next==null){
			addLast(value);
		}else {
			temp=new Node(n,value,n.next);
			n.next.previous=temp;
			n.next = temp;
		}
					
	}

	// implement the code

	public int Size() {
		int size=0;
		for (Node i= header; i != null; i=i.next){
			size++;
		}
		return size;
	}

	
	// implement code
    public boolean isEmpty() {
    	if(header==null) return true;
       	return false;
    }  

	public void preAddNode(Node n, String value){
		Node newNode;
		if (n == null){
			//List is empty
			newNode = new Node(null, value, null);
		}
		else if (n.previous == null) {
			//n is the first node
			addFront(value);
		}
		else {
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
		}	
					
	}
	
	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}

		}

	}
	
	public void deleteList(){
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
	}

	public String toString() {
		String str =""; 
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public void printReverse() {
		String str =""; 
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str);
	}
	
	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Carrot Cake");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Blueberry Muffin");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Apple Pie");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addLast("Orange Juice");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addLast("Peach Sauce");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Apple Pie"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Peach Sauce"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Carrot Cake"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Blueberry Muffin"), "Carrot Cake");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Blueberry Muffin"), "Apple Pie" );
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Danish Delight" );
		System.out.println(mySL);
		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Orange Juice"), "Mango Smoothie" );
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Orange Juice"), "Peach Sauce" );
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteList();
		System.out.println(mySL);
		mySL.printReverse();
		
		System.out.println("Answer Add Last -->>");
		mySL.addLast("Chicken Masala");
		mySL.addLast("Mutton Paneer");
		mySL.addLast("Pork MOMO");
		System.out.println(mySL);
		
		mySL.addLast("Buff C MOMO");
		mySL.addLast("Alu Nimki");
		System.out.println(mySL);
		
		System.out.println("Answer postAddNode -->>");
		mySL.postAddNode(mySL.findItem("Mutton Paneer"), "Barbeque");
		System.out.println(mySL);
		mySL.postAddNode(mySL.findItem("Chicken Masala"), "Chicken Tondori");
		System.out.println(mySL);
	}

}

/**
	OUTPUT:-
	-->[NULL]
	==>[NULL]
	-->[Carrot Cake]-->[NULL]
	==>[Carrot Cake]==>[NULL]
	-->[Blueberry Muffin]-->[Carrot Cake]-->[NULL]
	==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
	-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[NULL]
	==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
	-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[NULL]
	==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
	-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
	==>[Peach Sauce]==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
	I am here 2
	-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
	==>[Peach Sauce]==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
	I am here 3
	-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[NULL]
	==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
	I am here 4
	-->[Blueberry Muffin]-->[Orange Juice]-->[NULL]
	==>[Orange Juice]==>[Blueberry Muffin]==>[NULL]
	-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[NULL]
	==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
	-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[NULL]
	==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
	-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Danish Delight]-->[Orange Juice]-->[NULL]
	==>[Orange Juice]==>[Danish Delight]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
	-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Danish Delight]-->[Mango Smoothie]-->[Orange Juice]-->[NULL]
	==>[Orange Juice]==>[Mango Smoothie]==>[Danish Delight]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
	-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Danish Delight]-->[Mango Smoothie]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
	==>[Peach Sauce]==>[Orange Juice]==>[Mango Smoothie]==>[Danish Delight]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
	-->[NULL]
	==>[NULL]
	Answer Add Last -->>
	-->[Chicken Masala]-->[Mutton Paneer]-->[Pork MOMO]-->[NULL]
	-->[Chicken Masala]-->[Mutton Paneer]-->[Pork MOMO]-->[Buff C MOMO]-->[Alu Nimki]-->[NULL]
	Answer postAddNode -->>
	-->[Chicken Masala]-->[Mutton Paneer]-->[Barbeque]-->[Pork MOMO]-->[Buff C MOMO]-->[Alu Nimki]-->[NULL]
	-->[Chicken Masala]-->[Chicken Tondori]-->[Mutton Paneer]-->[Barbeque]-->[Pork MOMO]-->[Buff C MOMO]-->[Alu Nimki]-->[NULL]
*/