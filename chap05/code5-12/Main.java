public class Main {

  public static void printArray(int[] array) {
    array[0] = 100;
    for (int element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    printArray(array);
    for (int n : array) {
      System.out.print(n + " ");
    }
    System.out.println();
  }
}
