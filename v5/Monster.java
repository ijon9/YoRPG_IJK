//Warriors
//APCS1 pf 8
//HW#28 --Ye olde Role Playing Game'
//2017-11-8

public class Monster extends Character {

    // Attributes
    protected String type;


    //Constructor
    public Monster() {
	name = "Mon";
	life = 150;
	strength = (int) (Math.random() * 46) + 20 ; //random value in range [20,65)
	defense = 20;
	aRate = 1;
    type = "";
    }

    public int attack(Protagonist user) {
        int damage;
        if (aRate < 0)
            damage = 0;
        else
            damage = (int)((strength * aRate) - user.getDefense());
        user.lowerHP(damage);
        return damage;
    }

    

}
