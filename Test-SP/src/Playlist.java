import java.util.ArrayList;

public class Playlist implements Element{
	private ArrayList<Element> elements;
	private String playlistName;
	
	
	public Playlist(String playlistName) {
		super();
		this.playlistName = playlistName;
		this.elements = new ArrayList<Element>();
	}

	
	public Playlist(String playlistName, ArrayList<Element> elements) {
		super();
		this.playlistName = playlistName;
		this.elements = elements;
	}
	

	public void add(Element element) {
		elements.add(element);
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Playlist "+ this.playlistName);
		if(elements != null) {
			for(Element i : elements)
				i.print();
		}
	}


	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
