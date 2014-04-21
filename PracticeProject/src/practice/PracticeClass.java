package practice;
import java.util.*;
public class PracticeClass {

	
	
	public static void main(String []args) {
		int a = 0, b = 0, c = 0;
		String d = "0";
		Scanner keyboard = new Scanner(System.in);
		a = (int) (Math.random() * 100);
		b = (int) (Math.random() * 100);
		System.out.print("What is: " + a + "*" + b + " = ");
		c = keyboard.nextInt();
		d = (c == a*b) ? "Correct!" : "Better luck next time!";
		System.out.println(d);
		keyboard.close();
	}
		
}
