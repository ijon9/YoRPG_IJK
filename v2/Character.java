public class Character {
	//Attributes
	private static int life;
	private static int strength;
	private static int defense;
	private static double aRate;
	
	//Methods
	public static boolean isAlive() {
		if (life == 0)
			return false;
		return true;
	}
	
	public static int getDefense() {
		return defense;
	}
	
	public static void lowerHP(int amt) {
		if (amt > life)
			life = 0;
		life -= amt;
	}
	
	public static void attack(Character user) {
		int damage;
		if (aRate < 0)
			damage = 0;
		damage = (int)((strength * aRate) - user.getDefense());
	}
		


	public static void main(String[] args) {
		

	}







}
