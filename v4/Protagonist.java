//Warriors
//APSC1 pd8
//HW#28 -- Ye Olde Role Playing Game
//2017-11-8

public abstract class Protagonist extends Character {

    //Attributes
    protected static String name;
    protected static int life;
    protected static int strength;
    protected static int defense;
    protected static double aRate; //attack rating 

    //Constructor
    public Protagonist() {
    name = "";
    life = 100;
    strength = 5;
    defense = 5;
    aRate = 2.5;
    }
    public Protagonist(String newname) {
	name = newname;
	life = 100;
	strength = 5;
	defense = 5;
	aRate = 2.5;
    }

    //returns boolean indicating living/dead
    public static boolean isAlive() {
	if (life <= 0)
	    return false;
	return true;
    }

    //returns value of defense attribute
    public static int getDefense() {
	return defense;
    }

    //returns value of name attribute
    public static String getName() {
	return name;
    }

    //descreases life by parameter
    public static int lowerHP(int n) {
	life -= n;
	if (life <= 0)
	    return 0;
	return life;
    }

    //calculates attack
    //how to access mDefense (Monster defense)
    public static int attack(Monster grr) {
	 
	int damage = (int) (strength * aRate) - grr.getDefense();
	if (damage <= 0)
	    return 0;
	grr.lowerHP(damage);
     	return damage;
    }

    //prepares Protagonist for special attack
    public abstract void specialize();

    //prepares Protagonist for normal attack
    public abstract void normalize();

    public abstract String about();
}
