package dfs;

/**
 * ch1
 */
public class Ch1 {

  public static void main(String[] args) {

    Ch1 ch1 = new Ch1();

    ch1.DFS(4);

  }

  public void DFS(int n) {
    if (n == 0) {
      return;
    } else {
      // System.out.println(n);
      DFS(n - 1);
      System.out.println(n);
    }

  }
}