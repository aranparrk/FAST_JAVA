package ch18;

public class Company {

    // 2. 유일한 객체
    private static Company instance = new Company();

    // 1. 외부에서 마음대로 new 할 수 없도록 private 생성자 만들기
    private Company() {

    }

    // 3. 외부에서 접근할 수 있는 메소드 static 필수 사용
    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }

}
