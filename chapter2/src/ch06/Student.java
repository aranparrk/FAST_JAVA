package ch06;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;

    public Student() {
        System.out.println("기본 생성자 호출");
    }

    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;

        System.out.println("매개변수가 있는 생성자 호출");
    }
    public String showStudentInfo() {
        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
    }

}
