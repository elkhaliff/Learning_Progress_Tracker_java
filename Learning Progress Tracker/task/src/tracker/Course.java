package tracker;

import java.util.HashSet;
import java.util.Set;

public class Course {
    String name;
    int numberOfPoints;

    int activity, score;
    Set<Integer> students;

    public Course(String name, int numberOfPoints) {
        this.name = name;
        this.numberOfPoints = numberOfPoints;
        students = new HashSet<>();
        activity = 0;
        score = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public int getPopular() {
        return students.size();
    }

    public int getActivity() {
        return activity;
    }

    public double getScore() {
        return (double)score / (double)activity;
    }

    public void setPopular(int studentId) {
        students.add(studentId);
    }

    public void incActivity() {
        activity++;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public void addScore(int idStudent, int score) {
        if (score > 0) {
            setPopular(idStudent);
            incActivity();
            setScore(score);
        }
    }
}
