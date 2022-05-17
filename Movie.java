import java.util.ArrayList;

public abstract class Movie {
	private String title;
	private int runTime;
	protected ArrayList<String> scenes = new ArrayList<>();
	


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
	
	public String printInfo() {
		String info = getTitle() + getRunTime();
		System.out.println("Title: " + getTitle());
		System.out.println("Run Time: " + getRunTime() + " minutes");
		return info;
	}
	
	public void printScenes() {
		int index=1;
		for( String scene : scenes ) {
			System.out.println(String.valueOf(index++) + ": " + scene);
		}
	}
	
	public abstract void play();
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", runTime=" + runTime + ", scenes=" + scenes + "]";
	}
	
	
	
	
	
}
