public class Main {
  public static void main(String[] args) {
    System.out.print("数字を入力 > ");
    String numTxt = 
      new java.util.Scanner(System.in).nextLine();
    int num = Integer.parseInt(numTxt);
    System.out.println("num:" + num);
  }
}
