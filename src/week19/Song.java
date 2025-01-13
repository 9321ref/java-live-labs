package week19;

import java.time.LocalTime;

public class Song {

    private String title;
    private String artist;
    private String genre;
    private int releaseYear;
    private LocalTime duration;

    public Song(String title, String artist, String genre, int releaseYear, LocalTime duration) {
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setReleaseYear(releaseYear);
        setDuration(duration);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return
                "{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                ", duration=" + duration +
                '}';
    }
}
