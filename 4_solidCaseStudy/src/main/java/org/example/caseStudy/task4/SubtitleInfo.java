package org.example.caseStudy.task4;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class SubtitleInfo {
    private Language language;
    private List<String> subtitle;
}
