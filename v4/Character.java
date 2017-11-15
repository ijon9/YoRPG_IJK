public class Character {
	//Attributes
	protected static String name;
	protected static int life;
	protected static int strength;
	protected static int defense;
	protected static double aRate;
	
	//Methods
	public static boolean isAlive() {
		if (life == 0)
			return false;
		return true;
	}
	
	public static String getName() {
	return name;
    }
    
	public static int getDefense() {
		return defense;
	}
	
	public static int lowerHP(int amt) {
		if (amt > life)
			life = 0;
		return life -= amt;
	}
	
	public static int attack(Character user) {
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
