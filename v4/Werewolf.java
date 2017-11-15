public class Werewolf extends Monster {
	public Werewolf() {
	name = "Mon";
	life = 200;
	strength = (int) (Math.random() * 46) + 20 ; //random value in range [20,65)
	defense = 50;
	aRate = 1;
    }

    public static String about() {
    	return "The Werewolf has a good balance of strength and defense.";
    }




}