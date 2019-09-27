package homework160411;

public class Cube {
	public static void main(String[] args) {
		int[][][] cube = {
				{
			{1, 2},
			{3, 0},
			{5, 0}
			},
				{
			{7, 0},
			{9, 0},
			{11, 12}
			},
				{
				{0, 14},
				{0, 16},
				{17, 18}}
			};
		BEGIN:
		for (int slice = 0; slice < cube.length; slice++) {
			for(int row = 0; row < cube[slice].length; row++) {
				for(int column = 0; column < cube[slice][row].length; column++) {
					if (cube[slice][row][column] == 0) {
						System.out.println("slice=" + slice + " row=" + row +" column="+ column);
						continue BEGIN;
					}
				}
			}
		}
	}
}
