
public class Roles {

	private Employees manager;
	private Employees salesPerson;
	private Employees acountant;
	private Employees ceo;
	private Employees coo;
	
	
	public Roles () {
		
	}
	
	public Roles (Employees manager, Employees salesPerson, Employees accountant, Employees ceo, Employees coo) {
		this.manager = manager;
		this.salesPerson = salesPerson;
		this.acountant = accountant;
		this.ceo = ceo;
		this.coo = coo;
	}

	public Employees getManager() {
		return manager;
	}

	public void setManager(Employees manager) {
		this.manager = manager;
	}

	public Employees getSalesPerson() {
		return salesPerson;
	}

	public void setSalesPerson(Employees salesPerson) {
		this.salesPerson = salesPerson;
	}

	public Employees getAcountant() {
		return acountant;
	}

	public void setAcountant(Employees acountant) {
		this.acountant = acountant;
	}

	public Employees getCeo() {
		return ceo;
	}

	public void setCeo(Employees ceo) {
		this.ceo = ceo;
	}

	public Employees getCoo() {
		return coo;
	}

	public void setCoo(Employees coo) {
		this.coo = coo;
	}
	
	public void printRoles () {
		System.out.println("Manager: " + manager.toString());
		System.out.println("Sales Person: " + salesPerson.toString());
		System.out.println("Accountant: " + acountant.toString());
		System.out.println("CEO: " + ceo.toString());
		System.out.println("COO: " + coo.toString());
	}
}
