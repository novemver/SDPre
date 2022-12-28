import java.util.Scanner;

public class Objective9Lab5 {
	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
				double num1, num2;
				boolean keepGoing = true;
				int choice;
				double answer = 0.0;

				System.out.println("Please give me a number: ");
				num1 = kb.nextInt();

				System.out.println("Please give me another number: ");
				num2 = kb.nextInt();

				while (keepGoing) {
					printMenu();
					System.out.println("Which would you like to do?");
					choice = kb.nextInt();

					switch (choice) {
					case 1: 
						 answer = findSum(num1, num2);
						System.out.println(num1 + " + " + num2 + " = " + answer);
						break;
					case 2:
						 answer = findAverage(num1, num2);
						System.out.println("The average of " + num1 + " and " + num2 + " is: " + answer);
						break;
					case 3: 
						 answer = calcTax(num1, num2);
						System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is " + answer);
						break;
					case 4:
						System.out.println("You've chose to quit");
						kb.close();
						break;
					default:
						System.out.println("Invalid entry. Please try again");

					}

					
				}
			}

				public static void printMenu() {
					System.out.println();
					System.out.println("========= MENU =========");
					System.out.println("|                      |");
					System.out.println("|   1. Add Numbers     |");
					System.out.println("|   2. Find Average    |");
					System.out.println("|   3. Calculate Tax   |");
					System.out.println("|   4. Exit            |");
					System.out.println("|                      |");
					System.out.println("========================");
					System.out.println();
				}

				public static double findSum(double num1, double num2) {
					double sum = num1 + num2;
					return sum;
				}
				public static double findAverage(double num1, double num2) {
				double numSum = num1 + num2;
				double average = numSum / 2;
				return average;
				}
				public static double calcTax(double num1, double num2) {
					double costSum = num1 + num2;
					double sumTax = costSum * .0831;
					return sumTax;
				}
			}







