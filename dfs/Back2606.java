package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//바이러스는 네트워크를 통해 전파된다
// 한컴퓨터가 바이러스에 걸리면 그컴퓨터와 네트워크상에서 연결되어있는
// 모든 컴퓨터는 바이러스에 걸린다
// N 컴퓨터의 수
// M 간선 정보

public class Back2606 {

  static boolean[][] graph;
  static boolean[] visited;
  static int N, M;
  static int answer;

  public static void dfs(int idx) {
    visited[idx] = true;
    answer++;

    for (int i = 1; i <= N; i++) {
      if (visited[i] == false && graph[idx][i]) {
        dfs(i);
      }

    }
  }

  public static void main(String[] args) throws IOException {

    // 입력 및 초기화
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    N = Integer.parseInt(br.readLine());
    M = Integer.parseInt(br.readLine());

    graph = new boolean[N + 1][N + 1];

    visited = new boolean[N + 1];

    int x, y;
    // graph에 연결 정보 채우기
    for (int i = 0; i < M; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      x = Integer.parseInt(st.nextToken());
      y = Integer.parseInt(st.nextToken());
      graph[x][y] = true;
      graph[y][x] = true;
    }

    // dfs재귀함수 호출
    dfs(1);

    // 출력
    bw.write(String.valueOf(answer - 1));

    br.close();
    bw.close();

  }
}
