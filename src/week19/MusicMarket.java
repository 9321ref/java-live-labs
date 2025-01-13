package week19;

import java.time.LocalTime;

public class MusicMarket {
    public static void main(String[] args) {
        Song song1 = new Song("Song 1", "Artist 1", "Genre 1", 2000, LocalTime.of(0,3));
        Song song2 = new Song("Song 2", "Artist 2", "Genre 2", 2001, LocalTime.of(0,4));
        Song song3 = new Song("Song 3", "Artist 3", "Genre 3", 2002, LocalTime.of(0,5));
        Song song4 = new Song("Song 4", "Artist 4", "Genre 4", 2003, LocalTime.of(0,6));

        System.out.println("song1 = " + song1);
        System.out.println("song2 = " + song2);
        System.out.println("song3 = " + song3);
        System.out.println("--------------------------------------------------");

        Playlist playlist1 = new Playlist("PlayList 1");
        playlist1.addSong(song1);
        playlist1.addSong(song2);
        playlist1.displayPlayList();

        System.out.println("---------------------------------------------------");

        playlist1.addSong(song3);
        playlist1.addSong(song4);
        playlist1.displayPlayList();

        playlist1.removeSong("Song 4");
        playlist1.displayPlayList();
        System.out.println("---------------------------------------------------");


        System.out.println("----------------------------------------------------");

        Playlist playlist2 = new Playlist("PlayList2");
        playlist2.addSong(song1);
        playlist2.addSong(song2);
        playlist2.addSong(song3);

        playlist2.displayPlayList();

        System.out.println("---------------------------------------------------");

        MusicLibrary refMusicLibrary = new MusicLibrary();
        refMusicLibrary.addPlayList(playlist1);
        System.out.println("Arthur Music Library");
        refMusicLibrary.displayMusicLibrary();

        System.out.println("---------------------------------------------------");









    }
}
