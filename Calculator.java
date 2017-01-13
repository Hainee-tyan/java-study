public class Calculator {

	/**
		Summ variable.
	*/
	private double summ = 0;

	/**
		Product variable.
	*/
	private double product = 1;

	/**
		Adds arguments.
		@param args Arguments to add.
	*/
	public void add(double ... args) {
		for (double arg : args) {
			this.summ += arg;
		}
	}

	/**
		Returns summ.
		@return Summ.
	*/
	public double getSumm() {
		return this.summ;
	}

	/**
		Clears summ.
	*/
	public void clearSumm() {
		this.summ = 0;
	}


	/**
		Multiply arguments.
		@param args Arguments to multiply.
	*/
	public void multiply(double ... args) {
		for (double arg : args) {
			this.product *= arg;
		}
	}

	/**
		Returns product.
		@return Product.
	*/
	public double getProduct() {
		return this.product;
	}

	/**
		Clears product.
	*/
	public void clearProduct() {
		this.product = 1;
	}

	
}