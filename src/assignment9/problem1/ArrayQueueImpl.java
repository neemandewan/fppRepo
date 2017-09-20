package assignment9.problem1;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			
			return -1;
		}
		else return arr[front];
	}
	
	public void enqueue(int obj){
		if(rear == size()) resize();
		arr[rear++] = obj;
		
		front = 0;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		int result = arr[front];
		int[] temp = new int[size()];
		System.arraycopy(arr, 1, temp, 0, size()-1);
		arr = temp;
		
		--rear;
		if(rear == front) --front;
		return result;
	}
	
	public boolean isEmpty(){
		if(front < 0) return true;
		return false;
	}
	
	public int size(){
		//implement
		return rear-front;
	}
	
	private void resize(){
		System.out.println("resizing");
		int len = size();
		int newlen = 2*len;
		int[] temp = new int[newlen];
		System.arraycopy(arr, 0, temp, 0, len);
		arr = temp;
	}
}
