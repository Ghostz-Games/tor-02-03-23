import java.util.ArrayList;

public class Team {
	

	private String teamName = "";
	private int teamRank;
	private ArrayList<String> members = new ArrayList<String>();

	public Team(String teamName){

		this.teamName = teamName;


	}

	public String toString(){

		return "Hold: "+teamName+" Rang: "+teamRank;
	}

	public void setRank(int teamRank){

		this.teamRank = teamRank;

	}

}