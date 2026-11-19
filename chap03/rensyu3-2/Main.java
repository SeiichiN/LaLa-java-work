public class Main {
  public static void main(String[] args) {
    // A X
    double cost = 300 * 1.05;
    if (cost == 300 * 1.05) { }
    
    // B X
    if (1 == 3) { }
    
    // C O
    int age = 3;
    if (age != 30) { }
    
    // D O
    if (true) { }
    
    // E O
    int b = 100;
    if (b + 5 < 20) { }
    
    // F X
    boolean isNumeric = false;
    if (isNumeric = true) { }
    // コンパイルエラーにはならない。
    // 避けるべきである。
  }
}
