import java.util.Scanner;


public class reverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string to reverse: ");
		String str = input.nextLine();
		System.out.println();
		reverseDisplay(str);
	}
	
	
	public static void reverseDisplay(String value) {
		
		// Base case
		if(value.length() == 0)
			return;
		
		System.out.print(value.charAt(value.length() - 1));
		reverseDisplay(value.substring(0, value.length() - 1));
		
	}
	
}