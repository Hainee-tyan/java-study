import java.util.Scanner;

public class InteractRunner {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		double[] numbers = new double[2];
		String exit = "n";

		while (exit.equals("n")) {
			try {
				for (int i = 1; i <= 2; i++) {
					System.out.format("Enter %d number: ", i);
					numbers[i] = Double.parseDouble(scanner.next().replace(",", "."));
				}
				
				calculator.add(numbers[0], numbers[1]);
				calculator.multiply(numbers[0], numbers[1]);

				System.out.format("%f + %f = %f%n", numbers[0], numbers[1], calculator.getSum());
				System.out.format("%f * %f = %f%n", numbers[0], numbers[1], calculator.getProduct());

				calculator.clearSum();
				calculator.clearProduct();

				System.out.print("Exit? y/n ");
				exit = scanner.next();

			}
			catch (Exception e) {
				System.out.println("Ooops... Something is wrong, try again!");
				continue;
			}
		}

		scanner.close();
	}
}