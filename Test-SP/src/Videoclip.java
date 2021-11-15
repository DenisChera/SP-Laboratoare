
public class Videoclip extends Categorii{
	private Url url;
	public Videoclip(int dimensiune, String titlu, Url url) {
		super(dimensiune, titlu);
		// TODO Auto-generated constructor stub
		this.url = url;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		String message = "wwww.videos.com, videoclipul" + this.getTitlu() + " de " + this.getDimensiune() + " kb ";
		
		this.url.link(message);
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
