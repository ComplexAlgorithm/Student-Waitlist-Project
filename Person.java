
public class Person extends Object {
	//instance variables
		private String name;
		
		//default constructor
		public Person() {
			super();  
			name = "";
		}
		
		//overloaded constructor
		public Person(String newName) {
			super();
			name = newName;
		}
		
		//non-static methods 
		public void setName(String newName) {
			name = newName;
		}
		
		public String getName() {
			return name;
		}
		
		//override the toString method, override means to replace a method that is inherited from a parent class with a different
		//definition which is more appropriate for an object of this class
		public String toString() {
			return "Name: " + name;
		}
		
		//override the equals method to compare the values stored in the instance variables
		//and returns true if the name instance variable has the same value for both objects
		//otherwise returns false
		public boolean equals(Object otherObject) {
			boolean areTheyEqual = false;
			if(otherObject != null && otherObject instanceof Person) {
				Person otherPerson = (Person)otherObject;
				if(this.name.equals(otherPerson.name)) {
					areTheyEqual = true;
				}
			}
			return areTheyEqual;
		}
		
	}


