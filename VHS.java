import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VHS implements Play {

	private String title;
	private int runTime;
	
	public VHS(String title, int runTime) {
		super();
		this.title = title;
		this.runTime = runTime;
	}
	
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

	private int currentTime = 0;

	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}

	public void rewind() {
		this.currentTime = 0;
	}


	public String printInfo() {
		String info = getTitle() + getRunTime();
		System.out.println("Title: " + getTitle());
		System.out.println("Run Time: " + getRunTime() + " minutes");
		return info;
	}




	@Override
	public void play(List<String> scenes) {
		if ((currentTime < scenes.size())) {
			String scene = scenes.get(currentTime);
			System.out.println("Act " + (scenes.indexOf(scene) + 1) + ": " + scene);
			currentTime++;
		} else {
			rewind();
			System.out.println("<--REWIND<---");
			play(scenes);
		}

		System.out.println("Continue watching? (y/n)");
		Scanner scnr = new Scanner(System.in);
		String userReply = scnr.nextLine();
		if (userReply.equalsIgnoreCase("y")) {
			play(scenes);
		} else {
			System.out.println("OK, bye!");
			
		}
		scnr.close();
		
	}

	public void setScenes(ArrayList<String> speedScenes) {
		// TODO Auto-generated method stub
		
	}
	
	
}
