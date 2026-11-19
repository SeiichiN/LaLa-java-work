public class Main2 {
  public static void main(String[] args) {
    System.out.print
        ("[メニュー] 1:検索 2:登録 3:削除 4:変更 > ");
    int selected = 
        new java.util.Scanner(System.in).nextInt();
    String s = switch (selected) {
      case 1 -> "検索します";
      case 2 -> "登録します";
      case 3 -> "削除します";
      case 4 -> "変更します";
      default -> "";
    };
    System.out.println(s);
  }
}
