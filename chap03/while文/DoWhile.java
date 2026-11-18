public class DoWhile {
  public static void main(String[] args) {
    int temp = 24;
    do {
      temp--;
      System.out.println("温度を1度下げました");
    } while(temp > 25);
    System.out.println("終わります" + temp);
  }
}
