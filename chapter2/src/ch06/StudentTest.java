package ch06;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student();

        // 멤버변수는 자동으로 초기화가 된다는 것을 알 수 있다.
        System.out.println(studentLee.showStudentInfo());

        Student studentKim = new Student(12345, "Kim", 3);
        System.out.println(studentKim.showStudentInfo());

    }

}
