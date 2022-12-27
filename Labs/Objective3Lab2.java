public class Objective3Lab2 {
	public static void main(String[] args) {

		double side1 = 10.0;
		double side2 = 8.0;
		double hypotenuse;
		double hypotenuseSqr = ((side1 * side1) + (side2 * side2));
		double hypotenuseResult = Math.sqrt(hypotenuseSqr);

		System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is, " + hypotenuseResult);
	}
}