import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ListaAngajati lista = new ListaAngajati("Continental");
		ArrayList<Element> elements = new ArrayList<Element>();
		Developer d1 = new Developer ("Andrei", 6000, 2, new Frontend());
		Developer d2 = new Developer ("Mihai", 7000, 3, new Backend());
		Developer d3 = new Developer ("Mircea", 10000, 3, new Fullstack());
		Manager m1 = new Manager ("Popescu", 16000, 4, 10);
		Manager m2 = new Manager ("Ionescu", 18000, 4, 12);
		HR h1 = new HR ("Mihaela", 5000, 2);

		
		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(m1);
		lista.add(m2);
		lista.add(h1);
	
		
		lista.print();
		
		CalculateSalaries visitor = new CalculateSalaries();
		lista.accept(visitor);
		visitor.printSalaries();
		
	}

}
