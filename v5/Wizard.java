public class Wizard extends Protagonist {
    public Wizard(String newname) {
	name = newname;
	life = 50;
	strength = 75;
	defense = 2;
	aRate = 2;
	type = "Wizard";
    }
        public String about() {
    	return "The Wizard is extremely powerful but has very low health and defense.";
    }
    public void specialize() {
    	aRate += 2.5;
	if (defense <= 0)
	    defense = 0;
	else
	    defense -= 1;
    }
    public void normalize() {
    	aRate = 2.5;
		defense = 5;
	}
	public int attack(Monster grr) { 
	int damage = (int) (strength * aRate) - grr.getDefense();
	if (damage <= 0)
	    return 0;
	if (grr.getType() == "Vampire") {
		grr.lowerHP(2 * damage);
		return 2 * damage;
	}
	grr.lowerHP(damage);
     return damage;
    }

}