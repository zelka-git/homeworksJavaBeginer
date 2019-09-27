package homework160407;

public class IntToBinary {
	public static void main(String[] args) {
		if(args == null) {
			System.exit(1);
		}
		if (args.length == 0) {
			System.out.println("Usage: <number>");
			System.exit(0);
		}
		
		int x = Integer.parseInt(args[0]);
		System.out.println(x);
		while(x != 0) {
			int y = (x % 2 == 0) ? 0 : 1;
			System.out.println(y);
			x = x >> 1;
		}
	}
}
