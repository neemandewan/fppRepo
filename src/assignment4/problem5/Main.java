/**
 * 
 */
package assignment4.problem5;

/**
 * @author 985955
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer c1 = new Computer("Dell", "i7", 16, 2, 3002.5);
		Computer c2 = new Computer("HP", "i7", 16, 1, 3115.23);
		Computer c3 = new Computer("Dell", "i7", 16, 2, 3002.5);
		
		System.out.println("Compare c1 and c2: ");
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("Result: " + c1.equals(c2));
		System.out.println("\nHashcode for c1: " + c1.hashCode());
		System.out.println("Hashcode for c2: " + c2.hashCode());
		
		System.out.println("\nCompare c1 and c3: ");
		System.out.println("c1: " + c1);
		System.out.println("c3: " + c3);
		System.out.println("Result: " + c1.equals(c3));
		System.out.println("\nHashcode for c1: " + c1.hashCode());
		System.out.println("Hashcode for c2: " + c3.hashCode());
	}

}

/*
	OUTPUT:-
	Compare c1 and c2: 
	c1: Computer [manufacturer: Dell, processor: i7, ramSize: 16, diskSize: 2, processorSpeed: 3002.5]
	c2: Computer [manufacturer: HP, processor: i7, ramSize: 16, diskSize: 1, processorSpeed: 3115.23]
	Result: false
	
	Hashcode for c1: -2137290884
	Hashcode for c2: -2071021098
	
	Compare c1 and c3: 
	c1: Computer [manufacturer: Dell, processor: i7, ramSize: 16, diskSize: 2, processorSpeed: 3002.5]
	c3: Computer [manufacturer: Dell, processor: i7, ramSize: 16, diskSize: 2, processorSpeed: 3002.5]
	Result: true
	
	Hashcode for c1: -2137290884
	Hashcode for c2: -2137290884

*/
