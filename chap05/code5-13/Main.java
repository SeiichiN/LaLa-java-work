public class Main {

  public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
		  array[i]++;
		}
  }
  
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    incArray(array);
    for (int n : array) {
      System.out.print(n + " ");
    }
    System.out.println();
  }
}
