public class Main {
  public static void main(String[] args) {
    int[] seq = new int[10];
    
    // 10個の中にそれぞれ 0～3 をランダムに格納
    for (int i = 0; i < seq.length; i++) {
      seq[i] = new java.util.Random().nextInt(4);
    }
    
    // 0->A, 1->T, 2->G, 3->C
    for (int i = 0; i < seq.length; i++) {
      switch (seq[i]) {
        case 0 -> {
          System.out.print("A ");
        }
        case 1 -> {
          System.out.print("T ");
        }
        case 2 -> {
          System.out.print("G ");
        }
        case 3 -> {
          System.out.print("C ");
        }
      }
    }
  }
}
