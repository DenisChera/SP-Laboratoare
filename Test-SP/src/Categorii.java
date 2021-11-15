
public abstract class Categorii implements Element{
	private int dimensiune;
	private String titlu;
	
	
	public Categorii(int dimensiune, String titlu) {
		super();
		this.dimensiune = dimensiune;
		this.titlu = titlu;
	}


	public int getDimensiune() {
		return dimensiune;
	}


	public void setDimensiune(int dimensiune) {
		this.dimensiune = dimensiune;
	}


	public String getTitlu() {
		return titlu;
	}


	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	
	
}
