package org.example.caseStudy.task4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VideoFile extends MediaFile {
    private SubtitleStrategy subtitleStrategy;

    public VideoFile(String filename, String filepath, SubtitleStrategy subtitleStrategy) {
        super(filename, filepath);
        this.subtitleStrategy = subtitleStrategy;
    }


    @Override
    public void play() {
        if (subtitleStrategy.areSubtitlesEnabled()) {
            System.out.println("Play with subtitle");
        } else {
            System.out.println("Play without subtitle.");
        }
    }

    @Override
    protected void pause() {
        playbackStatus = PlaybackStatus.PAUSED;
        System.out.println("Playing pauseed");
    }

    @Override
    protected void stop() {
        playbackStatus = PlaybackStatus.STOPPED;
        System.out.println("Playing stopped");
    }
}
