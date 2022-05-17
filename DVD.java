import java.util.Scanner;

public class DVD extends Movie {

	Scanner scnr = new Scanner(System.in);

	//User is shown a list of acts and picks by the numeric value. App then shows the act to the user.
	@Override
	public void play() {
		System.out.print("\nWhich act would you like to watch? (Select 1-3): ");
		int input3 = scnr.nextInt();

		if (input3 == 1) {
			System.out.println("\nNow Playing:");
			System.out.println("Act 1: " + scenes.get(0));
		}else if(input3 == 2) {
			System.out.println("\nNow Playing:");
			System.out.println("Act 2: " + scenes.get(1));
		}else if(input3 == 3) {
			System.out.println("\nNow Playing:");
			System.out.println("Act 3: " + scenes.get(2));
		}
	}

	

}
