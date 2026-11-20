public class Main {
  public static void main(String[] args) {
    int[] numbers = {3, 4, 9};
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    
    /*
    String s = switch(input) {
      case 3, 4, 9 -> "アタリ";
      default -> "ハズレ";
    }
    */
    
    int atari = 0;
    for (int n : numbers) {
			if (n == input) {
			  atari = 1;
			}
    }
    if (atari == 1) {
      System.out.println("アタリ");
    } else {
      System.out.println("ハズレ");
    }
  }
}
