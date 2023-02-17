package fr.aelion.repo;

import fr.aelion.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
     private List<Student> students = new ArrayList<>();

    public StudentRepo() {
        populate();
    }

    public int size(){return students.size();}

    private void populate(){
        Student Ok = new Student("ok","bok","o@p");
        Ok.setUsername("a");
        Ok.setPassword("b");
        students.add(Ok);
        Ok = new Student("ok2","bok2","o2@p");
        Ok.setUsername("Bond");
        Ok.setPassword("007");
        students.add(Ok);
    }

    public Student findByLogAndPwd(String Log, String Pwd){
        for (Student stud : this.students){
            if (stud.getUsername().equals(Log)&&stud.getPassword().equals(Pwd)){

            return stud;
            }
        }
        return null;

    }

}
