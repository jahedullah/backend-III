package org.example.caseStudy.task4;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class MultiLanguageSubtitleStrategy implements SubtitleStrategy {
    private final List<SubtitleInfo> subtitles;

    @Getter
    private List<String> currentSubtitle;
    @Setter
    private Language currentLanguage;
    private boolean subtitlesEnabled;

    public MultiLanguageSubtitleStrategy(List<SubtitleInfo> subtitles) {
        this.subtitles = subtitles;
        this.currentLanguage = Language.ENGLISH;
        this.subtitlesEnabled = false;
    }

    @Override
    public void enableSubtitles() {
        subtitles.stream().filter(
                s -> s.getLanguage() == currentLanguage
        ).findFirst().ifPresent(
                s -> {
                    this.currentSubtitle = s.getSubtitle();
                    this.subtitlesEnabled = true;
                });
    }

    @Override
    public void disableSubtitles() {
        this.subtitlesEnabled = false;
    }

    @Override
    public boolean areSubtitlesEnabled() {
        return subtitlesEnabled;
    }

    public List<Language> getActiveLanguages() {
        return subtitles.stream()
                .map(SubtitleInfo::getLanguage)
                .distinct().toList();
    }
}
