import java.util.Scanner;

public class Objective9Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selection;

		while(true) {
			printName();
			selection = scanner.nextInt();
			switch (selection) {
			case 1:
				System.out.println("Hello Friend");
				printName();
				break;
			case 2:
				System.out.println("Brocolli, Bread, Butter");
				printName();
				break;
			case 3:
				System.out.println("Adios");
				printName();
				scanner.close();
				break;
			}
			
		}

		
	}

	public static void printName() {
		System.out.println("_____Menu_____");
		System.out.println("1: Say Hello");
		System.out.println("2: List My favorite foods");
		System.out.println("3: Exit");
		System.out.println();
	}
}