package fr.aelion.models.course;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Course{
    private Set<Media> medias = new HashSet<>();
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addMedia(Media media) {
        this.medias.add(media);
    }

    public void removeMedia(Media media) {
        this.medias = this.medias.stream()
                .filter(m -> m.equals(media))
                .collect(Collectors.toSet());
    }
}
