import java.util.ArrayList;

public class Manager extends Angajat implements Element{
	private int angajatiSubordine;

	
	public Manager(String nume, int salariu, int vechime, int angajatiSubordine) {
		super(nume, salariu, vechime);
		this.angajatiSubordine = angajatiSubordine;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Angajatul " + this.getNume() + " este manager");
		}


	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.salariesManager(this);
	}
	}
	
	

