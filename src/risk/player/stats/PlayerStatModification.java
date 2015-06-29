package risk.player.stats;

public class PlayerStatModification {

	public PlayerStatModification(StatType type, int increaseBy){
		Type = type;
		IncreaseBy = increaseBy;
	}
	
	public final StatType Type;
	public final int IncreaseBy;
}
