
public class TestCalculate {

	public static void main(String[] args) {

		Calculate calculate = new Calculate();

		int a = 6;
		int b = 0;

		calculate.division(a, b);
		calculate.minus(a, b);
		calculate.multiply(a, b);
		calculate.sum(a, b);

		System.out.println("float:");

		float c = 3;
		float d = 0;

		calculate.division(c, d);
		calculate.minus(c, d);
		calculate.multiply(c, d);
		calculate.sum(c, d);

	}

}
