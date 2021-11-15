
public class Melodii extends Categorii{
	private Url url;
	public Melodii(int dimensiune, String titlu, Url url) {
		super(dimensiune, titlu);
		// TODO Auto-generated constructor stub
		this.url = url;
	}
	
	public Url getUrl() {
		return url;
	}

	public void setUrl(Url url) {
		this.url = url;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		String message = "www.music.com, melodia " + this.getTitlu() + " de " + this.getDimensiune() + " kb ";
		
		this.url.link(message);
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}
	
}
