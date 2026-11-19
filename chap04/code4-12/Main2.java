public class Main2 {
  public static void main(String[] args) {
    int[] seq = new int[10];
    
    // 10個の中にそれぞれ 0～3 をランダムに格納
    for (int i = 0; i < seq.length; i++) {
      seq[i] = new java.util.Random().nextInt(4);
    }
    
    char[] base = {'A', 'T', 'G', 'C'};
    // 0->A, 1->T, 2->G, 3->C
    for (int i = 0; i < seq.length; i++) {
			System.out.print(base[seq[i]] + " ");
    } // for end
  }
}
