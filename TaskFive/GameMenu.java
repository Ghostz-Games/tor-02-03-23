import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
	
	private ArrayList<String> actions = new ArrayList<String>();

	GameMenu(ArrayList<String> actions){

		this.actions = actions;

	}



	public void displayMenu(){

		for(String s: this.actions){
			System.out.println(s);
		}

	}

	public String getAction(){
		System.out.println("Type a number to choose an action:");
		displayMenu();

		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();

		return choice;

	}




}