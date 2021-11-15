import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playlist playlistMare = new Playlist("Playlist1");
		ArrayList<Element> elements = new ArrayList<Element>();
		Playlist playlistNou = new Playlist("Alt playlist");
		Melodii melodie1 = new Melodii(200, "Bad Habits", new DescarcareMelodie());
		Videoclip video1 = new Videoclip(543, "Me at the zoo", new DescarcareVideo());
		Gif gif1 = new Gif(37, "haha", new DescarcareGif());
		
		playlistNou.add(gif1);
		playlistNou.add(melodie1);
		playlistNou.add(video1);
		
		playlistMare.add(playlistNou);
		playlistMare.print();
	}

}
