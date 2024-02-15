package dfs;

public class Ch2 {
  public static void main(String[] args) {
    // 이진수 출력 재귀
    Ch2 ch2 = new Ch2();
    ch2.DFS(12);

  }

  void DFS(int n) {

    if (n == 0) {
      return;
    } else {

      DFS(n - 1);
      System.out.println(n % 2);

    }

  }
}
