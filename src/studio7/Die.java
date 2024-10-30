package studio7;

public class Die {
	
	private int sides;
	
	public Die(int n) {
		sides = n;
	}
	public int roll() {
		return (int)(Math.random() * sides + 1);
	}
	
}
