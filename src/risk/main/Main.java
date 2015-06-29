package risk.main;

import risk.player.CreateUserModel;
import risk.player.IGamePlayer;
import risk.player.Player;

public class Main {

	
	// ENTRY POINT
	// boot strapping. 
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	/*	
		Homeview theView = new Homeview();
		Homemodel theModel = new Homemodel();
		Homecontroller theController = new Homecontroller(null, null);*/
		
		CreateUserModel model = new CreateUserModel();
		
		boolean agility =model.setAgility(3);
		boolean health = model.setHeatlh(7);
		boolean attack = model.setAttack(7);
		
		IGamePlayer playerplayer = new Player(model);
		
		int agile =playerplayer.getAgility();
		playerplayer.ProcessXp(1000);
		
		int newstats = playerplayer.getAgility();
	
		
	}

}

