import java.util.Scanner;

public class VHS extends Movie{
	
	private int currentTime;
	
	
	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
	
	public void rewind() {
		this.currentTime = 0;
	}


	//User is shown the first act and given the option to continue.
	//Movie proceeds to next act and restarts once user views all three acts
	@Override
	public void play() {
		if (currentTime < scenes.size() ) {
			String scene = scenes.get(currentTime);
			System.out.println("Act " + (scenes.indexOf(scene)+1) + ": " + scene);
			currentTime++;
		}
		else {
			rewind();
			System.out.println("<--REWIND<---");
			play();
		}
		System.out.println("Continue watching? (y/n)");
		Scanner scnr = new Scanner(System.in);
		String userReply = scnr.nextLine();
		if(userReply.equalsIgnoreCase("y")) {
			play();
		}else {
			System.out.println("OK, bye!");;
		}
		scnr.close();
		
	}
	
	

}
