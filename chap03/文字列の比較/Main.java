public class Main {
  public static void main(String[] args) {
    System.out.print("yes/no > ");
    String ans = 
      new java.util.Scanner(System.in).nextLine();
    if (ans.equals("yes")) {
      System.out.println("ありがとう");
    } else {
      System.out.println("そうですか");
    }
  }
}
