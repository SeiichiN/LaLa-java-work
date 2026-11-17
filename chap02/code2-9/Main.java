public class Main {
  public static void main(String[] args) {
    double d = 8.5 / 2;
    long l = 5 + 2L;
    
    System.out.println(d);  // 4.25
    System.out.println(l);  // 7
    
    byte b1 = 4;
    byte b2 = 5;
    byte a = b1 + b2;  // エラー
    // byte a = 9;    // エラーではない
    System.out.println(a);
  }
}
