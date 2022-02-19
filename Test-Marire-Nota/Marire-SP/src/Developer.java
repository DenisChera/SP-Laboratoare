
public class Developer extends Angajat{
	private TipDeveloper dev;
	
	
	
	public Developer(String nume, int salariu, int vechime) {
		super(nume, salariu, vechime);
	}



	public Developer(String nume, int salariu, int vechime, TipDeveloper dev) {
		super(nume, salariu, vechime);
		this.dev = dev;
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		String mesaj = this.getNume();
		if(dev!=null) {
			this.dev.print(mesaj);
		}
	}



	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.salariesDeveloper(this);
	}

}
