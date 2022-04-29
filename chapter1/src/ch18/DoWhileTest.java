package ch18;

import java.util.Scanner;

public class DoWhileTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;

        input = scanner.nextInt();

        System.out.println("----while----");
        while(input != 0) {
            sum += input;
            input = scanner.nextInt();
        }

        System.out.println("----do_while----");
        do {
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);
            System.out.println(sum);

        System.out.println(sum);

    }

}
