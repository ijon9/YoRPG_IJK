public class Elf  extends Protagonist {
    public Elf(String newname) {
	name = newname;
	life = 75;
	strength = 50;
	defense = 5;
	aRate = 5;
    }
    public static String about() {
    	return "The Elf is lightly armed and lightly armored but has a very quick attack.";
    }
}
