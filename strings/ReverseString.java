package strings;

import java.util.Arrays;

public class ReverseString {


    private String reverse(String str) {
        char[] charArr = str.toCharArray();
        char[] reversedString = new char[str.length()];
        int strLength = charArr.length;

        for (int i = strLength - 1, j = 0; i >= 0; i--, j++) {
            reversedString[j] = charArr[i];
        }

        return Arrays.toString(reversedString);
    }

    private String reverse2(String str) {
        char[] charArr = str.toCharArray();
        StringBuilder reversedString = new StringBuilder();
        int strLength = charArr.length;

        for (int i = strLength - 1, j = 0; i >= 0; i--, j++) {
            reversedString.append(charArr[i]);
        }

        return reversedString.toString();
    }
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse2("hello"));
        System.out.println(reverseString.reverse2("Jean"));
        System.out.println(reverseString.reverse2("Java"));
    }
}
