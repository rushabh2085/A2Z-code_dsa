import java.util.*;

class player {
	String name;
	int goals;

	player(String name,int goals) {
		this.name = name;
		this.goals = goals;
	}

	void record() {

		System.out.println(name +" has scored as "+ goals + " goals");

	}
}


public class ArrayList_example {
	public static void main(String [] args) {
		ArrayList<player> team = new ArrayList<>();
		team.add(new player("Isagi",2));
		team.add(new player("Rin",6));
		team.add(new player("Barou",8));
		team.add(new player("isa",4));
		team.add(new player("Bachira",8));
		
		for(int i = 0;i<team.size();i++){
		    team.get(i).record();
		}
		
	System.out.println("Well played, my diamonds 💎");


	}
}