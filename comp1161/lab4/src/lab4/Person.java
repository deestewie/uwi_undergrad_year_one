package lab4;

import java.util.Calendar;

public class Person {
	private Name name;
	private String old_name;
	private char sex;
	private char status;
	private int yob;
	private DNA dna;
	Person mother;
	Person father;
	
	public Person(Name name, char sex, int yob,DNA dna){
		this.name = name;
		this.sex = sex;
		this.yob = yob;
		this.dna = dna;
		this.status= 'S';
	}
	
	public Person(Name name, char sex, int yob, Person mother, Person father ){
		this.name = name;
		this.sex = sex;
		this.yob = yob;
		this.mother = mother;
		this.father = father;
		this.dna = new DNA("SAMPLEDNA");
		this.status= 'S';
	}
	
	public int age(){
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return year - yob;
	}
	
	public char getCivilStatus(){
		return status;		
	}
	
	public DNA getDNA(){
		return dna;
	}
	
	public String getFormalName(){
		String formalName;
		
		if (sex == 'F'){
			if (status == 'M')
				formalName = "Mrs. " + name.getFirstName() + " " + this.old_name + "-" + name.getLastName();
			else 
				formalName = "Ms. "+ name.getFirstName() + " " + name.getLastName();
		}else{
			formalName = "Mr. "+ name.getFirstName() + " " + name.getLastName();
		}
		
		return formalName;
	}
	
	public String getFullName(){
		String formalName;
		
		if (sex == 'F'){
			if (status == 'M')
				formalName = "Mrs. " + name.getFirstName() + " " + name.getLastName();
			else 
				formalName = "Ms. "+ name.getFirstName() + " " + name.getLastName();
		}else{
			formalName = "Mr. "+ name.getFirstName() + " " + name.getLastName();
		}
		
		return formalName;
	}
	
	public char getSex(){
		return sex;
	}
	
	public boolean setCivilStatus(char status, String newLastName){
		boolean changedStatus = false;
	
		if(this.status != status){
			changedStatus = true;
			this.status = status;
		}
		
		if(sex == 'F' && this.status == 'M'){
			old_name = name.getLastName();
			name.changeLastName(newLastName);
		}
		
		return changedStatus;
	}
	
	public String toString(){
		return "Name: " + this.getFormalName() + "\n" +
	"Sex: " + this.getSex() + "\n" +
	"Age: " + this.age() + "\n" +
	"DNA :" + this.getDNA().getDNA();
	}
}
