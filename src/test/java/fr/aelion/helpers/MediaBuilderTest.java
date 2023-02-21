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
    void buildTest() throws Exception {
        try {
            assertTrue(mediaBuilder.build() instanceof Slide);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Test
    @DisplayName("test attributes")
    void attributesTest() throws Exception {
        try {
        assertAll(()->assertEquals("Test", mediaBuilder.build().getTitle()),
                ()->assertTrue(mediaBuilder.build().getAuthor() instanceof Author),
                ()->assertEquals("Test", mediaBuilder.build().getSummary()),
                ()->assertEquals(Float.valueOf(1F), mediaBuilder.build().getDuration())
                );
    } catch (Exception e) {
        throw new Exception(e);
    }
    }

    @Test
    @DisplayName("Missing attribute test")
    void missingAttributesTest(){
        assertAll(()-> assertThrows(Exception.class,()->mediaBadBuilder.build())
                /*,()-> assertTrue(mediaBadBuilder.build().isEmpty())*/);
    }

    @Test
    @DisplayName("Missing Type test")
    void missingTypeTest(){
        mediaBadBuilder.setMediaType(null);
        assertAll(()-> assertThrows(Exception.class,()->mediaBadBuilder.build())
                /*,()-> assertTrue(mediaBadBuilder.build().isEmpty())*/);
    }
}