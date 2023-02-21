package fr.aelion.run;

import fr.aelion.models.course.Document;
import fr.aelion.models.course.Media;
import fr.aelion.models.course.Slide;
import fr.aelion.models.course.Video;
import fr.aelion.repositories.course.Course;
import fr.aelion.services.courses.DisplayCourse;

public class CourseRun {

    private Course course = new Course();

    public CourseRun(){
        course.setTitle("SQL");
        makeCourse();
    }

    private void makeCourse() {
        Media video = new Video();
        video.setTitle("Create table");

        Media slide = new Slide();
        slide.setTitle("Alter table");

        Media document = new Document();
        document.setTitle("Drop table");

        course.addMedia(video);
        course.addMedia(slide);
        course.addMedia(document);
    }

    public void run(){
        DisplayCourse displayCourse = new DisplayCourse();
        displayCourse.setCourse(this.course);
        System.out.println(displayCourse.display());
    }
}
