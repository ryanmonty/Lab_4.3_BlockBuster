import java.util.ArrayList;

public class Movie {
	private Play IPlay;
	private String title;
	private int runTime;
	protected ArrayList<String> scenes;
	

	public Movie(Play IPlay) {
		this.IPlay = IPlay;
	}
	
	public Play getPlay() {
		return IPlay;
	}

	public ArrayList<String> getScenes() {
		return (ArrayList<String>) scenes;
	}
	
	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
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
	
	public void printInfo() {
		System.out.println("Title: " + getTitle());
		System.out.println("Run Time: " + getRunTime() + " minutes");
	}
	
	public void printScenes() {
		int index=1;
		for( String scene : scenes ) {
			System.out.println(String.valueOf(index++) + ": " + scene);
		}
	}
	
	public void play() {
		IPlay.play(scenes);
	}
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", runTime=" + runTime + ", scenes=" + scenes + "]";
	}
	
	
	
	
	
}
