import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DVD implements Play {

	Scanner scnr = new Scanner(System.in);
	private String title;
	private int runTime;
	protected ArrayList<String> scenes;

	//User is shown a list of acts and picks by the numeric value. 
	//App then shows the act to the user.
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	
	
	public DVD(String title, int runTime) {
		super();
		this.title = title;
		this.runTime = runTime;
	}

	@Override
	public void play(List<String> scenes) {
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

	public ArrayList<String> getScenes() {
		return scenes;
	}

	

	

}
