package org.example.caseStudy.task4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AudioFile extends MediaFile {

    private AudioFormat audioFormat;

    public AudioFile(String filename, String filepath, AudioFormat audioFormat) {
        super(filename, filepath);
        this.audioFormat = audioFormat;
    }

    @Override
    protected void play() {
        System.out.println("Playing audio file");
    }

    @Override
    protected void pause() {
        System.out.println("Paused audio file");
    }

    @Override
    protected void stop() {
        System.out.println("Stopped media file");
    }

}
