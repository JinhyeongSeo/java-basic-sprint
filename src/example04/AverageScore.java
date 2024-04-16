package example04;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum/arr.length);
    }
}
