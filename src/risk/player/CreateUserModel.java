package risk.player;

public class CreateUserModel implements IPlayerStats{

	private static int START_STAT = 5;
	
	private static int POINTS = 10;
	
	
	public CreateUserModel(){
		// defaults. 
		_attack= _defence= _range =_magic =_agility=_health= START_STAT;
		_remainingPoints = POINTS;
	}
	
	private int _attack;
	private int _defence;
	private int _range;
	private int _magic;
	private int _agility;
	private int _health;	

	private int _remainingPoints;
	
	
	private boolean canAddValue(int value){	 
		int newValue = _remainingPoints - value;
		if(newValue < 0) return false;	
		_remainingPoints = newValue;		
		return true;
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



	public boolean setAttack(int value) {
		if(!canAddValue(value)) return false;
		_attack+= value;
		return true;
	}
	

	public boolean setDefence(int value) {
		if(!canAddValue(value)) return false;
		_defence+= value;
		return true;
	}


	public boolean setRange(int value) {
		if(!canAddValue(value)) return false;
		_range+= value;
		return true;
	}


	public boolean setMagic(int value) {
		if(!canAddValue(value)) return false;
		_magic+= value;
		return true;
	}


	public boolean setAgility(int value) {
		if(!canAddValue(value)) return false;
		_agility+= value;
		return true;
	}


	public boolean setHeatlh(int value) {
		if(!canAddValue(value)) return false;
		_health+= value;
		return true;
	}
	
}
