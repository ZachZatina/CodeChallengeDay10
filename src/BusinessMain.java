
public class BusinessMain {

	public static void main(String[] args) {
		
		Employees zach = new Employees("Zach Zatina", "123 Main", "2657");
		Employees abdul = new Employees("Abdul Shaamala", "123 Main", "6587");
		Employees brad = new Employees("Brad Malakey", "547 Woodward", "2364");
		Employees kassie = new Employees("Kassies Jones", "111 Washington", "8741");
		Employees alex = new Employees("Alex Brozovich", "234 Main", "9862");
		
		Roles position = new Roles();
		position.setAcountant(zach);
		position.setSalesPerson(abdul);
		position.setCeo(brad);
		position.setCoo(kassie);
		position.setManager(alex);
		
		position.printRoles();

	}

}
