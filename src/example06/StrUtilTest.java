package example06;

public class StrUtilTest {
    public static void main(String[] args) {
        StringUtil su = new StringUtil();
        String str1 = "hello";
        String str2 = "world";
        String str3 = "happy";
        String check = "el";
        char c = 'w';

        System.out.println("원하는 결과값: olleh / 실행 결과값: " + su.reverse(str1));
        System.out.println("원하는 결과값: helloworld / 실행 결과값: " + su.concat(str1,str2));
        System.out.println("원하는 결과값: false / 실행 결과값: " + su.contains(str1,c));
        System.out.println("원하는 결과값: true / 실행 결과값: " + su.contains(str2,c));
        System.out.println("원하는 결과값: helloworldhappy / 실행 결과값: " + su.concat(str1,str2,str3));
        System.out.println("원하는 결과값: true / 실행 결과값: " + su.contains(check,str1));
        System.out.println("원하는 결과값: false / 실행 결과값: " + su.contains(check,str2));
    }

    public static class StringUtil {
        public String reverse (String str)  {
            String ans = "";
            for (int i = str.length() -1; i >= 0; i--) {
                ans += str.charAt(i);
            }
            return ans;
        }

        public String concat(String str1, String str2) {
            return str1 + str2;
        }

        public boolean contains(String str, char c) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    return true;
                }
            }
            return false;
        }

        public String concat(String str1, String str2, String str3) {
            return str1 + str2 + str3;
        }

        public boolean contains(String str1, String str2) {
            int strIndex = str2.indexOf(str1);
            if (strIndex == -1) {
                return false;
            }
            return true;
        }


//        public boolean contains(String str1, String str2) {
//            for (int i = 0; i <= str2.length() - str1.length(); i++) {
//                if (str2.substring(i,str1.length() + i).equals(str1)) {
//                    return true;
//                }
//            }
//            return false;
//        }
    }
}
