package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back2606 {

  static boolean[][] graph;
  static boolean[] visited;
  static int N, M;
  static int answer;

  public static void main(String[] args) throws IOException {

    // 입력 및 초기화
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    N = Integer.parseInt(br.readLine());
    M = Integer.parseInt(br.readLine());

    graph = new boolean[N + 1][N + 1];

    // graph에 연결 정보 채우기

  }
}
