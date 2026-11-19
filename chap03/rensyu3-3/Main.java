public class Main {
  public static void main(String[] args) {
    System.out.print("0 or 1 > ");
    int isHungry = new java.util.Scanner(System.in).nextInt();
    String food = "ラーメン";
    System.out.println("こんにちは");
    if (isHungry == 0) {
      System.out.println("お腹がいっぱいです");
    } else {
      System.out.println("はらぺこです");
      System.out.println(food + "をいただきます");
      System.out.println("ごちそうさまでした");
    }
    // if (isHungry == 1) {
    //   System.out.println(food + "をいただきます");
    // }
  }
}
