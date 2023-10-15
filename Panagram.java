package exam;
import java.util.*;
public class Panagram {
	public static String ispanagram( String str) {
        ArrayList<Character> uniqueChars = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char lowerCaseCh = Character.toLowerCase(ch);
            if (lowerCaseCh >= 'a' && lowerCaseCh <= 'z' && !uniqueChars.contains(lowerCaseCh)) {
                uniqueChars.add(lowerCaseCh); 
                count++; 
            }
        }
        if(count == 26) {
        	return "Given string is panagram";
        }
        else {
        	return "Given string is not panagram";
        }
    }

	public static void main(String[] args) {
		Scanner ss  = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = ss.nextLine();
		System.out.println(ispanagram(str));
		ss.close();
	}

}
