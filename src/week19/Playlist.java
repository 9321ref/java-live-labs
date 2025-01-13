package week19;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Playlist {

    private String name;
    private Map<String,Song> songs;

    public Playlist(String name) {
        setName(name);
        this.songs = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Song> getSongs() {
        return songs;
    }

    public void addSong (Song song){
        songs.put(song.getTitle(),song);
    }

    public void removeSong(String title) {
        songs.remove(title);
        if(songs.containsKey(title)) {
            songs.remove(title);
        }else{
            System.err.println(title+ " cannot be found in the playlist!");
        }
    }

    public void displayPlayList(){
        for(Song each : songs.values()) {
            System.out.println(name + each);
        }
        System.out.println();

    }

}
