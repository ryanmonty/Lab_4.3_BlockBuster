import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {
	
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		
		Movie movie1 = new VHS();
		VHS speed = (VHS)movie1;
		speed.setTitle("Speed");
		speed.setRunTime(116);
		ArrayList<String> speedScenes = new ArrayList<>();
		speedScenes.add("Pop Quiz");
		speedScenes.add("Beep Beep");
		speedScenes.add("The Day is Saved!");
		speed.setScenes(speedScenes);
		
		Movie movie2 = new VHS();
		VHS breakfastClub = (VHS)movie2;
		breakfastClub.setTitle("The Breakfast Club");
		breakfastClub.setRunTime(116);
		ArrayList<String> breakfastClubScenes = new ArrayList<>();
		breakfastClubScenes.add("Detention");
		breakfastClubScenes.add("Running Around the Halls");
		breakfastClubScenes.add("Getting to Know Each Other");
		breakfastClub.setScenes(breakfastClubScenes);
		
		Movie movie3 = new VHS();
		VHS goonies = (VHS)movie3;
		goonies.setTitle("The Goonies");
		goonies.setRunTime(114);
		ArrayList<String> goonieScenes = new ArrayList<>();
		goonieScenes.add("Treasure Map");
		goonieScenes.add("Walk the Plank");
		goonieScenes.add("Home");
		goonies.setScenes(goonieScenes);

		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(speed);
		movies.add(breakfastClub);
		movies.add(goonies);
		
		
		System.out.println("Welcome to the GC Blockbuster!");

		int index=1;
		for( Movie m : movies ) {
			System.out.println(String.valueOf(index++) + ") " + m.getTitle());
		}
		
		System.out.println("Please select a movie you want to watch: ");
		int input1 = scnr.nextInt();
		
		if (input1 == index) {
			printInfo()
		}
		
		
		

	}

}
