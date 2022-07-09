/**
 * Create a program that allows students to join a waitlist for a class that is already full. The
program should allow the user to add a student to the waitlist, remove the first student on the
waitlist, see the waitlist in the order in which the students are in the waitlist, and to see the
overall size of the waitlist.
The queue that represents the waitlist should be implemented by using an array-based
implementation. The QueueInterface<T> should be included as part of the development. The
toString method to see all students on the waitlist and the size method should be added to the
QueueInterface<T>. The class that implements the interface should then be developed using
arrays. QueueEmptyException and QueueFullException should be included as well without any
changes. The numberOfItems instance variable should be removed from the implementation, but
the methods should continue to work like they did when this instance variable was part of the
class without changing any of the method headings.

 * @author Joshua
 *
 * @param <T>
 */
public class ArrayBasedQueue<T> implements QueueInterface<T> {
	//instance variables
	private int front;
	private int rear; 
	private T[] queue;  //reference to an array of type T
	
	//default constructor
	public ArrayBasedQueue() {
		super();
		front = 0;
		rear = 0;
		queue = (T[])new Object[5];
	}
	
	//overloaded constructor
	public ArrayBasedQueue(int size) {
		super();
		front = 0;
		rear = 0;
		if(size > 0) {
			queue = (T[])new Object[size];
		}
		else {
			queue = (T[])new Object[5];
		}
	}
	
	@Override
	public void enqueue(T item) throws QueueFullException {
		boolean isFull = true;
		int index = 0;
		while(index < queue.length && isFull) {
			if(queue[index] == null) {
				isFull = false;
			}
			index++;
		}
		if(!isFull) {
			queue[rear] = item;
			if(rear == queue.length-1) { //rear is on the last element in the array
				rear = 0; //reset rear to the first element in the array
			}
			else {
				rear++;
			}
			
		}
		else {
			throw new QueueFullException("Enqueue attempted on a full queue!");
		}

	}

	@Override
	public T dequeue() throws QueueEmptyException {
		boolean isEmpty = true;
		int index = 0;
		while(index < queue.length && isEmpty) {
			if(queue[index] != null) {
				isEmpty = false;
			}
			index++;
		}
		if(!isEmpty) {
			T frontItem = queue[front]; //saves the item at the front before it is removed
			queue[front] = null; //removes the item at the front of the queue
			//front = (front+1) % queue.length; 
			if(front == queue.length-1) { //front is on the last element in the array
				front = 0;  //reset front to the first element in the array 
				index--;
			}
			else {
				front++; 
			}
			return frontItem;
		}
		else {
			throw new QueueEmptyException("Dequeue attempted on an empty queue.");
		}
	}

	public String toString() {
		String allStudents = " ";
		for(int i =  front , itemsSeen = 0; itemsSeen < size(); itemsSeen++) {
			allStudents = allStudents + "\n" + queue[i].toString();
			if(i == queue.length-1) {
				i = 0;
			}
			else {
				i++;
			}
		}
		return allStudents;
	}

	@Override
	public int size() {
		int size = 0;
		for(int i = 0; i < queue.length; i++) {
			if(queue[i] != null) {
				size++;
			}
		}
		return size;
	}

}

