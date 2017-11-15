public class Zombie extends Monster {
	public Zombie() {
	name = "Mon";
	life = 250;
	strength = (int) (Math.random() * 36) + 15 ; //random value in range [20,65)
	defense = 40;
	aRate = 1;
    }

    public static String about() {
    	return "The Zombie has high defense and health, but has less strength than Werewolves or Vampires.";
    }







}