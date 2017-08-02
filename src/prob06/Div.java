package prob06;

public class Div extends Calc {

	@Override
	public int calculate() {
		int result = 0;
		
		if (num1 == 0 || num2 == 0) {
			result = 0;
		}
		return result;
	}

}
