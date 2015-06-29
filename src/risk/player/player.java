package risk.player;

import java.util.ArrayList;

import risk.game.Constants;
import risk.player.stats.Dave;
import risk.player.stats.IStatModifier;
import risk.player.stats.PlayerStatModification;

public class Player implements IGamePlayer {
	
	//player
	private int _attack;
	private int _defence;
	private int _range;
	private int _magic;
	private int _agility;
	private int _health;
	private final ArrayList<IStatModifier> _statModifiers;
	
	public Player(CreateUserModel model){
		_agility = model.getAgility();
		_attack = model.getAttack();
		_defence = model.getDefence();
		_health = model.getHeatlh();
		_magic = model.getMagic();
		_range = model.getRange();
		_statModifiers = new ArrayList<IStatModifier>();
		_statModifiers.add(new Dave());
	}

	@Override
	public int getAttack() {
		// TODO Auto-generated method stub
		return _attack;
	}
	
	@Override
	public int getDefence() {
		// TODO Auto-generated method stub
		return _defence;
	}

	@Override
	public int getRange() {
		// TODO Auto-generated method stub
		return _range;
	}

	@Override
	public int getMagic() {
		// TODO Auto-generated method stub
		return _magic;
	}

	@Override
	public int getAgility() {
		// TODO Auto-generated method stub
		return _agility;
	}

	@Override
	public int getHeatlh() {
		// TODO Auto-generated method stub
		return _health;
	}
	
	@Override
	public void ProcessXp(int xp){
		
		for (IStatModifier mod: _statModifiers) {
			for(PlayerStatModification modifier : mod.Results(xp)){
				addXpResult(modifier);
			}
		}
	}
	
	private void addXpResult(PlayerStatModification mod){
		switch(mod.Type){
		case Agility:
			if(_agility + mod.IncreaseBy > Constants.MAX_STAT) _agility = Constants.MAX_STAT; else _agility += mod.IncreaseBy;
			break;
		case Attack:
			if(_attack + mod.IncreaseBy > Constants.MAX_STAT) _attack = Constants.MAX_STAT; else _attack += mod.IncreaseBy;
			break;
		case Defence:
			if(_defence + mod.IncreaseBy > Constants.MAX_STAT) _defence = Constants.MAX_STAT; else _defence += mod.IncreaseBy;
			break;
		case Health:
			if(_health + mod.IncreaseBy > Constants.MAX_STAT) _health = Constants.MAX_STAT; else _health += mod.IncreaseBy;
			break;
		case Magic:
			if(_magic + mod.IncreaseBy > Constants.MAX_STAT) _magic = Constants.MAX_STAT; else _magic += mod.IncreaseBy;
			break;
		case Range:
			if(_range + mod.IncreaseBy > Constants.MAX_STAT) _range = Constants.MAX_STAT; else _range += mod.IncreaseBy;
			break;
			}
	}
	
	
	private void setAttack(int value) {
		_health= value;
	}
	

	private void setDefence(int value) {
		_health= value;
	}


	private void setRange(int value) {
		_health= value;
	}


	private void setMagic(int value) {
		_health= value;
	}


	private void setAgility(int value) {
		_health= value;
	}


	private void setHeatlh(int value) {		
		_health= value;
	}
}
