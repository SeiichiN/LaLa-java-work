
public class Main1 {
	public static void main(String[] args) {
		System.out.println("文字を入力");
		String str = new java.util.Scanner(System.in).nextLine();
		if (str.equals("夕日")) {  // 値を比較
			System.out.println("同じです");
		} else {
			System.out.println("違います");
		}
	}
}
