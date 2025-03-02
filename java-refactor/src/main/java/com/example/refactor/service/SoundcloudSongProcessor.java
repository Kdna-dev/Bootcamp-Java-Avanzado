package com.example.refactor.service;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.example.refactor.model.Album;
import com.example.refactor.model.Artist;
import com.example.refactor.model.Song;

public class SoundcloudSongProcessor implements SongProcessor {

    @Override
    public void processSongs() {
        throw new UnsupportedOperationException("Unimplemented method 'processSongs'");
    }

    @Override
    public JSONArray getJsonPlaylist() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getJsonPlaylist'");
    }

    @Override
    public Song extractSongInfo(Object item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'extractSongInfo'");
    }

    @Override
    public Song getTrackInfo(JSONObject trackJSON, JSONObject albumJSON, JSONArray artistsJSON) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTrackInfo'");
    }

    @Override
    public List<Artist> getArtistsInfo(JSONArray artistsJSON) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArtistInfo'");
    }

    @Override
    public Album getAlbumInfo(JSONObject albumJSON) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAlbumInfo'");
    }

}
