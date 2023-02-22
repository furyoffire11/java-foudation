package fr.aelion.run;

import fr.aelion.helpers.MediaBuilder;
import fr.aelion.models.course.*;
import fr.aelion.repositories.course.Course;
import fr.aelion.services.courses.DisplayCourse;

public class CourseRun {

    private Course course = new Course();

    public CourseRun(){
        course.setTitle("SQL");
        makeCourse();
    }

    private void makeCourse(){
        MediaBuilder mediaBuilder = new MediaBuilder();
        mediaBuilder.setMediaType("video");
        mediaBuilder
                .title("Create table")
                .summary("create une table")
                .duration(5.35F)
                .author(new Author());
        try {
            this.course.addMedia(mediaBuilder.build());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        mediaBuilder.setMediaType("slide");
        mediaBuilder
                .title("Alter table")
                .summary("alter une table")
                .duration(3.30F)
                .author(new Author());
        try {
            this.course.addMedia(mediaBuilder.build());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        mediaBuilder.setMediaType("document");
        mediaBuilder
                .title("Drop table")
                .summary("drop une table")
                .duration(1.10F)
                .author(new Author());
        try {
            this.course.addMedia(mediaBuilder.build());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        MediaBuilder badBuilder = new MediaBuilder();
        badBuilder
                .title("Bad table")
                .duration(1.00F);
        try {
            this.course.addMedia(badBuilder.build());
        } catch (Exception e) {
            System.out.println(e+"\n");
        }
    }

    public void run(){
        DisplayCourse displayCourse = new DisplayCourse();
        displayCourse.setCourse(this.course);
        System.out.println(displayCourse.display());
    }
}
