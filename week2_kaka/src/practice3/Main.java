package practice3;

public class Main {

	public static void main(String[] args) {
		 FullTimeEmployee emp1 = new FullTimeEmployee("田中", 300000);
	     PartTimeEmployee emp2 = new PartTimeEmployee("佐藤", 1200, 80);
	     PartTimeEmployee emp3 = new PartTimeEmployee("鈴木", 1000, 60);

	     System.out.println(emp1.getName() + " の給与: " + emp1.calculateSalary() + "円");
	     System.out.println(emp2.getName() + " の給与: " + emp2.calculateSalary() + "円");
	     System.out.println(emp3.getName() + " の給与: " + emp3.calculateSalary() + "円");

	}

}
