import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Entrez une phrase :");
		String str = scan.nextLine();
		str = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(isPalindrome(str) ? "C'est un palindrome" : "Ce n'est pas un palindrome");
	}

	public static boolean isPalindrome(String phrase) {
		int a = 0;
		int b = phrase.length() - 1;
		while (a < b) {
			if (phrase.substring(a, a + 1).equals(phrase.substring(b, b + 1))) {
				a++;
				b--;
			} else {
				return false;
			}
		}
		return true;
	}

}
