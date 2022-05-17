import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

	static Scanner scnr = new Scanner(System.in);
	static String movieSelection = "";

	public static void main(String[] args) {

		Movie movie1 = new VHS();
		VHS speed = (VHS) movie1;
		speed.setTitle("Speed");
		speed.setRunTime(116);
		ArrayList<String> speedScenes = new ArrayList<>();
		speedScenes.add("Pop Quiz");
		speedScenes.add("Beep Beep");
		speedScenes.add("The Day is Saved!");
		speed.setScenes(speedScenes);

		Movie movie2 = new VHS();
		VHS breakfastClub = (VHS) movie2;
		breakfastClub.setTitle("The Breakfast Club");
		breakfastClub.setRunTime(116);
		ArrayList<String> breakfastClubScenes = new ArrayList<>();
		breakfastClubScenes.add("Detention");
		breakfastClubScenes.add("Running Around the Halls");
		breakfastClubScenes.add("Getting to Know Each Other");
		breakfastClub.setScenes(breakfastClubScenes);

		Movie movie3 = new VHS();
		VHS goonies = (VHS) movie3;
		goonies.setTitle("The Goonies");
		goonies.setRunTime(114);
		ArrayList<String> goonieScenes = new ArrayList<>();
		goonieScenes.add("Treasure Map");
		goonieScenes.add("Walk the Plank");
		goonieScenes.add("Home");
		goonies.setScenes(goonieScenes);
		
		Movie movie4 = new DVD();
		DVD matrix = (DVD) movie4;
		matrix.setTitle("The Matrix");
		matrix.setRunTime(136);
		ArrayList<String> matrixScenes = new ArrayList<>();
		matrixScenes.add("Wake Up, Neo");
		matrixScenes.add("I Know Kung Fu");
		matrixScenes.add("Rescue Morpheus");
		matrix.setScenes(matrixScenes);
		
		Movie movie5 = new DVD();
		DVD lotr = (DVD) movie5;
		lotr.setTitle("The Lord of the Rings: The Fellowship of the Ring");
		lotr.setRunTime(178);
		ArrayList<String> lotrScenes = new ArrayList<>();
		lotrScenes.add("The Dark Lord Has Returned");
		lotrScenes.add("Forming the Fellowship");
		lotrScenes.add("Defending Frodo");
		lotr.setScenes(lotrScenes);
		
		Movie movie6 = new DVD();
		DVD up = (DVD) movie6;
		up.setTitle("Up");
		up.setRunTime(96);
		ArrayList<String> upScenes = new ArrayList<>();
		upScenes.add("Grumpy Old Man Meets Enthusiastic Boy");
		upScenes.add("Adventure Awaits");
		upScenes.add("Bringing Down the Blimp");
		up.setScenes(upScenes);

		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(speed);
		movies.add(breakfastClub);
		movies.add(goonies);
		movies.add(matrix);
		movies.add(lotr);
		movies.add(up);

		System.out.println("Welcome to the GC Blockbuster!");
		System.out.println();

		int index = 1;
		for (Movie m : movies) {
			System.out.println(String.valueOf(index++) + ") " + m.getTitle());
		}
		
		System.out.print("\nPlease select a movie you want to watch: ");
		int input1 = scnr.nextInt();

		
		if (input1 == 1) {
			Movie selection = speed;
			selection.printInfo();
			selection.play();
		}else if(input1 == 2) {
			Movie selection = breakfastClub;
			selection.printInfo();
			selection.play();
		}else if(input1 == 3) {
			Movie selection = goonies;
			selection.printInfo();
			selection.play();
		}else if(input1 == 4) {
			Movie selection = matrix;
			selection.printInfo();
			System.out.println("\nScenes:");
			selection.printScenes();
			selection.play();
		}else if(input1 == 5) {
			Movie selection = lotr;
			selection.printInfo();
			System.out.println("\nScenes:");
			selection.printScenes();
			selection.play();
		}else if(input1 == 6) {
			Movie selection = up;
			selection.printInfo();
			System.out.println("\nScenes:");
			selection.printScenes();
			selection.play();
		}
		
			
		
		
		

	}

}
