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

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
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
	
	public Node getFirst() {
		if (header == null) return null;
		else return header;
	}
	
	public Node getLast(){
		if (header == null) return null;
		
		for (Node i = header;i != null; i = i.next){
			if(i.next == null) return i;
		}
		
		return null;
	}
	
	public void removeFirst(){
		if (header == null)
    		return;
		else {
			header.next.previous = null;
			header = header.next;
		}
	}
	
	public void removeLast(){
		if (header == null)
    		return;
		else {
			Node temp = findLast();
			temp.previous.next = null;
			temp = null;
		}
	} 
	
	public void printMin () {
		if (header == null) {
			System.out.println("No Node to determine min..");
			return;
		}
		
		System.out.println("Minimum Node value is: " + header.value);
		
	}
	
	public void printMax () {
		if (header == null) {
			System.out.println("No Node to determine min..");
			return;
		}
		
		for (Node i = header;i != null; i = i.next){
			if(i.next == null) {
				System.out.println("Maximum Node value is: " + i.value);
			}
		}
		
	}
	
	public void print(Node n) {
		if(n == null) return;
		else {
			System.out.println("Value: " + n.value);
			print(n.next);
		}
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
		/*System.out.println(mySL);
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
		mySL.printReverse();*/
		
		System.out.println("1. Answer Add Last -->>");
		mySL.addLast("Chicken Masala");
		mySL.addLast("Mutton Paneer");
		mySL.addLast("Pork MOMO");
		System.out.println(mySL);
		
		mySL.addLast("Buff C MOMO");
		mySL.addLast("Alu Nimki");
		System.out.println(mySL);
		
		System.out.println("2. Answer postAddNode -->>");
		mySL.postAddNode(mySL.findItem("Mutton Paneer"), "Barbeque");
		System.out.println(mySL);
		mySL.postAddNode(mySL.findItem("Chicken Masala"), "Chicken Tondori");
		System.out.println(mySL);
		
		System.out.println("3. Answer Size -->>" + mySL.Size());
		System.out.println("4. Answer isEmpty -->>" + mySL.isEmpty());
		
		Node frst = mySL.getFirst();
		System.out.println("5. Answer getFirst -->>" + frst);
		
		Node lst = mySL.getLast();
		System.out.println("6. Answer getLast -->> " + lst);
		
		System.out.println("7. Answer removeFirst -->>");
		mySL.removeFirst();
		System.out.println(mySL);
		
		System.out.println("8. Answer removeLast -->>");
		mySL.removeLast();
		System.out.println(mySL);
		
		System.out.println("9. Answer printMax -->>");
		mySL.printMax();
		
		System.out.println("10. Answer printMin -->>");
		mySL.printMin();
		
		System.out.println("11. Answer print all recursive -->>");
		mySL.print(mySL.getFirst());
	}

}

/**
	OUTPUT:-
	1. Answer Add Last -->>
	-->[Chicken Masala]-->[Mutton Paneer]-->[Pork MOMO]-->[NULL]
	-->[Chicken Masala]-->[Mutton Paneer]-->[Pork MOMO]-->[Buff C MOMO]-->[Alu Nimki]-->[NULL]
	2. Answer postAddNode -->>
	-->[Chicken Masala]-->[Mutton Paneer]-->[Barbeque]-->[Pork MOMO]-->[Buff C MOMO]-->[Alu Nimki]-->[NULL]
	-->[Chicken Masala]-->[Chicken Tondori]-->[Mutton Paneer]-->[Barbeque]-->[Pork MOMO]-->[Buff C MOMO]-->[Alu Nimki]-->[NULL]
	3. Answer Size -->>7
	4. Answer isEmpty -->>false
	5. Answer getFirst -->>Chicken Masala
	6. Answer getLast -->> Alu Nimki
	7. Answer removeFirst -->>
	-->[Chicken Tondori]-->[Mutton Paneer]-->[Barbeque]-->[Pork MOMO]-->[Buff C MOMO]-->[Alu Nimki]-->[NULL]
	8. Answer removeLast -->>
	-->[Chicken Tondori]-->[Mutton Paneer]-->[Barbeque]-->[Pork MOMO]-->[Buff C MOMO]-->[NULL]
	9. Answer printMax -->>
	Maximum Node value is: Buff C MOMO
	10. Answer printMin -->>
	Minimum Node value is: Chicken Tondori
	11. Answer print all recursive -->>
	Value: Chicken Tondori
	Value: Mutton Paneer
	Value: Barbeque
	Value: Pork MOMO
	Value: Buff C MOMO
*/