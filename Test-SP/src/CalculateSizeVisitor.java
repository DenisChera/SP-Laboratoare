
public class CalculateSizeVisitor implements Visitor{
	private int playlistTotalSize=0;
    private int videoTotalSize=0;
    private int songTotalSize=0;
    private int gifTotalSize=0;
	@Override
	public int visitPlaylist(Playlist p) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int visitVideoclip(Videoclip v) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int visitGif(Gif g) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int visitMelodie(Melodii m) {
		// TODO Auto-generated method stub
		return 0;
	}

    


}
