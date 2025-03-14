package org.example.caseStudy.task4;

import java.util.Arrays;

public class MediaPlayerDemo {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        SubtitleInfo subtitleInfoEnglish = SubtitleInfo.builder()
                .subtitle(Arrays.asList("akjsd","alsd"))
                .language(Language.ENGLISH).build();
        SubtitleStrategy subtitleStrategy = new MultiLanguageSubtitleStrategy(Arrays.asList(subtitleInfoEnglish));
        VideoFile videoFile = new VideoFile("coutry road", "country/road", subtitleStrategy);
        mediaPlayer.loadMedia(videoFile);
        mediaPlayer.play();
        mediaPlayer.pause();
        videoFile.getSubtitleStrategy().enableSubtitles();
        mediaPlayer.play();
        mediaPlayer.stop();
    }
}
