package Graphs;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i ++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 0);
        addEdge(adj, 2, 0);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 0);
        addEdge(adj, 4, 2);

        BFS ob = new BFS();
        ArrayList<Integer> ans = ob.bfs(adj, V);
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
        System.out.println();
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public ArrayList<Integer> dfs (ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V + 1];
        ArrayList<Integer> ans = new ArrayList<>();
        dfs_recur(0, adj, visited, ans);
        return ans;
    }

    public static void dfs_recur(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> ans) {
        visited[node] = true;
        ans.add(node);
        for (Integer i : adj.get(node)) {
            if (!visited[i]) {
                dfs_recur(i, adj, visited, ans);
            }
        }
    }
}
