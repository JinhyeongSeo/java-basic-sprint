package Example04;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {3,1,2,5,4};
        int maxNum = arr[0];
        int minNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
            if (minNum > arr[i]) {
                minNum = arr[i];
            }
        }

        System.out.println("최댓값은 : " + maxNum);
        System.out.println("최솟값은 : " + minNum);

    }
}
