public class Knight extends Protagonist {
    public Knight(String newname) {
	name = newname;
	life = 150;
	strength = 25;
	defense = 10;
	aRate = 1;
    }
    public String about() {
    	return "The Knight is very heavily armored but has a slow attack rate. ";
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
}