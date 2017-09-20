package assignment9.problem1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueueImpl arrayQueueImpl = new ArrayQueueImpl();
		
		System.out.println("Peek at empty: " + arrayQueueImpl.peek());
		
		int sum = 0;
		for(int i = 1; i < 15; i++) {
			sum = 10 + i;
			System.out.println("Enqueue: " + sum);
			arrayQueueImpl.enqueue(sum);
		}
		
		System.out.println("Peek: " + arrayQueueImpl.peek());
		
		for(int i = 1; i < 16; i++) {
			System.out.println("Dequeue: " + arrayQueueImpl.dequeue());
		}
		
	}

}

/**
	OUTPUT:-
	Queue is Empty
	Peek at empty: -1
	Enqueue: 11
	Enqueue: 12
	Enqueue: 13
	Enqueue: 14
	Enqueue: 15
	Enqueue: 16
	Enqueue: 17
	Enqueue: 18
	Enqueue: 19
	Enqueue: 20
	Enqueue: 21
	resizing
	Enqueue: 22
	Enqueue: 23
	Enqueue: 24
	Peek: 11
	Dequeue: 11
	Dequeue: 12
	Dequeue: 13
	Dequeue: 14
	Dequeue: 15
	Dequeue: 16
	Dequeue: 17
	Dequeue: 18
	Dequeue: 19
	Dequeue: 20
	Dequeue: 21
	Dequeue: 22
	Dequeue: 23
	Dequeue: 24
	Queue is Empty
	Dequeue: -1
*/