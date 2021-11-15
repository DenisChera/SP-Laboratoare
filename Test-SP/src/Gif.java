
public class Gif extends Categorii{

	private Url url;
	public Gif(int dimensiune, String titlu, Url url) {
		super(dimensiune, titlu);
		// TODO Auto-generated constructor stub
		this.url = url;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		String lnk = "www.gifs.com, gif-ul " + this.getTitlu() + " de " + this.getDimensiune() + " kb ";
		
		this.url.link(lnk);
		
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
