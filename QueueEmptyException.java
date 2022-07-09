/**
 * QueueEmptyException represents the situation where the queue is empty
 * and no more items can be removed from it
 * @author Anwar Ahmad
 *
 */
public class QueueEmptyException extends Exception {
	//instance variables
	//none, but they are not needed
	
	/**
	 * Default constructor calls the default constructor of the parent class (Exception)
	 */
	public QueueEmptyException() {
		super();
	}
	
	/**
	 * Overloaded constructor calls the constructor of the parent class
	 * which takes a String as an argument 
	 * @param message is a String that gives information about the exception
	 */
	public QueueEmptyException(String message) {
		super(message);
	}
	
	//non-static methods
	//none, but they are not needed

}
