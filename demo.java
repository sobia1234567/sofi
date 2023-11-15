package own;

public class demo {
	
	String name="Manoj";
	String designation="tester";
	int salary=50000;
	
	public void details() {
		System.out.println("The employee name is "+name+" and the employee designation is "+
	designation+" employee salary is "+salary);
	}

	public static void main(String[] args) {
		demo d=new demo();
		d.details();
	}

}
