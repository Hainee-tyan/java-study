public class Calculator {

	/**
		Sum variable.
	*/
	private double mSum = 0;

	/**
		Product variable.
	*/
	private double mProduct = 1;

	/**
		Adds arguments.
		@param args Arguments to add.
	*/
	public void add(double ... args) {
		for (double arg : args) {
			mSum += arg;
		}
	}

	/**
		Returns sum.
		@return Sum.
	*/
	public double getSum() {
		return mSum;
	}

	/**
		Clears sum.
	*/
	public void clearSum() {
		mSum = 0;
	}


	/**
		Multiply arguments.
		@param args Arguments to multiply.
	*/
	public void multiply(double ... args) {
		for (double arg : args) {
			mProduct *= arg;
		}
	}

	/**
		Returns product.
		@return Product.
	*/
	public double getProduct() {
		return mProduct;
	}

	/**
		Clears product.
	*/
	public void clearProduct() {
		mProduct = 1;
	}	
}