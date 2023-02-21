package fr.aelion.helpers;

import fr.aelion.models.course.Author;
import fr.aelion.models.course.Media;
import fr.aelion.models.course.Slide;
import fr.aelion.models.course.Video;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MediaBuilderTest {

    private MediaBuilder mediaBuilder = new MediaBuilder();
    private MediaBuilder mediaBadBuilder = new MediaBuilder();
    @BeforeEach
    void setUp() {
        mediaBuilder.setMediaType("slide");
        mediaBuilder.title("Test").author(new Author()).summary("Test").duration(Float.valueOf(1F));

        mediaBadBuilder.setMediaType("");
        mediaBadBuilder.author(new Author()).summary("Fail test");

    }

    @Test
    @DisplayName("test slide class")
    void buildTest() {
        assertTrue(mediaBuilder.build().get() instanceof Slide);
    }

    @Test
    @DisplayName("test attributes")
    void attributesTest() {
        assertAll(()->assertEquals("Test", mediaBuilder.build().get().getTitle()),
                ()->assertTrue(mediaBuilder.build().get().getAuthor() instanceof Author),
                ()->assertEquals("Test", mediaBuilder.build().get().getSummary()),
                ()->assertEquals(Float.valueOf(1F), mediaBuilder.build().get().getDuration())
                );
    }

    @Test
    @DisplayName("fail test build")
    void buildFailTest() {
        assertAll(()-> assertTrue(mediaBadBuilder.build() instanceof Optional<Media>),
                ()-> assertTrue(mediaBadBuilder.build().isEmpty()));
    }
}