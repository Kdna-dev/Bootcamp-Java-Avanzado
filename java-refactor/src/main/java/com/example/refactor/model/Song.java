package com.example.refactor.model;

import java.util.List;

public class Song {

    private String id;
    private String name;
    private boolean explicit;
    private String playable;
    private int popularity;
    private Album album;
    private List<Artist> artists;

    private Song(SongBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.explicit = builder.explicit;
        this.playable = builder.playable;
        this.popularity = builder.popularity;
        this.album = builder.album;
        this.artists = builder.artists;
    }

    public static class SongBuilder {
        private String id;
        private String name;
        private boolean explicit;
        private String playable;
        private int popularity;
        private Album album;
        private List<Artist> artists;

        public SongBuilder id(String id) {
            this.id = id;
            return this;
        }
        public SongBuilder name(String name) {
            this.name = name;
            return this;
        }
        public SongBuilder explicit(boolean explicit) {
            this.explicit = explicit;
            return this;
        }
        public SongBuilder playable(String playable) {
            this.playable = playable;
            return this;
        }
        public SongBuilder popularity(int popularity) {
            this.popularity = popularity;
            return this;
        }
        public SongBuilder album(Album album) {
            this.album = album;
            return this;
        }
        public SongBuilder artist(List<Artist> artists) {
            this.artists = artists;
            return this;
        }
        public Song build() {
            return new Song(this);
        }
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public boolean isExplicit() { return explicit; }
    public String getPlayable() { return playable; }
    public int getPopularity() { return popularity; }
    public Album getAlbum() { return album; }
    public List<Artist> getArtist() { return artists; }

    public String getArtistsNames() {
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < artists.size(); i++) {
            names.append(artists.get(i).getName());
            if (i != artists.size() - 1) {
                names.append(", ");
            }
        }
        return names.toString();
    }
}
