
public class Main {
	public static void main(String[] args) {
		System.out.println("‚ ‚È‚½‚Ì‰^¨‚ğè‚¢‚Ü‚·");
		int fortune = new java.util.Random().nextInt(1, 5);
		
		switch (fortune) {
			case  1:
				System.out.println("‘å‹g");
			  break;
			case 2:
				System.out.println("’†‹g");
			  break;
			case 3:
				System.out.println("‹g");
			  break;
			default:
				System.out.println("‹¥");
		}
	}
}
