package ch19;

public class ForTest {

    public static void main(String[] args) {

        int count = 1;
        int sum = 0;

        // 횟수를 반복할 때 유용
        for(int i = 0; i < 10; i++, count++) {
            sum += count;
        }

        System.out.println("for문 : " + sum);

        int num = 1;
        int total = 0;

        // true, false를 이용할 때 유용
        while(num <= 10) {
            total += num;
            num++;
        }

        System.out.println("while문 : " + total);

    }

}
