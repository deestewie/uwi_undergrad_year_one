package lab4;

public class Name {
	private String lastName, firstName;
	
	public Name(String lastName, String firstName){
		this.firstName =  firstName;
		this.lastName = lastName;
	}

	public void changeLastName(String newName){
		if (!newName.equals("")){
			lastName = newName;
		}
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String toString(){
		return lastName + ", " + firstName;
	}
}
