package fr.aelion.helpers;

import fr.aelion.models.course.Author;
import fr.aelion.models.course.Media;
import fr.aelion.models.course.Slide;
import fr.aelion.models.course.Video;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediaBuilderTest {

    private MediaBuilder mediaBuilder = new MediaBuilder();
    @BeforeEach
    void setUp() {
        mediaBuilder.setMediaType("slide");
        mediaBuilder.title("Test").author(new Author()).summary("Test").duration(Float.valueOf(1F));

    }

    @Test
    @DisplayName("test slide class")
    void buildTest() {
        assertTrue(mediaBuilder.build().get() instanceof Slide);
    }

    @Test
    @DisplayName("test attributes")
    void attributesTest() {
        Media media = mediaBuilder.build().get();
        assertAll(()->assertEquals("Test", media.getTitle()),
                ()->assertTrue(media.getAuthor() instanceof Author),
                ()->assertEquals("Test", media.getSummary()),
                ()->assertEquals(Float.valueOf(1F), media.getDuration())
                );
    }
}