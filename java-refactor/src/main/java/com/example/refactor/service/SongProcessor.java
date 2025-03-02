package com.example.refactor.service;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.example.refactor.model.Album;
import com.example.refactor.model.Artist;
import com.example.refactor.model.Song;

public interface SongProcessor {

    public void processSongs();
    public JSONArray getJsonPlaylist();
    public Song extractSongInfo(Object item);
    public Song getTrackInfo(JSONObject trackJSON, JSONObject albumJSON, JSONArray artistsJSON);
    public Album getAlbumInfo(JSONObject albumJSON);
    public List<Artist> getArtistsInfo(JSONArray artistsJSON);
}
