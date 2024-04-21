package StringManipulation;

import java.util.HashSet;
import java.util.Set;

public class StringUtils {
    /* count vowels */
    public static int countVowels(String str) {
        if (str == null) {
            return 0;
        }

        int count = 0;
        String vowels = "aeiou";

        for (var ch : str.toLowerCase().toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }

    /* reverse the string */
    public static String reverseTheString(String str) {
        if (str == null) {
            return "";
        }

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    /* reverse the sentense */
    public static String reverseTheSentense(String sentence) {
        if (sentence == null) {
            return "";
        }

        String reversed = "";

        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }

        return reversed.trim();
    }

    /* string1 is rotation of string2 */
    public static boolean rotationOfStringisEqual(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        return str1.length() == str2.length() && (str1 + str2).contains(str2);
    }

    /* right rotate the string a k times */
    public static String rotateStringKTimes(String str, int k) {
        if (str == null) {
            throw new IllegalArgumentException();
        }

        int rotation = k % str.length();

        if (k == 0 || rotation == 0) {
            return str;
        }

        char[] ch = str.toCharArray();
        int size = ch.length;

        for (int i = 1; i <= rotation; i++) {

            char last = ch[size - 1];

            for (int j = size - 1; j > 0; j--) {
                ch[j] = ch[j - 1];
            }

            ch[0] = last;
        }

        String rotatedString = String.valueOf(ch);

        return rotatedString;
    }

    /* remove duplicates in the string */
    public static String removeDuplicates(String str) {
        if (str == null) {
            return "";
        }

        Set<Character> seen = new HashSet<>();
        StringBuffer resultString = new StringBuffer();
        for (var ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                resultString.append(ch);
            }
        }

        return resultString.toString();
    }

    /* most repeated character in string */
    public static char mostRepeatedChar(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }

        final int ASCII_SIZE = 256;
        int[] arr = new int[ASCII_SIZE];

        for (var ch : str.toCharArray()) {
            arr[ch]++;
        }

        int max = 0;
        char result = ' ';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char) i;
            }
        }

        return result;
    }

    /* sentense capitalization */
    public static String capitalize(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }

        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            result += words[i].substring(0, 1).toUpperCase()
                    + words[i].substring(1).toLowerCase() + " ";
        }

        return result.trim();
    }

    /* anagram */
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        final int ALPHABETS = 26;
        int[] arr = new int[ALPHABETS];

        String string1 = str1.toLowerCase();
        String string2 = str2.toLowerCase();

        for (int i = 0; i < string1.length(); i++) {
            int index = string1.charAt(i) - 'a';
            arr[index]++;
        }

        for (int i = 0; i < string2.length(); i++) {
            var index = string2.charAt(i) - 'a';
            if (arr[index] == 0) {
                return false;
            }
            arr[index]--;
        }

        return true;
    }

    /* palindrome */
    public static boolean isPalindrome(String str) {
        if (str == null || str == "") {
            throw new IllegalArgumentException();
        }

        char[] string = str.toLowerCase().toCharArray();
        int first = string[0];
        int last = string[string.length - 1];

        while (first < last) {
            if (first != last) {
                return false;
            }
            first++;
            last--;
        }

        return true;
    }

    /* reverse a number (number is palindrome) */
    public static boolean isPalindrome(int nums) {
        int res = reverseTheNumber(nums);

        if(res == nums){
            return true;
        }

        return false;
    }

    public static int reverseTheNumber(int nums) {
        int reversed = 0;
        
        while (nums != 0) {
            int digit = nums % 10;
            reversed = reversed * 10 + digit;
            nums /= 10;
        }
        
        return reversed;
    }
}
