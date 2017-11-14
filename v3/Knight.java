public class Knight extends Protagonist {
    public Knight(String newname) {
	name = newname;
	life = 150;
	strength = 25;
	defense = 10;
	aRate = 1;
    }
    public static String about() {
    	return "The Knight is very heavily armored but has a slow attack rate. ";
    }
}