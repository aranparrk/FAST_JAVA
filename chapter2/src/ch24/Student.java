package ch24;

import java.util.ArrayList;

public class Student {

    private int studentID;
    private String studentName;

    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentName = studentName;
        this.studentID = studentID;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int point) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(point);

        subjectList.add(subject);
    }

    public void showScoreInfo() {
        int total = 0;
        for(Subject subject : subjectList) {
            total += subject.getScorePoint();
            System.out.println(studentName + "학생의 " + subject.getName() + "의 점수는 " + subject.getScorePoint() + "점 입니다.");
        }
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }

}
