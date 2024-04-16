package example02;

import java.util.Scanner;

public class MaxMinTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];


        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 + "번째 숫자를 입력해주세요 ");
            num[i] = sc.nextInt();
        }


        int maxNum = num[0];
        int minNum = num[0];

        for (int i = 1; i < num.length; i++) {
            if (maxNum < num[i]) {
                maxNum = num[i];
            }
            if (minNum > num[i]) {
                minNum = num[i];
            }
        }

        System.out.println("가장 큰 수는: " + maxNum);
        System.out.println("가장 작은 수는: " + minNum);

    }
}
