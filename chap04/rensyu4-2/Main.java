public class Main {
  public static void main(String[] args) {
    int[] moneyList = {121902, 8302, 55100};
    
    for (int i = 0; i < moneyList.length; i++) {
      System.out.println(moneyList[i]);
    }
    
    for (int a : moneyList) {
      System.out.println(a);
    }
  }
}
