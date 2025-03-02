package com.example.refactor;

import com.example.refactor.model.StreamingsEnum;
import com.example.refactor.service.SongProcessor;
import com.example.refactor.service.SongProcessorFactory;

public class Solution {
    public static void main(String... args) {
        SongProcessorFactory factory = new SongProcessorFactory();
        SongProcessor streamingMethod = factory.selectStreamingMethod(StreamingsEnum.SPOTIFY);
        streamingMethod.processSongs();
    }
}
