
public class Main {
	public static void main(String[] args) {

		int isHungry = 1;
		String food = "お好み焼き";
		System.out.println("こんにちは");

		String msg = (isHungry == 0) ? "お腹がいっぱいです" : "はらぺこです";
		System.out.println(msg);

		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
			System.out.println("ごちそうさまでした");
		}
		
	}
}
