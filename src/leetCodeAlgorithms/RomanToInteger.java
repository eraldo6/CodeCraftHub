package leetCodeAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanToDecimalMap = new HashMap<>();

        romanToDecimalMap.put('I', 1);
        romanToDecimalMap.put('V', 5);
        romanToDecimalMap.put('X', 10);
        romanToDecimalMap.put('L', 50);
        romanToDecimalMap.put('C', 100);
        romanToDecimalMap.put('D', 500);
        romanToDecimalMap.put('M', 1000);

        int result = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            int num1 = romanToDecimalMap.get(s.charAt(i));
            if (i > 0) {
                int num2 = romanToDecimalMap.get(s.charAt(i - 1));
                if (num2 < num1) {
                    result += num1 - num2;
                    i -= 2;
                } else {
                    result += num1;
                    i--;
                }
            } else {
                result += num1;
                i--;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.printf("result" + romanToInt("MCMXCIV"));
    }
}
