public class Character {
	//Attributes
	protected String name;
	protected int life;
	protected int strength;
	protected int defense;
	protected double aRate;
	
	//Methods
	public boolean isAlive() {
		if (life == 0)
			return false;
		return true;
	}
	
	public String getName() {
	return name;
    }
    
	public int getDefense() {
		return defense;
	}
	
	public int lowerHP(int amt) {
		if (amt > life)
			life = 0;
		return life -= amt;
	}
	
	public int attack(Character user) {
		int damage;
		if (aRate < 0)
			damage = 0;
		else
			damage = (int)((strength * aRate) - user.getDefense());
		user.lowerHP(damage);
		return damage;
	}
		


	public static void main(String[] args) {
		

	}







}
