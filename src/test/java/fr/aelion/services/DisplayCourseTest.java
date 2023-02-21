package fr.aelion.services;

import fr.aelion.models.course.Media;
import fr.aelion.models.course.Slide;
import fr.aelion.repositories.course.Course;
import fr.aelion.services.courses.DisplayCourse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DisplayCourseTest {
    private DisplayCourse displayCourse = new DisplayCourse();

    private StringBuilder expected = new StringBuilder();

    @BeforeEach
    void setUp() {
        Course course = new Course();
        course.setTitle("Test");

        Media slide = new Slide();
        slide.setTitle("Slide test");

        course.addMedia(slide);
        displayCourse.setCourse(course);

        expected.append("Course :Test"+"\n").append("Slide test"+"\n");
    }

    @Test
    @DisplayName("display whole course")
    void display() {
        assertEquals(expected.toString(),displayCourse.display());
    }
}