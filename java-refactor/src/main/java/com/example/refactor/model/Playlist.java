package com.example.refactor.model;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Playlist {

    private static final Logger LOGGER = LoggerFactory.getLogger(Playlist.class);

    private List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getList(){
        return songs;
    }

    public void printSongs() {
        songs.stream()
            .forEach(song -> LOGGER.info(
                """
                    Song Details:
                    ID: {}
                    Name: {}
                    Artist: {}
                    Album: {}
                    Release Date: {}
                """,
                song.getId(),
                song.getName(),
                song.getArtistsNames(),
                song.getAlbum().getName(),
                song.getAlbum().getReleaseDate())
            );
    }

}
