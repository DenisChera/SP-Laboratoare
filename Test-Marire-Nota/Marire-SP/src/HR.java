
public class HR extends Angajat{
	
	private int anAngajare;
	
	
	
	public HR(String nume, int salariu, int vechime) {
		super(nume, salariu, vechime);
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Angajatul" + this.getNume() + " lucreaza la HR");
	}



	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.salariesHr(this);
	}

}
