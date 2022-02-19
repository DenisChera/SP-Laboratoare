
public abstract class Angajat implements Element{
	private String nume;
	private int salariu;
	private int vechime;
	
	public Angajat(String nume, int salariu, int vechime) {
		super();
		this.nume = nume;
		this.salariu = salariu;
		this.vechime = vechime;
	}

	public Angajat() {
		super();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public int getVechime() {
		return vechime;
	}

	public void setVechime(int vechime) {
		this.vechime = vechime;
	}
	
	
}
