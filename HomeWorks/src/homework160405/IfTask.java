package homework160405;

import java.util.Arrays;

public class IfTask {
	public static void main(String[] args) {
		/*
		 * две - много
		 * пять  - мало
		 * одна - в самый раз
		 */
		if (args.length == 0) {
			System.out.println("Usage: EvenOddExample <number>");
			System.exit(0);
		}
		String argsList = Arrays.toString(args);
		System.out.println(argsList);
		
		int x = Integer.parseInt(args[0]);
		
		if (x == 2) System.out.println("МНОГО");
		else if (x == 5 ) System.out.println("МАЛО");
		else if (x == 1) System.out.println("В САМЫЙ РАЗ");
		else System.out.println("ЗНАЧЕНИЕ НЕ ОПРЕДЕЛЕНО");
	}
}
