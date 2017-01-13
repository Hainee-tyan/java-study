import java.text.DecimalFormat;

public class Calculate {
	public static void main(String[] args) {

		System.out.println("Calculate...");

		double summ = 0;
		double product = 1;
		String output;

		try {

			for (String arg : args) {
				arg = arg.replace(',', '.');
				summ += Double.parseDouble(arg);
				product *= Double.parseDouble(arg);
			}

			if (args.length == 0) {
				output = "Oops, you didn't enter anything!";
			}
			else {
				DecimalFormat df = new DecimalFormat("#.##");

				output = "Your summ is: " + df.format(summ)
						+ "\nYour product is: " + df.format(product);
			}
		}
		catch (NumberFormatException e) {
			output = "You entered not number!";
		}

		System.out.println(output);
	}
}