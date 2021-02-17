

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC2 {
	
	public static void firstName() {
		System.out.println("Enter first Name");
		Scanner input = new Scanner(System.in);
		String entry = input.nextLine();
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2,}$");
		Matcher match = pattern.matcher(entry); 
		boolean patternValidity = match.matches();
			if (patternValidity == true) {
				System.out.println("your Entry is Valid");	
			}
			else {
				System.out.println("Your Entry is Invalid");
			}
	}
	
	public static void lastName() {
		System.out.println("Enter Last Name");
		Scanner input = new Scanner(System.in);
		String entry = input.nextLine();
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2,}$");
		Matcher match = pattern.matcher(entry); 
		boolean patternValidity = match.matches();
			if (patternValidity == true) {
				System.out.println("your Entry is Valid");	
			}
			else {
				System.out.println("Your Entry is Invalid");
			}
	}
		
	public static void main(String args[]) {
		firstName();
		lastName();
		}
}
