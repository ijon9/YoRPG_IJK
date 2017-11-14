public class Wizard extends Protagonist {
    public Wizard(String newname) {
	name = newname;
	life = 50;
	strength = 75;
	defense = 2;
	aRate = 2;
    }
        public static String about() {
    	return "The Wizard is extremely powerful but has very low health and defense.";
    }
}