public class Main {
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    array = null;
    // 配列本体はガベージコレクションの対象
    array = new int[]{1, 2, 3, 4, 5};
    array[0] = 10;  
    System.out.println(array.length);  // 5
    // 配列 -- lengthプロパティ
    String str = "javaで開発";
    System.out.println(str.length());  // 7
    // 文字列 -- length()メソッド
  }
}
