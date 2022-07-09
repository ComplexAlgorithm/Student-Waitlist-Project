

	/**
	 * QueueFullException represents the situation where the queue is full
	 * and no more items can be added to it
	 * @author Anwar Ahmad
	 *
	 */
	public class QueueFullException extends Exception {
		//instance variables
		//none, but they are not needed
		
		/**
		 * Default constructor which calls the default constructor of the parent class (Exception)
		 */
		public QueueFullException() {
			super();
		}
		
		/**
		 * Overloaded constructor calls the constructor of the parent class (Exception)
		 * which takes a String as an argument
		 * @param message is the String that gives information about the exception
		 */
		public QueueFullException(String message) {
			super(message);
		}
}
