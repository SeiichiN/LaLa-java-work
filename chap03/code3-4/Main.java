public class Main {
  public static void main(String[] args) {
    System.out.println("あなたの運勢を占います");
    int fortune = 1 + new java.util.Random().nextInt(4);
    // System.out.println(fortune);
    switch (fortune) {
      case 1 -> {
        System.out.println("大吉");
      }
      case 2 -> {
        System.out.println("中吉");
      }
      case 3 -> {
        System.out.println("吉");
      }
      case 4 -> {
        System.out.println("凶");
      } 
    }  // switch end
  }  // main end
}  // class end
