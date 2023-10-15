package exam;
import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        int result = romanToInt(romanNumeral);
        System.out.println("Integer representation: " + result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && romanToInt.get(s.charAt(i)) > romanToInt.get(s.charAt(i - 1))) {
                result += romanToInt.get(s.charAt(i)) - 2 * romanToInt.get(s.charAt(i - 1));
            } else {
                result += romanToInt.get(s.charAt(i));
            }
        }
        return result;
    }


}
