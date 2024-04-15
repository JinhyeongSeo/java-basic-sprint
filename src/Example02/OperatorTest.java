package Example02;

import java.util.Scanner;

public class OperatorTest {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        sc.nextLine();
        double num2 = sc.nextDouble();


        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        if (num2 == 0) {
            System.out.println("계산이 불가능 합니다");
            return;
        }
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

    }
}
