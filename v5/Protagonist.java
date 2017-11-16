//Warriors
//APSC1 pd8
//HW#28 -- Ye Olde Role Playing Game
//2017-11-8

public abstract class Protagonist extends Character {

    //Attributes
    

    //Constructor
    public Protagonist() {
    name = "";
    life = 100;
    strength = 5;
    defense = 5;
    aRate = 2.5;
    type = "";
    }
    public Protagonist(String newname) {
	name = newname;
	life = 100;
	strength = 5;
	defense = 5;
	aRate = 2.5;
    type = "";
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

    //calculates attack
    //how to access mDefense (Monster defense)
    
    //prepares Protagonist for special attack
    public abstract void specialize();

    //prepares Protagonist for normal attack
    public abstract void normalize();

    public abstract String about();
}
