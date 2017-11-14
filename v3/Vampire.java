public class Vampire extends Monster {
	public Vampire() {
	name = "Mon";
	life = 100;
	strength = (int) (Math.random() * 66) + 40 ; //random value in range [20,65)
	defense = 20;
	aRate = 2;
    }

    public static String about() {
    	return "The Vampire has high damage, but sacrifices health and defense.";
    }



}