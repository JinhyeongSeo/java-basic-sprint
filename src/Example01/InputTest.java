package Example01;

import java.util.Scanner;

public class InputTest {


    public static void main(String[] args) {
        String num = "0123456789";
        Scanner sc = new Scanner(System.in);

        System.out.println("이름과 나이를 입력해주세요");
        String ans = sc.nextLine();
        String[] arr = new String[2];
        arr = ans.split(" ");
        //arr[i]에 숫자가 있으면 멈춤

        if(isDigit(arr[0])) {
            System.out.println("이름에 숫자가 들어가면 안됩니다.");
            return;
        }

        if(!(isDigit(arr[1]))) {
            System.out.println("나이에 숫자가 들어가야 됩니다.");
            return;
        }

        System.out.println("이름: " + arr[0]);
        System.out.println("나이: " + arr[1]);
    }

    public static boolean isDigit(String str) {
        String digit = "0123456789";
        for (int i = 0; i < str.length(); i++) {
            if (digit.indexOf(str.charAt(i)) == -1) {
                return false;
            }
        }

        return true;
    }

}
