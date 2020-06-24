package string;

import java.util.Arrays;

/**
 * 1071. 字符串的最大公因子
 * 对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
 * 返回最长字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。
 */
public class String1071 {

    public static void main(String[] args) {

        String str1 = "ABCABC";
        String str2 = "ABC";

        String result = new String1071().gcdOfStrings(str1, str2);

        System.out.println("result:" + result);
    }



    public String gcdOfStrings(String str1, String str2) {
        String []tempArray = str1.split("");
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < tempArray.length; i++) {
            sb.append(tempArray[i]);
            if(str1.split(sb.toString()).length == 0 &&  str2.split(sb.toString()).length == 0 ) {
                return sb.toString();
            }
        }

        return "";
    }

}
