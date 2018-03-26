package gitMergingConflict;


public class Class1 {
	public void Fb(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		Class1 tm = new Class1();
		tm.Fb(60);
	}
}

