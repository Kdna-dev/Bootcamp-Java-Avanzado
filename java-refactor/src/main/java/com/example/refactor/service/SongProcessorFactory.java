package com.example.refactor.service;

import com.example.refactor.model.StreamingsEnum;

public class SongProcessorFactory {
    public SongProcessor selectStreamingMethod(StreamingsEnum streamingsEnum) {
        return switch (streamingsEnum) {
            case SPOTIFY -> new SpotifySongProcessor();
            case YOUTUBE -> new YoutubeSongProcessor();
            case SOUNDCLOUD -> new SoundcloudSongProcessor();
            default -> throw new IllegalArgumentException("Unexpected value: " + streamingsEnum);
        };
    }
}
