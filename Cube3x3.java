import java.util.Scanner;
import java.lang.*;

public class Cube3x3 {

	private static final int COLOR_RED = 0;
	private static final int COLOR_BLUE = 1;
	private static final int COLOR_ORANGE = 2;
	private static final int COLOR_GREEN = 3;
	private static final int COLOR_WHITE = 4;
	private static final int COLOR_YELLOW = 5;

	public static void main(String[] args) {
		int[][] cube = new int[6][9];
		cube = init(cube);
	}

	public static int[][] init(int[][] cube) {
		System.out.println("Lege den Würfel auf den Tisch, so dass eine Seite zu dir zeigt.");
		System.out.println("Gebe nun nacheinander die Farben auf den verschiedenen Seiten an.");
		
		String[] sides = {"oben","vorne","rechts","hinten","links","unten"};
		int c = 0;
		Scanner sc = new Scanner(System.in);
		for(String side: sides) {
			System.out.println("Gebe die Seite '" + side + "' an");
			System.out.println("Fange dabei immer an der hinteren, bzw. unteren Seite an und gehe von links nach rechts nach vorne.");
			for(int i = 0;i<9;++i) {
				int field = (int)i+1;
				System.out.print("Gebe Feld " + field+ " an:");
				cube[c][i] = getColorCode(sc.next());
			}

			++c;
		}
		return cube;
	}

	public static int getColorCode(String color) {
		if(color.equals("red")) {
			return Cube3x3.COLOR_RED;
		} else if(color.equals("blue")) {
			return Cube3x3.COLOR_BLUE;
		} else if(color.equals("orange")) {
			return Cube3x3.COLOR_ORANGE;
		} else if(color.equals("green")) {
			return Cube3x3.COLOR_GREEN;
		} else if(color.equals("white")) {
			return Cube3x3.COLOR_WHITE;
		} else if(color.equals("yellow")) {
			return Cube3x3.COLOR_YELLOW;
		}
		return -1;
	}
}