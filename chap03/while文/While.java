public class While {
  public static void main(String[] args) {
    int temp = 24;
    while (temp > 25) {
      temp--;
      System.out.println("温度を1度下げました");
    }
    System.out.println("終わります" + temp);
  }
}
