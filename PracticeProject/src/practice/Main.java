package practice;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		int c=0;
		String o="0";
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number between 1-4: ");
		c = keyboard.nextInt();
		if (c <= 4){
			switch (c) {
			case 1:
				o = "one";
				break;
			case 2:
				o = "two";
				break;
			case 3:
				o = "three";
				break;
			case 4:
				o = "four";
				break;
			}
			System.out.println(o);
		} else {
			System.out.println("Number is not between 1-4");
		}
		keyboard.close();
		
	}
}
