package fr.aelion.helpers;

import fr.aelion.models.course.Author;
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
        assertTrue(mediaBuilder.build() instanceof Slide);
    }

    @Test
    @DisplayName("test attributes")
    void attributesTest() {
        assertAll(()->assertEquals("Test",mediaBuilder.build().getTitle()),
                ()->assertTrue(mediaBuilder.build().getAuthor() instanceof Author),
                ()->assertEquals("Test",mediaBuilder.build().getSummary()),
                ()->assertEquals(Float.valueOf(1F),mediaBuilder.build().getDuration())
                );
    }
}