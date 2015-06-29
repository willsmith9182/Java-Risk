package risk.player.stats;

import java.util.ArrayList;

public class Dave  implements IStatModifier {

	@Override
	public ArrayList<PlayerStatModification> Results(int xp) {
		ArrayList<PlayerStatModification> mods = new ArrayList<PlayerStatModification>();
		if(xp == 1000){
			mods.add(new PlayerStatModification(StatType.Agility, 50));
		}
		return mods;
	}

}
