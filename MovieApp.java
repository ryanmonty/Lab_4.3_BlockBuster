import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieApp {

	static Scanner scnr = new Scanner(System.in);
	static String movieSelection = "";

	public static void main(String[] args) {
		
		ArrayList<Movie> movies = new ArrayList<>();
	
		Play speed = new VHS("Speed", 116);
		movies.add(new Movie(speed));
		Play breakfastClub = new VHS("The Breakfast Club", 116);
		movies.add(new Movie(breakfastClub));
		Play goonies = new VHS("The Goonies", 114);
		movies.add(new Movie(goonies));
		Play matrix = new DVD("The Matrix", 136);
		movies.add(new Movie(matrix));
		Play lotr = new DVD("The Lord of the Rings: The Fellowship of the Ring", 178);
		movies.add(new Movie(lotr));
		Play up = new DVD("Up", 96);
		movies.add(new Movie(up));
		
		
		ArrayList<String> speedScenes = new ArrayList<>();
		speedScenes.add("Pop Quiz");
		speedScenes.add("Beep Beep");
		speedScenes.add("The Day is Saved!");
		movies.get(0).setTitle("Speed");
		movies.get(0).setRunTime(116);
		movies.get(0).setScenes(speedScenes);

		
		ArrayList<String> breakfastClubScenes = new ArrayList<>();
		breakfastClubScenes.add("Detention");
		breakfastClubScenes.add("Running Around the Halls");
		breakfastClubScenes.add("Getting to Know Each Other");
		movies.get(1).setTitle("The Breakfast Club");
		movies.get(1).setRunTime(116);
		movies.get(1).setScenes(breakfastClubScenes);
		
		ArrayList<String> goonieScenes = new ArrayList<>();
		goonieScenes.add("Treasure Map");
		goonieScenes.add("Walk the Plank");
		goonieScenes.add("Home");
		movies.get(2).setTitle("The Goonies");
		movies.get(2).setRunTime(114);
		movies.get(2).setScenes(goonieScenes);
		
		ArrayList<String> matrixScenes = new ArrayList<>();
		matrixScenes.add("Wake Up, Neo");
		matrixScenes.add("I Know Kung Fu");
		matrixScenes.add("Rescue Morpheus");
		movies.get(3).setTitle("The Matrix");
		movies.get(3).setRunTime(136);
		movies.get(3).setScenes(matrixScenes);
	
		ArrayList<String> lotrScenes = new ArrayList<>();
		lotrScenes.add("The Dark Lord Has Returned");
		lotrScenes.add("Forming the Fellowship");
		lotrScenes.add("Defending Frodo");
		movies.get(4).setTitle("The Lord of the Rings: The Fellowship of the Ring");
		movies.get(4).setRunTime(178);
		movies.get(4).setScenes(lotrScenes);
		
		ArrayList<String> upScenes = new ArrayList<>();
		upScenes.add("Grumpy Old Man Meets Enthusiastic Boy");
		upScenes.add("Adventure Awaits");
		upScenes.add("Bringing Down the Blimp");
		movies.get(5).setTitle("Up");
		movies.get(5).setRunTime(96);
		movies.get(5).setScenes(upScenes);


		System.out.println("Welcome to the GC Blockbuster!");
		System.out.println();

		int index = 1;
		for (Movie m : movies) {
			System.out.println(String.valueOf(index++) + ") " + m.getTitle());
		}
		
		System.out.print("\nPlease select a movie you want to watch: ");
		int input1 = scnr.nextInt();

		
		if (input1 == 1) {
			movies.get(0).printInfo();
			movies.get(0).play();
		}else if(input1 == 2) {
			movies.get(1).printInfo();
			movies.get(2).play();
		}else if(input1 == 3) {
			movies.get(2).printInfo();
			movies.get(2).play();
		}else if(input1 == 4) {
			movies.get(3).printInfo();
			System.out.println("\nScenes:");
			movies.get(3).printScenes();
			movies.get(3).play();
		}else if(input1 == 5) {
			movies.get(4).printInfo();
			System.out.println("\nScenes:");
			movies.get(4).printScenes();
			movies.get(4).play();
		}else if(input1 == 6) {
			movies.get(5).printInfo();
			System.out.println("\nScenes:");
			movies.get(5).printScenes();
			movies.get(5).play();
		}
		
			
		
		
		

	}

}
