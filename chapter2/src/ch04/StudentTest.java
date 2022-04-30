package ch04;

public class StudentTest {

    public static void main(String[] args) {

        // 인스턴스
        // studentLee : 참조변수
        Student studentLee = new Student();

        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남구";
        studentLee.showStudentInfo();

        // 인스턴스
        Student studentKim = new Student();

        studentKim.studentID = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 성남시";
        studentKim.showStudentInfo();

    }

}
