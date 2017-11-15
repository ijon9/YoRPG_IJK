public class Elf  extends Protagonist {
    public Elf(String newname) {
	name = newname;
	life = 75;
	strength = 50;
	defense = 5;
	aRate = 5;
    }
    public String about() {
    	return "The Elf is lightly armed and lightly armored but has a very quick attack.";
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
