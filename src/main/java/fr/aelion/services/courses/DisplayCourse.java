package fr.aelion.services.courses;

import fr.aelion.repositories.course.Course;

import java.util.stream.Collectors;

public class DisplayCourse {
    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }
    public String display(){
        String output = ("Course :"+course.getTitle() +"\n");
        output = output.concat(course.getMedias().stream().map(media -> (media.getTitle() + "\n")).collect(Collectors.joining()));
        return output;
    }

}
