public class Main {
  public static void main(String[] args) {
    System.out.print("年齢 > ");
    int age = 
      new java.util.Scanner(System.in).nextInt();
    String s = (age >= 18) ? "成人" : "未成年";
    System.out.println("あなたは" + s);
  }
}
