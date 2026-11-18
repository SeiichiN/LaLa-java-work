public class Main {
  public static void main(String[] args) {
    System.out.println("あなたの運勢を占います");
    int fortune = 1 + new java.util.Random().nextInt(5);
    // System.out.println(fortune);
    switch (fortune) {
      case 1, 2 -> {
        System.out.println("大吉");
      }
      case 3 -> {
        System.out.println("吉");
      }
      default -> {
        System.out.println("凶");
      } 
    }  // switch end
  }  // main end
}  // class end
