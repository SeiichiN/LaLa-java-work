public class Main {
  public static void main(String[] args) {
    System.out.println("あなたの運勢を占います");
    int fortune = new java.util.Random().nextInt(5) + 1;
    System.out.println(fortune);
    String s = switch (fortune) {
      case 1, 2 -> "大吉";
      case 3 -> "吉";
      default -> "凶"; 
    };  // switch end
    System.out.println(s);
  }  // main end
}  // class end
