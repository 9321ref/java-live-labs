package week19;

import java.util.LinkedList;
import java.util.List;

public class MusicLibrary {

    private List<Playlist> musicLibrary;

    public MusicLibrary() {
        this.musicLibrary = new  LinkedList<>();
    }

    public void addPlayList(Playlist playlist) {
        musicLibrary.add(playlist);
    }

    public void removePlayList(String name) {
//        for(Playlist each : musicLibrary) {
//            if(each.getName().equals(name)) {
//                musicLibrary.remove(each);
//            }
        //Opt2:
            musicLibrary.removeIf(each -> each.getName().equals(name));

        }

    public void displayMusicLibrary(){
        for(Playlist each : musicLibrary) {
            each.displayPlayList();
        }





    }
}
