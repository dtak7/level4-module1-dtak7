package _05_Enum_Stuff;

import java.util.Random;

public class Module_1_Checkpoint {
	public static void main(String[] args) {

		Random rand = new Random();
		int value = rand.nextInt(4);
		int x = value;
		{
			switch (x) {
			case 0:
				System.out.println("at least one");
				break;
			case 1:
				System.out.println("dos");
				break;

			case 2:
				System.out.println("pen ultamate (aka 3)");
				break;
			case 3:
				System.out.println("ULTAMATE (aka 4)");
				break;
			default:
				System.out.println("something went wrong");

			}
		}
	}
}