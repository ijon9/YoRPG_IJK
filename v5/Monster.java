//Warriors
//APCS1 pf 8
//HW#28 --Ye olde Role Playing Game'
//2017-11-8

public class Monster extends Character {

    // Attributes
    protected String name;
    protected int life;
    protected int strength;
    protected int defense;
    protected double aRate;


    //Constructor
    public Monster() {
	name = "Mon";
	life = 150;
	strength = (int) (Math.random() * 46) + 20 ; //random value in range [20,65)
	defense = 20;
	aRate = 1;
    }

    //returns boolean indicating living/dead
    public boolean isAlive() {
	if (life <= 0)
	    return false;
	return true;
    }

    //returns defense attribute
    public int getDefense() {
	return defense;
    }

    //returns name attribute
    public String getName() {
	return name;
    }

    //decreases life by parameter
    public int lowerHP(int n) {
	return life -= n;
    }

    //calculates attack
    public int attack(Protagonist prot) {
    	int damage; 
    	if (aRate < 0) 
    		damage = 0;
    	else 
    		damage = (int) (strength * aRate) - prot.getDefense();
    	prot.lowerHP(damage);
    	return damage;
    }

}
