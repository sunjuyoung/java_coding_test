package dfs;

public class Ch3 {

  public static void main(String[] args) {
    // 펙토리얼
    Ch3 ch3 = new Ch3();
    ch3.DFS(5);
  }

  public int DFS(int n) {

    if (n == 1) {
      return 1;
    } else {
      return DFS(n - 1) * n;

    }
  }
}
