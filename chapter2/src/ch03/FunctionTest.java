package ch03;

public class FunctionTest {

    // 매개변수 있음, 반환 있음
    public static int addNum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    // 매개변수 있음, 반환 없음
    // void : 반환값이 없을 때
    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    // 매개변수 없음, 반환 있음
    public static int calcSum(){
        int sum = 0;
        int i;

        for(i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        // 함수 호출 방법
        int total = addNum(n1, n2);
        System.out.println(total);

        sayHello("안녕하세요");

        total = calcSum();
        System.out.println(total);
    }

}
