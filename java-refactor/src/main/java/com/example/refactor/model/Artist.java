package com.example.refactor.model;

public class Artist {
    private String id;
    private String name;

    private Artist(ArtistBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public static class ArtistBuilder {
        private String id;
        private String name;

        public ArtistBuilder id(String id) {
            this.id = id;
            return this;
        }
        public ArtistBuilder name(String name) {
            this.name = name;
            return this;
        }
        public Artist build() {
            return new Artist(this);
        }
    }

    public String getId() { return id; }
    public String getName() { return name; }
}
