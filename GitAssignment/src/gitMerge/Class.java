package gitMerge;

public class Class {
	public void Fb(int score) {
		if (score == 99)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		Class tm = new Class();
		tm.Fb(60);
	}
}

