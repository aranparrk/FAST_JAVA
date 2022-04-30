package ch05;

import ch04.Student;

public class StudentTest {

    public static void main(String[] args) {

        // 인스턴스
        // studentLee : 참조변수
        ch04.Student studentLee = new ch04.Student();

        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남구";
        studentLee.showStudentInfo();

        // 인스턴스
        ch04.Student studentKim = new Student();

        studentKim.studentID = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 성남시";
        studentKim.showStudentInfo();

        // heap jvm이 주는 가상 주소값 출력, 참조값
        System.out.println(studentKim);
        System.out.println(studentLee);
    }

}
