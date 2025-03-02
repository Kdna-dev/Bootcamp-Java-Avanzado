package com.example.refactor.model;

public class Album {
    private String id;
    private String type;
    private String name;
    private String releaseDate;
    private int totalTracks;

    private Album(AlbumBuilder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.name = builder.name;
        this.releaseDate = builder.releaseDate;
        this.totalTracks = builder.totalTracks;
    }

    public static class AlbumBuilder {
        private String id;
        private String type;
        private String name;
        private String releaseDate;
        private int totalTracks;

        public AlbumBuilder id(String id) {
            this.id = id;
            return this;
        }
        public AlbumBuilder type(String type) {
            this.type = type;
            return this;
        }
        public AlbumBuilder name(String name) {
            this.name = name;
            return this;
        }
        public AlbumBuilder releaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public AlbumBuilder totalTracks(int totalTracks) {
            this.totalTracks = totalTracks;
            return this;
        }
        public Album build() {
            return new Album(this);
        }
    }

    public String getId() { return id; }
    public String getType() { return type; }
    public String getName() { return name; }
    public String getReleaseDate() { return releaseDate; }
    public int getTotalTracks() { return totalTracks; }
}
