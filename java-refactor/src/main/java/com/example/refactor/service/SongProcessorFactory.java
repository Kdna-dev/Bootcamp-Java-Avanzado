package com.example.refactor.service;

import com.example.refactor.model.StreamingsEnum;

public class SongProcessorFactory {
    public SongProcessor selectStreamingMethod(StreamingsEnum streamingsEnum) {
        switch (streamingsEnum) {
            case SPOTIFY:
                return new SpotifySongProcessor();
            case YOUTUBE:
                return new YoutubeSongProcessor();
            case SOUNDCLOUD:
                return new SoundcloudSongProcessor();
            default:
                return null;
        }
    }
}
