package lab4;

public class Tester {

	public static void main(String[] args) {
		Person mother = new Person(new Name("Hamilton", "Marjorie"),'F', 1949, new DNA("HAMILDNA"));
		Person father = new Person(new Name("Stewart", "Luywin"),'M', 1948, new DNA("STEWDNA"));
		
		mother.setCivilStatus('M', "Stewart");
		System.out.println("Mother =>\n"+ mother.toString());
		System.out.println("\n");
		System.out.println("Father => \n"+ father.toString());
		System.out.println("\n");
		Person me = new Person(new Name("Stewart","Deon"), 'F', 1993, mother, father);
		System.out.println("Me => \n"+me.toString());
		
				
	}

}
