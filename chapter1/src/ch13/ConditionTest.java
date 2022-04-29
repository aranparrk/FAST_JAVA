package ch13;

import java.util.Scanner;

public class ConditionTest {

    public static void main(String[] args) {
        int max;
        System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요.\n");
        // 입출력 (I/O) : stream 사용
        // System.in : 표준 입력
        // Scanner 객체는 자바에서 제공 된다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 1 : ");
        int num1 = scanner.nextInt();
        System.out.println("입력 2 : ");
        int num2 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        System.out.println("값 : " + max);
    }

}
