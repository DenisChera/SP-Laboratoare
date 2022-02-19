import java.util.ArrayList;

public class ListaAngajati implements Element{
	private String numeCompanie;
	private ArrayList<Element> elements;
	
	public ListaAngajati() {
		this.numeCompanie = "";
		this.elements = new ArrayList<Element>();
	}
	
	
	public ListaAngajati(String numeCompanie) {
		this.numeCompanie = numeCompanie;
		this.elements = new ArrayList<Element>();
	}
	public ListaAngajati(String numeCompanie, ArrayList<Element> elements) {
		super();
		this.numeCompanie = numeCompanie;
		this.elements = elements;
	}

	
	public void add(Element element) {
		elements.add(element);
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Personalul companiei " + this.numeCompanie);
		if(elements != null) {
			for(Element i:elements) {
				i.print();
			}
		}
	}


	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		if(elements != null) {
			for(Element i:elements) {
				i.accept(visitor);
			}
		}
	}

}
