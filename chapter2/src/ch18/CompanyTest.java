package ch18;

public class CompanyTest {

    public static void main(String[] args) {

        // static인 경우에 인스턴스 생성 방법
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);
    }

}
