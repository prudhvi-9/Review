package com.review;

/*
 * FunctionalInterface
 */
interface Addition {
	void add(int a, int b);
}

interface Subtraction {
	void sub(int a, int b);
}

interface Division {
	void div(int a, int b);
}

public class MathOperation {
	/*
	 * Develop Math Operation App to perform Math Functions– Addition, Subtraction
	 * and Division - Use Lambda Expression to perform Math Operation
	 */

	public static void main(String[] args) {

		Addition addition = (a, b) -> {
			add(a, b);
		};
		addition.add(20, 40);

		Subtraction subtraction = (a, b) -> {
			sub(a, b);
		};
		subtraction.sub(6, 4);

		Division division = (a, b) -> {
			try {
				div(a, b);
			} catch (CustomException e) {
				e.printStackTrace();
			}
		};
		division.div(4, 2);
	}

	/*
	 * To perform addition operation.
	 */
	public static void add(int a, int b) {
		int result = a + b;
		System.out.println("Addition of " + a + " and " + b + " is " + result);

	}

	/*
	 * To perform subtraction operation.
	 */
	public static void sub(int a, int b) {
		int result = a - b;
		System.out.println("Subtraction of " + a + " and " + b + " is " + result);
	}

	/*
	 * To perform division operation.
	 */
	public static void div(int a, int b) throws CustomException {
		try {

			int result = a / b;

			if (a == 0 || b == 0) {
				throw new CustomException("Enter a integer value");
			}
			System.out.println("Division of " + a + " and " + b + " is " + result);
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
	}

}
