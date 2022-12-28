import java.util.Scanner;

public class Objective7Lab5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selection;

	while(true) {
		System.out.println("_____Menu_____");
		System.out.println("1: Say Hello");
		System.out.println("2: List My Favorite foods");
		System.out.println("3: Exit");
		System.out.println();

		selection = scanner.nextInt();

		switch (selection) {
		case 1: 
			System.out.println("Hello World!");
			break;
		case 2:
			System.out.println("Olives, Grapes, Steak");
			break;
		case 3: 
			break;
		}
		scanner.close();
		}

		//can I change how this loops, how?
		}
}