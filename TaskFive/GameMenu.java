import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
	
	private ArrayList<String> actions = new ArrayList<String>();

	GameMenu(ArrayList<String> actions){

		this.actions = actions;

	}



	public void displayMenu(ArrayList<String> actions){

		for(String s: actions){
			System.out.println(s);
		}

	}

	public String getAction(ArrayList<String> actions){
		System.out.println("Type a number to choose an action:");
		displayMenu(actions);

		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();

		return choice;

	}




}