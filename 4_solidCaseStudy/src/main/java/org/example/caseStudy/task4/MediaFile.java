package org.example.caseStudy.task4;

public abstract class MediaFile {
    protected String filename;
    protected String filepath;
    protected PlaybackStatus playbackStatus;
    public MediaFile(String filename, String filepath){
        this.filename =  filename;
        this.filepath = filepath;
        playbackStatus = PlaybackStatus.STOPPED;
    }

    protected abstract void play();
    protected abstract void pause();
    protected abstract void stop();
}
