package dfs.string;

// 문자열 뒤집기
public class Ch1 {
  public static void main(String[] args) {

    String str = "oweifjkdsl";

    StringBuilder sb = new StringBuilder(str);

    sb.reverse();
    System.out.println(sb.toString());

    char[] a = str.toCharArray();
    int left = 0;
    int right = a.length - 1;

    while (left < right) {
      char temp = a[left];
      a[left] = a[right];
      a[right] = temp;

      ++left;
      --right;
    }

    String str1 = String.valueOf(a);
    System.out.println(str1);

  }
}
