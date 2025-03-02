package com.example.refactor.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.example.refactor.model.Playlist;
import com.example.refactor.model.Song;
import com.example.refactor.model.Album;
import com.example.refactor.model.Artist;

public class SpotifySongProcessor implements SongProcessor {
    private String playlistKey = "refactorpractice.spotifyPlaylist.filename";

    @Override
    public void processSongs() {
        final Playlist spotifyPlayList = new Playlist();
        JSONArray items = getJsonPlaylist();

        for (Object item : items) {
            Song song = extractSongInfo(item);
            spotifyPlayList.addSong(song);
        }
        spotifyPlayList.printSongs();
    }

    @Override
    public JSONArray getJsonPlaylist() {
        final String playlistFileName = PropertyFactory.getProperties().getProperty(playlistKey);
        final InputStream inputSource = ExampleFileUtils.getFileFromResources(playlistFileName);
        final JSONObject playlist = ExampleFileUtils.getJsonFromFile(inputSource);
        return (JSONArray) playlist.get("items");
    }

    @Override
    public Song extractSongInfo(Object item) {
        JSONObject songJSON = (JSONObject) item;
        JSONObject trackJSON = (JSONObject) songJSON.get("track");
        JSONObject albumJSON = (JSONObject) trackJSON.get("album");
        JSONArray artistsJSON = (JSONArray) trackJSON.get("artists");

        return getTrackInfo(trackJSON, albumJSON, artistsJSON);
    }

    @Override
    public Song getTrackInfo(JSONObject trackJSON, JSONObject albumJSON, JSONArray artistsJSON) {
        return new Song.SongBuilder()
            .explicit(Boolean.parseBoolean(trackJSON.get("explicit").toString()))
            .id(trackJSON.get("id").toString())
            .playable(trackJSON.get("is_playable").toString())
            .name(trackJSON.get("name").toString())
            .popularity(Integer.parseInt(trackJSON.get("popularity").toString()))
            .album(getAlbumInfo(albumJSON))
            .artist(getArtistsInfo(artistsJSON))
            .build();
    }

    @Override
    public Album getAlbumInfo(JSONObject albumJSON) {
        return new Album.AlbumBuilder()
            .id(albumJSON.get("id").toString())
            .name(albumJSON.get("name").toString())
            .releaseDate(albumJSON.get("release_date").toString())
            .totalTracks(Integer.parseInt(albumJSON.get("total_tracks").toString()))
            .build();
    }

    @Override
    public List<Artist> getArtistsInfo(JSONArray artistsJSON) {
        List<Artist> artists = new ArrayList<>();
        for (Object element : artistsJSON) {
            JSONObject artistJSON = (JSONObject) element;
            artists.add(
                new Artist.ArtistBuilder()
                    .id(artistJSON.get("id").toString())
                    .name(artistJSON.get("name").toString())
                   .build()
            );
        }
        return artists;
    }
}
