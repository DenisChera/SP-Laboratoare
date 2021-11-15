
public interface Visitor {
    int visitPlaylist(Playlist p);
    int visitVideoclip(Videoclip v);
    int visitGif(Gif g);
    int visitMelodie(Melodii m);

}