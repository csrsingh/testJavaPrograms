package firstProgram;
import java.util.Scanner;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		int x=30;
		int y=20;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the day: ");
		String day = scanner.nextLine();
		//int z=Math.max(x, y);
		//System.out.println(z);		
		switch(day) {
		case "sunday" : System.out.println("this is sunday");
		break;
		case "monday" : System.out.println("this is monday");
		break;
		case "tuesday" : System.out.println("this is tuesday");
		break;
		default : System.out.println("invalida day!");
		}		
	}
}
