
public class Main {
	public static void main(String[] args) {

		int isHungry = 1;
		String food = "‚¨D‚İÄ‚«";
		System.out.println("‚±‚ñ‚É‚¿‚Í");

		String msg = (isHungry == 0) ? "‚¨• ‚ª‚¢‚Á‚Ï‚¢‚Å‚·" : "‚Í‚ç‚Ø‚±‚Å‚·";
		System.out.println(msg);

		if (isHungry == 1) {
			System.out.println(food + "‚ğ‚¢‚½‚¾‚«‚Ü‚·");
			System.out.println("‚²‚¿‚»‚¤‚³‚Ü‚Å‚µ‚½");
		}
		
	}
}
