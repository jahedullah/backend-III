package org.example.caseStudy.task4;

public class MediaPlayer {
    private MediaFile mediaFile;

    public void play() {
        mediaFile.play();
    }

    public void pause() {
        mediaFile.pause();
    }

    public void stop() {
        mediaFile.stop();
    }

    public void loadMedia(MediaFile mediaFile) {
        this.mediaFile = mediaFile;
    }
}
