/**
 * Finally, a demo class should be developed and here an object of the class that implements the
interface should be created with the parameter argument being Student. The Person and Student
class can be reused from the class examples. This demo class should have options for adding a
student, removing a student from the front, seeing everyone on the waitlist, or seeing the size of
the waitlist.
 */
import java.util.Scanner;
public class QueueDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		QueueInterface<Student> waitList = new ArrayBasedQueue<Student>();
		
		int option;
		do {
			System.out.println("Press 1 to add a student to the waitlist.");
			System.out.println("Press 2 to remove a student from the front of the waitlist.");
			System.out.println("Press 3 to see everyone on the waitlist.");
			System.out.println("Press 4 to see the size of the waitlist.");
			System.out.println("Press 5 to end the program.");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if(option == 1) {
				System.out.println("What is the name of the student you want to add to the queue?");
				String name = keyboard.nextLine();
				
				System.out.println("What is the student ID of the student being added to the queue?");
				int studentID = keyboard.nextInt();
				
				Student currentStudent = new Student(name, studentID);
				try {
					waitList.enqueue(currentStudent);
				}catch(QueueFullException e) {
					System.out.println(e.getMessage());
				}
			}
			else if(option == 2) {
				try {
					Student front = waitList.dequeue();
					System.out.println("Student that was removed: " + front.toString());
				}catch(QueueEmptyException e) {
					System.out.println(e.getMessage());
				}
			}
			else if(option == 3) {
				System.out.println("Waitlist: " + waitList.toString());
			}
			else if(option == 4) {
				System.out.println("Size of the waitlist: " + waitList.size());
			}
			else if(option == 5) {
				System.out.println("Thank you for using my program! Bye!");
			}
			else {
				System.out.println("Error!");
			}
		}while(option != 5);

	}

}
