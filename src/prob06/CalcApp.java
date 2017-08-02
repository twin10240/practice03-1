package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			/*  코드를 완성 합니다 */
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals(expression)) {
				break;
			}else {
				String[] splitExpression = expression.split(" ");
				
				Calc calc = null;
				
				switch (splitExpression[1]) {
				case "+":
					calc = new Add();
					break;
					
				case "-":
					calc = new Sub();
					break;

				case "*":
					calc = new Mul();
					break;

				case "/":
					calc = new Div();
					break;
				}
				
				calc.setValue(Integer.parseInt(splitExpression[0]), Integer.parseInt(splitExpression[2]));
				System.out.println(">>" + calc.calculate());
			}
		}
		scanner.close();
	}
}