//Warriors
//APCS1 pf 8
//HW#28 --Ye olde Role Playing Game'
//2017-11-8

public class Monster extends Character {

    // Attributes
    protected static String name;
    protected static int life;
    protected static int strength;
    protected static int defense;
    protected static double aRate;


    //Constructor
    public Monster() {
	name = "Mon";
	life = 150;
	strength = (int) (Math.random() * 46) + 20 ; //random value in range [20,65)
	defense = 20;
	aRate = 1;
    }

    //returns boolean indicating living/dead
    public static boolean isAlive() {
	if (life == 0)
	    return false;
	return true;
    }

    //returns defense attribute
    public static int getDefense() {
	return defense;
    }

    //returns name attribute
    public static String getName() {
	return name;
    }

    //decreases life by parameter
    public static int lowerHP(int n) {
	return life -= n;
    }

    //calculates attack
    public static int attack(Protagonist prot) {
    	int damage; 
    	if (aRate < 0) 
    		damage = 0;
    	else 
    		damage = (int) (strength * aRate) - prot.getDefense();
    	prot.lowerHP(damage);
    	return damage;
    }

}
