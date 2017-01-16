import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Calculate {

	private static char[] mActions = {'+', '-', '*', '/', '^', '?'};
	private static double[] mNumbers = new double[2];
	private static DecimalFormat mDecimalFormat;

	public static void main(String[] args) {

		System.out.println("Calculate...");

		if (args.length < 2) {
			System.out.println("Oops... You should input 2 numbers!");
			return;
		}

		try {
			for (int i = 0; i < 2; i++) {
				mNumbers[i] = Double.parseDouble(args[i].replace(",", "."));
			}
		}
		catch (Exception e) {
			System.out.println("Oops... You entered not numbers!");
			return;
		}

		for (int i = 0; i < 6; i++) {
			printAction(i);
		}
	}

	private static void printAction(int actionID) {
		double result;
		switch (actionID) {
			case 0: {
				result = mNumbers[0] + mNumbers[1];
				break;
			}
			case 1: {
				result = mNumbers[0] - mNumbers[1];
				break;
			}
			case 2: {
				result = mNumbers[0] * mNumbers[1];
				break;	
			}
			case 3: {
				result = mNumbers[0] / mNumbers[1];
				break;
			}
			case 4: {
				result = Math.pow(mNumbers[0], mNumbers[1]);
				break;
			}
			default: {
				actionID = 5;
				result = Double.NaN;
			}
		}

		System.out.format("%s %c %s = %s%n", format(mNumbers[0]), mActions[actionID], format(mNumbers[1]), format(result));
	}

	private static String format(double number) {
		if (mDecimalFormat == null) {
			DecimalFormatSymbols dfs = new DecimalFormatSymbols();
			dfs.setNaN("NaN");
			dfs.setInfinity("Infinity");

			mDecimalFormat = new DecimalFormat("#.##", dfs);
		}

		return mDecimalFormat.format(number);
	}
}